package com.aotain.common.policyapi.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.aotain.common.policyapi.base.BaseVo;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class IdcIsmsCfgAccessLog extends BaseVo{

    @JSONField(serialize = false)
    private Long commonId;

    private Short accessLogFlag;
//    @JSONField(serialize = false)
//    private Integer operateType;
    @JSONField(serialize = false)
    private Date modifyTime;
    @JSONField(serialize = false)
    private Long userId;

}