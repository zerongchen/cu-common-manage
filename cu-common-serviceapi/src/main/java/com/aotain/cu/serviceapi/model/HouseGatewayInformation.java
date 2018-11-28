package com.aotain.cu.serviceapi.model;

import java.io.Serializable;
import java.util.Objects;

import com.aotain.cu.annotation.Export;

public class HouseGatewayInformation extends BaseModel implements Serializable {

	private static final long serialVersionUID = 5617849713230629376L;

	private Long houseSeqId;

	private Long gatewayId; 
	
	private Long houseId; //机房ID
	
	@Export(title="机房互联网出入口带宽(Mbps)", id=3)
	private Long bandWidth; //链路带宽(单位：Mbit/s)
	
	@Export(title="机房出入口网关IP地址", id=4)
	private String gatewayIP; //网关IP地址
	
	private Integer linkType; //链路类型	
		
	private String accessUnit; //链路接入单位信息
	
	@Export(title="链路编号", id=2)
	private String linkNo; //IDC业务机房/ISP业务节点出入口链路编号

	public Long getGatewayId() {
		return gatewayId;
	}

	public Long getHouseId() {
		return houseId;
	}

	public Long getBandWidth() {
		return bandWidth;
	}

	public String getGatewayIP() {
		return gatewayIP;
	}

	public Integer getLinkType() {
		return linkType;
	}

	public String getAccessUnit() {
		return accessUnit;
	}

	public String getLinkNo() {
		return linkNo;
	}

	public void setGatewayId(Long gatewayId) {
		this.gatewayId = gatewayId;
	}

	public void setHouseId(Long houseId) {
		this.houseId = houseId;
	}

	public void setBandWidth(Long bandWidth) {
		this.bandWidth = bandWidth;
	}

	public void setGatewayIP(String gatewayIP) {
		this.gatewayIP = gatewayIP;
	}

	public void setLinkType(Integer linkType) {
		this.linkType = linkType;
	}

	public void setAccessUnit(String accessUnit) {
		this.accessUnit = accessUnit;
	}

	public void setLinkNo(String linkNo) {
		this.linkNo = linkNo;
	}

	public Long getHouseSeqId() {
		return houseSeqId;
	}

	public void setHouseSeqId(Long houseSeqId) {
		this.houseSeqId = houseSeqId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		HouseGatewayInformation that = (HouseGatewayInformation) o;
		return Objects.equals(gatewayId, that.gatewayId);
	}

	@Override
	public int hashCode() {

		return Objects.hash(gatewayId);
	}
}
