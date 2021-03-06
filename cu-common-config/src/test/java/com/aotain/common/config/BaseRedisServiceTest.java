package com.aotain.common.config;

import com.aotain.common.config.dao.IdcJcdmJkcsMapper;
import com.aotain.common.config.model.IdcJcdmJkcs;
import com.aotain.common.config.redis.BaseRedisDao;
import com.aotain.common.config.redis.BaseRedisService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import java.util.List;

/**
 * Demo class
 *
 * @author daiyh@aotain.com
 * @date 2017/11/14
 */
public class BaseRedisServiceTest extends BaseTest{

    @Autowired
    private BaseRedisDao baseRedisDao;

    @Autowired
    private BaseRedisService baseRedisServiceImpl;

    @Autowired
    private IdcJcdmJkcsMapper idcJcdmJkcsMapper;

    private static final String IDC_JDCM_JKCS_CONFIG = "idc_jdcm_jkcs_config";

    @Test
    @Rollback(false)
    public void test(){
        baseRedisServiceImpl.putHash("aotainConfig","cs_key","cs_value");
        System.out.println("=====");
    }


    @Test
    @Rollback(false)
    public void initConfig(){
        List<IdcJcdmJkcs> idcJcdmJkcsList = idcJcdmJkcsMapper.selectConfig();
        if(idcJcdmJkcsList.isEmpty()){
            return;
        }
        //将查询的配置信息保存到redis中
        for(IdcJcdmJkcs idcJcdmJkcs:idcJcdmJkcsList){
            baseRedisServiceImpl.putHash(IDC_JDCM_JKCS_CONFIG,idcJcdmJkcs.getCsKey(),idcJcdmJkcs.getCsValue());
        }
    }

    @Test
    public void testGetDataFromHash(){
        String value = (String)baseRedisServiceImpl.getHash(IDC_JDCM_JKCS_CONFIG,"version");
        System.out.println("======="+value);
    }

    @Test
    public void testStringIncr(){

        baseRedisServiceImpl.putString("abc","5");
        baseRedisServiceImpl.incr("abc");
        String result = (String)baseRedisServiceImpl.getString("abc");
        System.out.println("result==="+result);
//        baseRedisServiceImpl.incr("abc");
//        long abcd = (Long)baseRedisServiceImpl.getString("abc");
//        System.out.println("result==="+abcd);
    }

    @Test
    public void testHashIncr(){
        baseRedisServiceImpl.putHash("abcd","efg","5");
        long result = baseRedisServiceImpl.hincrByHash("abcd","efg",2L);
        System.out.println("result==="+result);
    }

    @Test
    public void testGetHashValueByHashKey(){
        String result = (String)LocalConfig.getInstance().getHashValueByHashKey("password");
        System.out.println("result=="+result);
    }

    @Test
    public void testTopic(){
        IdcJcdmJkcs idcJcdmJkcs = new IdcJcdmJkcs();
        idcJcdmJkcs.setId(10010);
        idcJcdmJkcs.setCsKey("bang");
        idcJcdmJkcs.setCsValue("abcd");
        baseRedisServiceImpl.sendMessage("hello-channel2","abcd");
        System.out.println("========Done");
    }

    @Test
    public void testListOp(){
        String message = (String)baseRedisServiceImpl.getHash("exception_redis_key","isms_db_exception");
        System.out.println("========="+message);
        String message2 = (String) baseRedisServiceImpl.getHash("exception_redis_key","job_db_exception");
        System.out.println("========="+message2);
    }

    @Test
    public void testLPush(){
        String value = "{\"messageType\": 211,\"ip\": \"192.168.50.156\",\"softwareVersion\": 9999,\"probeType\": 1,\"deploySiteName\": \"EU-YF-IDC-01\",\"idcHouseId\": \"BJ-010-IDC\",\"deployMode\": 1,\"totalCapability\": 20,\n" +
                "\"slotNum\": 15,\"preProcSlotNum\": 4,\"analysisSlotNum\": 8,\"gPSlotNum\": 3,\"portsType\": [{\"portType\": 1,\"ports\": [{\"portNo\": 433,\"portDescription\": \"dsadas\",\"mLinkID\": 2000,\"mLinkDesc\": \"aaaaa\"},{\"portNo\": 54,\"portDescription\": \"dsf\",\"mLinkID\": 1000,\"mLinkDesc\": \"bbbbb\"}]}]}";
        baseRedisServiceImpl.rightPush("Strategy_1_211",value);

    }

    @Test
    public void addStrategyData(){
        String value = "{\"messageType\": 212,\"ip\": \"192.168.50.156\",\"totalPorts\": [{\"portNo\": 8787,\"portInfo\": \"22\",\"portUsage\": 30}],\"totalCPU\": [{\"cpuNo\": 8787,\"cpuUsage\": 30}]}";
        baseRedisServiceImpl.rightPush("Strategy_1_212",value);
    }

}
