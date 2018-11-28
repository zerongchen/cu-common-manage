package com.aotain.common.policyapi.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.aotain.common.policyapi.base.BaseVo;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class IdcIsmsCfgFlowupload extends BaseVo{

    @JSONField(serialize = false)
    private Long seqId;

    private Integer packetType;

    private Integer packetSubtype;

    private Integer method;
    @JSONField(serialize = false)
    private Date createTime;
    @JSONField(name="reportServers")
    private List<IdcIsmsCfgFlowUploadServer> idcIsmsCfgFlowUploadServerList;
    @JSONField(serialize = false)
    private Long userId;

}