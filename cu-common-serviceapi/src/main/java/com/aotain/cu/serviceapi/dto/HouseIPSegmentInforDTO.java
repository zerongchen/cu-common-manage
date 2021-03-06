package com.aotain.cu.serviceapi.dto;

import java.io.Serializable;
import java.util.Objects;

import com.aotain.cu.annotation.ExpSheet;
import com.aotain.cu.annotation.Export;
import com.aotain.cu.serviceapi.model.HouseIPSegmentInformation;

@ExpSheet(name="机房IP地址段信息")
public class HouseIPSegmentInforDTO extends HouseIPSegmentInformation implements Serializable {

	private static final long serialVersionUID = 8989523692335871139L;
	
	@Export(title="机房名称", id=1)
	private String houseName; //机房名称
	
	@Export(title="IP地址使用方式", id=4)
	private String ipTypeStr; //IP地址使用方式（0-静态、1-动态，2-保留）

	private String preEndIP;//变更前结束IP地址

	private Integer dealFlagHouse;//机房主体处理状态
	private String startDate;//查询开始时间

	private String endDate;//查询结束时间

	private String unitName;//单位名称（用于用户详情页面查询）
	
	private Long rptIpSegId;
	
	private Long rptHouseId; 
		
	private String rptStartIP; 
	
	private String rptEndIP; 
	
	private String rptStartIPStr; 
	
	private String rptEndIPStr; 
	
	private Integer rptIpType; 
	
	private String rptUserName;
	
	private Integer rptIdType; 
	
	private String rptIdNumber; 
	
	private String rptUseTime; 
	
	private String rptSourceUnit;
	
	private String rptAllocationUnit;

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getPreEndIP() {
		return preEndIP;
	}

	public void setPreEndIP(String preEndIP) {
		this.preEndIP = preEndIP;
	}

	public String getHouseName() {
		return houseName;
	}

	public String getIpTypeStr() {
		return ipTypeStr;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public void setIpTypeStr(String ipTypeStr) {
		this.ipTypeStr = ipTypeStr;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Integer getDealFlagHouse() {
		return dealFlagHouse;
	}

	public void setDealFlagHouse(Integer dealFlagHouse) {
		this.dealFlagHouse = dealFlagHouse;
	}

	public Long getRptIpSegId() {
		return rptIpSegId;
	}

	public Long getRptHouseId() {
		return rptHouseId;
	}

	public String getRptStartIP() {
		return rptStartIP;
	}

	public String getRptEndIP() {
		return rptEndIP;
	}

	public String getRptStartIPStr() {
		return rptStartIPStr;
	}

	public String getRptEndIPStr() {
		return rptEndIPStr;
	}

	public Integer getRptIpType() {
		return rptIpType;
	}

	public String getRptUserName() {
		return rptUserName;
	}

	public Integer getRptIdType() {
		return rptIdType;
	}

	public String getRptIdNumber() {
		return rptIdNumber;
	}

	public String getRptUseTime() {
		return rptUseTime;
	}

	public String getRptSourceUnit() {
		return rptSourceUnit;
	}

	public String getRptAllocationUnit() {
		return rptAllocationUnit;
	}

	public void setRptIpSegId(Long rptIpSegId) {
		this.rptIpSegId = rptIpSegId;
	}

	public void setRptHouseId(Long rptHouseId) {
		this.rptHouseId = rptHouseId;
	}

	public void setRptStartIP(String rptStartIP) {
		this.rptStartIP = rptStartIP;
	}

	public void setRptEndIP(String rptEndIP) {
		this.rptEndIP = rptEndIP;
	}

	public void setRptStartIPStr(String rptStartIPStr) {
		this.rptStartIPStr = rptStartIPStr;
	}

	public void setRptEndIPStr(String rptEndIPStr) {
		this.rptEndIPStr = rptEndIPStr;
	}

	public void setRptIpType(Integer rptIpType) {
		this.rptIpType = rptIpType;
	}

	public void setRptUserName(String rptUserName) {
		this.rptUserName = rptUserName;
	}

	public void setRptIdType(Integer rptIdType) {
		this.rptIdType = rptIdType;
	}

	public void setRptIdNumber(String rptIdNumber) {
		this.rptIdNumber = rptIdNumber;
	}

	public void setRptUseTime(String rptUseTime) {
		this.rptUseTime = rptUseTime;
	}

	public void setRptSourceUnit(String rptSourceUnit) {
		this.rptSourceUnit = rptSourceUnit;
	}

	public void setRptAllocationUnit(String rptAllocationUnit) {
		this.rptAllocationUnit = rptAllocationUnit;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		HouseIPSegmentInformation that = (HouseIPSegmentInformation) o;
		return Objects.equals(getStartIP(), that.getStartIP()) &&
				Objects.equals(getEndIP(), that.getEndIP());
	}

	@Override
	public int hashCode() {

		return Objects.hash(getStartIP());
	}
}
