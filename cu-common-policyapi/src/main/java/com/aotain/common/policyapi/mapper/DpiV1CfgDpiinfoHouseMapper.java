package com.aotain.common.policyapi.mapper;

import com.aotain.common.config.annotation.MyBatisDao;
import com.aotain.common.policyapi.base.BaseMapper;
import com.aotain.common.policyapi.model.DpiV1CfgDpiinfoHouse;

import java.util.List;

@MyBatisDao
public interface DpiV1CfgDpiinfoHouseMapper extends BaseMapper{

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CU_V4.DPI_V1_CFG_DPIINFO_HOUSE
     *
     * @mbg.generated
     */
    int insertSelective(DpiV1CfgDpiinfoHouse record);

    /**
     * 根据devId查询关联的EuDeviceHouse
     * @param devId
     * @return
     */
    List<String> selectHouseIdListByDevId(long devId);
}