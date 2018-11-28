package com.aotain.common.config.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aotain.common.config.annotation.MyBatisDao;
import com.aotain.common.config.model.ClusterHouses;
import com.aotain.common.config.model.IdcHouses;
import com.aotain.common.config.model.IdcJcdmJkcs;
import com.aotain.common.config.model.Isms3rdSystemConfig;

@MyBatisDao
public interface IdcJcdmJkcsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CU_V3.IDC_JCDM_JKCS
     *
     * @mbg.generated
     */
    int insert(IdcJcdmJkcs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CU_V3.IDC_JCDM_JKCS
     *
     * @mbg.generated
     */
    int insertSelective(IdcJcdmJkcs record);

    List<IdcJcdmJkcs> selectConfig();

    List<IdcHouses> selectIdcHouses();
    
    List<ClusterHouses> selectClusterHouses();

	Isms3rdSystemConfig selectIsms3rdSystemConfigInfoByIdentify(@Param("systemIdentifier")String systemIdentifier);
    
}