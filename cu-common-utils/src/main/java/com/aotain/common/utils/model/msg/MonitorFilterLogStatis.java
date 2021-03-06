package com.aotain.common.utils.model.msg;

public class MonitorFilterLogStatis {

	/**
	 * 所属任务ID
	 */
	private long toptaskid;
	/**
	 * 数据类型，1=接收;2=处理;3=导出
	 */
	private int datatype;
	/**
	 * 记录数
	 */
	private long recordcount;	
	/**
	 * 创建时间， UTC格式
	 */
	private long createtime;
	/**
	 * EU厂商
	 */
	private String euVendor;
	/**
	 * EU发送IP
	 */
	private String sendIp;
	/**
	 * 日志日期
	 */
	private String dt;
	/**
	 * 日志类型
	 */
	private String logType;
	
	public long getToptaskid() {
		return toptaskid;
	}
	public int getDatatype() {
		return datatype;
	}
	public long getRecordcount() {
		return recordcount;
	}
	public long getCreatetime() {
		return createtime;
	}
	public void setToptaskid(long toptaskid) {
		this.toptaskid = toptaskid;
	}
	public void setDatatype(int datatype) {
		this.datatype = datatype;
	}
	public void setRecordcount(long recordcount) {
		this.recordcount = recordcount;
	}
	public void setCreatetime(long createtime) {
		this.createtime = createtime;
	}
	public String getEuVendor() {
		return euVendor;
	}
	public String getSendIp() {
		return sendIp;
	}
	public String getDt() {
		return dt;
	}
	public void setEuVendor(String euVendor) {
		this.euVendor = euVendor;
	}
	public void setSendIp(String sendIp) {
		this.sendIp = sendIp;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	public String getLogType() {
		return logType;
	}
	public void setLogType(String logType) {
		this.logType = logType;
	}
	@Override
	public String toString() {
		return "MonitorFilterLogStatis [toptaskid=" + toptaskid + ", datatype="
				+ datatype + ", recordcount=" + recordcount + ", createtime="
				+ createtime + ", euVendor=" + euVendor + ", sendIp=" + sendIp
				+ ", dt=" + dt + ", logType=" + logType + "]";
	}
	
}
