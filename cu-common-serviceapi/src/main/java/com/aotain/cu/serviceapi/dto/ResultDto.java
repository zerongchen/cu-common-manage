package com.aotain.cu.serviceapi.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ResultDto implements Serializable {

	public enum ResultCodeEnum {
		// 单条记录操作标识
		SUCCESS(0), ERROR(1),
		// 用于批量操作的标识
		BATCH_OPERATION(2),
		// 前台数据重复校验
		ERROR_CONFLICT(3);
		private Integer code;

		ResultCodeEnum(int code) {
			this.code = code;
		}

		public Integer getCode() {
			return code;
		}
	}

	private static final long serialVersionUID = -6637293920201489039L;

	/**
	 * 结果代码，0-成功, 1-失败
	 */
	private int resultCode;

	/**
	 * 结果描述
	 */
	private String resultMsg;

	/**
	 * 操作码/状态码
	 */
	private int statusCode;

	/**
	 * 校验结果
	 */
	private AjaxValidationResult ajaxValidationResult;

	/**
	 * 批量校验的错误结果
	 */
	private Map<String, AjaxValidationResult> ajaxValidationResultMap = new HashMap<String, AjaxValidationResult>();

	/**
	 * 数据实体id
	 */
	private Integer pid;

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public AjaxValidationResult getAjaxValidationResult() {
		return ajaxValidationResult;
	}

	public void setAjaxValidationResult(AjaxValidationResult ajaxValidationResult) {
		this.ajaxValidationResult = ajaxValidationResult;
	}

	public Map<String, AjaxValidationResult> getAjaxValidationResultMap() {
		return ajaxValidationResultMap;
	}

	public void setAjaxValidationResultMap(Map<String, AjaxValidationResult> ajaxValidationResultMap) {
		this.ajaxValidationResultMap = ajaxValidationResultMap;
	}

	@Override
	public String toString() {
		return "ResponseDto [resultCode=" + resultCode + ", restultMsg=" + resultMsg + "]";
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	/**
	 * 构造器
	 * 
	 * @author liuz@aotian.com
	 * @date 2018年9月29日 下午2:56:27
	 */
	public static class ResultDtoBuilder {
		public static ResultDto createResult(int resultCode, String message) {
			ResultDto result = new ResultDto();
			result.setResultCode(resultCode);
			result.setResultMsg(message);
			return result;
		}

		public static ResultDto createErrorResult(String message) {
			ResultDto result = new ResultDto();
			result.setResultCode(ResultCodeEnum.ERROR.getCode());
			result.setResultMsg(message);
			return result;
		}

		public static ResultDto createSuccessResult(String message) {
			ResultDto result = new ResultDto();
			result.setResultCode(ResultCodeEnum.SUCCESS.getCode());
			result.setResultMsg(message);
			return result;
		}
	}
}
