package com.aotain.cu.serviceapi.dto;

import java.io.Serializable;

import com.aotain.cu.annotation.ExpSheet;
import com.aotain.cu.annotation.Export;
import com.aotain.cu.serviceapi.model.UserInformation;

@ExpSheet(name="客户信息")
public class UserInformationDTO extends UserInformation implements Serializable {

	private static final long serialVersionUID = -939372281946826814L;

	private Integer rptNature;
	/** 单位名称  **/
	private String rptUnitName;
	/** 单位属性  **/
	private Integer rptUnitNature;
	/** 证件类型  **/
	private Integer rptIdType;
	/** 证件号码  **/
	private String rptIdNumber;
	/** 注册时间  **/
	private String rptRegisteTime;
	/** 单位地址  **/
	private String rptUnitAddress;
	/** 邮政编码  **/
	private String rptUnitZipCode;
	/** 网络信息安全责任人姓名 **/
	private String rptOfficerName;
	/** 网络信息安全责任人证件类型 **/
	private Integer rptOfficerIdType;
	/** 网络信息安全责任人证件号码 **/
	private String rptOfficerId;
	/** 网络信息安全责任人固定电话 **/
	private String rptOfficerTelphone;
	/** 网络信息安全责任人移动电话 **/
	private String rptOfficerMobile;
	/** 网络信息安全责任人Email **/
	private String rptOfficerEmail;
	/** 服务开通日期 **/
	private String rptServiceRegTime;

	@Export(title="经营者名称", id=2)
	private String providerName; //经营者名称

	private String startDate;//查询开始时间

	private String endDate;//查询结束时间
	
	private Integer cover;//1-覆盖,2-不覆盖
	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public Integer getRptNature() {
		return rptNature;
	}

	public void setRptNature(Integer rptNature) {
		this.rptNature = rptNature;
	}

	public String getRptUnitName() {
		return rptUnitName;
	}

	public void setRptUnitName(String rptUnitName) {
		this.rptUnitName = rptUnitName;
	}

	public Integer getRptUnitNature() {
		return rptUnitNature;
	}

	public void setRptUnitNature(Integer rptUnitNature) {
		this.rptUnitNature = rptUnitNature;
	}

	public Integer getRptIdType() {
		return rptIdType;
	}

	public void setRptIdType(Integer rptIdType) {
		this.rptIdType = rptIdType;
	}

	public String getRptIdNumber() {
		return rptIdNumber;
	}

	public void setRptIdNumber(String rptIdNumber) {
		this.rptIdNumber = rptIdNumber;
	}

	public String getRptRegisteTime() {
		return rptRegisteTime;
	}

	public void setRptRegisteTime(String rptRegisteTime) {
		this.rptRegisteTime = rptRegisteTime;
	}

	public String getRptUnitAddress() {
		return rptUnitAddress;
	}

	public void setRptUnitAddress(String rptUnitAddress) {
		this.rptUnitAddress = rptUnitAddress;
	}

	public String getRptUnitZipCode() {
		return rptUnitZipCode;
	}

	public void setRptUnitZipCode(String rptUnitZipCode) {
		this.rptUnitZipCode = rptUnitZipCode;
	}

	public String getRptOfficerName() {
		return rptOfficerName;
	}

	public void setRptOfficerName(String rptOfficerName) {
		this.rptOfficerName = rptOfficerName;
	}

	public Integer getRptOfficerIdType() {
		return rptOfficerIdType;
	}

	public void setRptOfficerIdType(Integer rptOfficerIdType) {
		this.rptOfficerIdType = rptOfficerIdType;
	}

	public String getRptOfficerId() {
		return rptOfficerId;
	}

	public void setRptOfficerId(String rptOfficerId) {
		this.rptOfficerId = rptOfficerId;
	}

	public String getRptOfficerTelphone() {
		return rptOfficerTelphone;
	}

	public void setRptOfficerTelphone(String rptOfficerTelphone) {
		this.rptOfficerTelphone = rptOfficerTelphone;
	}

	public String getRptOfficerMobile() {
		return rptOfficerMobile;
	}

	public void setRptOfficerMobile(String rptOfficerMobile) {
		this.rptOfficerMobile = rptOfficerMobile;
	}

	public String getRptOfficerEmail() {
		return rptOfficerEmail;
	}

	public void setRptOfficerEmail(String rptOfficerEmail) {
		this.rptOfficerEmail = rptOfficerEmail;
	}

	public String getRptServiceRegTime() {
		return rptServiceRegTime;
	}

	public void setRptServiceRegTime(String rptServiceRegTime) {
		this.rptServiceRegTime = rptServiceRegTime;
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

	public Integer getCover() {
		return cover;
	}

	public void setCover(Integer cover) {
		this.cover = cover;
	}
	
	
}
