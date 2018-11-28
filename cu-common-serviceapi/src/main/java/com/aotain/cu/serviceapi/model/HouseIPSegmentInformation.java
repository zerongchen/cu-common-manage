package com.aotain.cu.serviceapi.model;

import java.io.Serializable;
import java.util.Objects;

import com.aotain.cu.annotation.Export;

public class HouseIPSegmentInformation extends BaseModel implements Serializable {
	
	private static final long serialVersionUID = -2775018508225891311L;

	private Long houseSeqId;

	private String ipSegNo;

	private Long ipSegId;
			
	private Long houseId; //机房ID
		
	@Export(title="起始IP地址", id=2)
	private String startIP; //起始IP地址
	
	@Export(title="终止IP地址", id=3)
	private String endIP; //终止IP地址
	
	private String startIPStr; //起始IP地址对应的IPv6标准格式数据
	
	private String endIPStr; //终止IP地址对应的IPv6标准格式数据
	
	private Integer ipType; //IP地址使用方式（0-静态、1-动态，2-保留）
	
	@Export(title="使用人的单位名称", id=5)
	private String userName; //使用人(个人名字or单位名称）
	
	private Integer idType; //使用人的证件类型
	
	private String idNumber; //对应证件号码
	
	@Export(title="分配使用日期", id=6)
	private String useTime; //分配使用时间  
	
	private String sourceUnit; //来源单位
	
	private String allocationUnit; //分配单位
	private String houseName;

	public Long getIpSegId() {
		return ipSegId;
	}

	public Long getHouseId() {
		return houseId;
	}

	public String getStartIP() {
		return startIP;
	}

	public String getEndIP() {
		return endIP;
	}
	
	public String getStartIPStr() {
		return startIPStr;
	}

	public String getEndIPStr() {
		return endIPStr;
	}

	public void setStartIPStr(String startIPStr) {
		this.startIPStr = startIPStr;
	}

	public void setEndIPStr(String endIPStr) {
		this.endIPStr = endIPStr;
	}

	public Integer getIpType() {
		return ipType;
	}

	public String getUserName() {
		return userName;
	}

	public Integer getIdType() {
		return idType;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public String getUseTime() {
		return useTime;
	}

	public String getSourceUnit() {
		return sourceUnit;
	}

	public String getAllocationUnit() {
		return allocationUnit;
	}

	public void setIpSegId(Long ipSegId) {
		this.ipSegId = ipSegId;
	}

	public void setHouseId(Long houseId) {
		this.houseId = houseId;
	}

	public void setStartIP(String startIP) {
		this.startIP = startIP;
	}

	public void setEndIP(String endIP) {
		this.endIP = endIP;
	}

	public void setIpType(Integer ipType) {
		this.ipType = ipType;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setIdType(Integer idType) {
		this.idType = idType;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public void setUseTime(String useTime) {
		this.useTime = useTime;
	}

	public void setSourceUnit(String sourceUnit) {
		this.sourceUnit = sourceUnit;
	}

	public void setAllocationUnit(String allocationUnit) {
		this.allocationUnit = allocationUnit;
	}

	public String getIpSegNo() {
		return ipSegNo;
	}

	public void setIpSegNo(String ipSegNo) {
		this.ipSegNo = ipSegNo;
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
		HouseIPSegmentInformation that = (HouseIPSegmentInformation) o;
		return Objects.equals(ipSegId, that.ipSegId);
	}

	@Override
	public int hashCode() {

		return Objects.hash(ipSegId);
	}

	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
}
