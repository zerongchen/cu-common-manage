package com.aotain.cu.serviceapi.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import com.aotain.cu.serviceapi.dto.AjaxError.Mode;

public class AjaxValidationResult implements Serializable{

	private static final long serialVersionUID = 1L;

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private List<ObjectError> errors = new ArrayList<ObjectError>(0);
	
	private Map<String, Object[]> errorsArgsMap = new LinkedHashMap<String, Object[]>(0);
	private Mode mode = null;
	
	private int flag = 0;

	private String msg;

	private Integer outIndex;

	private Integer innerIndex;

	private Long pid;

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Integer getOutIndex() {
		return outIndex;
	}

	public void setOutIndex(Integer outIndex) {
		this.outIndex = outIndex;
	}

	public Integer getInnerIndex() {
		return innerIndex;
	}

	public void setInnerIndex(Integer innerIndex) {
		this.innerIndex = innerIndex;
	}

	public AjaxValidationResult(){
		
	}
	
	public AjaxValidationResult(List<ObjectError> errors){
		if( errors != null){
			this.errors = errors;
		}
	}
	public AjaxValidationResult(List<ObjectError> errors,int flag){
		if( errors != null){
			this.errors = errors;
		}
		this.flag = flag;
	}
	/**
	 * not use the AjaxError.Mode
	 * @param errors
	 * @param errorsArgsMap
	 */
	public AjaxValidationResult(List<ObjectError> errors, Map<String, Object[]> errorsArgsMap){
		this(errors);
		
		if(errorsArgsMap != null){
			this.errorsArgsMap =errorsArgsMap;
		}
	}

	/**
	 * not use the AjaxError.Mode
	 * @param errors
	 * @param errorsArgsMap
	 */
	public AjaxValidationResult(List<ObjectError> errors, Map<String, Object[]> errorsArgsMap,int flag,String msg){
		this(errors);

		if(errorsArgsMap != null){
			this.errorsArgsMap =errorsArgsMap;
		}
		this.flag = flag;
		this.msg = msg;
	}

	public AjaxValidationResult(List<ObjectError> errors, Map<String, Object[]> errorsArgsMap, Mode mode){
		this(errors, errorsArgsMap);
		this.mode = mode;
	}
	public AjaxValidationResult(BindingResult bindingResult){
		this(bindingResult, null);
	}
	public AjaxValidationResult(BindingResult bindingResult,int flag){
		this(bindingResult, null);
		this.flag = flag;
	}
	/**
	 * use the AjaxError.Mode.MODE2
	 * @param bindingResult
	 * @param errorsArgsMap
	 */
	public AjaxValidationResult(BindingResult bindingResult, Map<String, Object[]> errorsArgsMap){
		this(bindingResult.getAllErrors(), errorsArgsMap);
		this.mode = AjaxError.Mode.MODE2;
	}
	
	public AjaxValidationResult(BindingResult bindingResult, Map<String, Object[]> errorsArgsMap,int flag){
		this(bindingResult.getAllErrors(), errorsArgsMap);
		this.flag = flag;
		this.mode = AjaxError.Mode.MODE2;
	}
	
	public boolean getIsValid() {
		if(errors.size() == 0){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * 判断校验是否成功通过
	 * @return
	 */
	public boolean validateIsSuccess(){
		if (errorsArgsMap==null || errorsArgsMap.size()==0){
			return true;
		}
		return false;
	}

	public int getFlag() {
		return flag;
	}

	public List<AjaxError> getErrors() {
		List<AjaxError> newErrors = new ArrayList<AjaxError>(this.errors.size());
		for (ObjectError objectError: this.errors) {
			AjaxError error = null;
			if(objectError instanceof FieldError){
				FieldError fieldError = (FieldError) objectError;
				Object[] args = this.getArgs(fieldError.getField()) ;
				if(mode == null){
					error = new AjaxError( fieldError, args);
				}else{
					error = new AjaxError( fieldError, args , mode);
				}
			}else{
				error = new AjaxError( objectError);
			}
			logger.debug(String.format("AjaxError:field=(%1$s),errorMessage=(%2$s)", error.getField(), error.getErrorMessage()) );
			newErrors.add( error );
		}
		return newErrors;
	}
	private Object[] getArgs(String field) {
		if(this.errorsArgsMap.containsKey(field)){
			return this.errorsArgsMap.get(field);
		}else
			return null;
	}

	public Map<String, Object[]> getErrorsArgsMap() {
		return errorsArgsMap;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getErrorsToString() {
		StringBuffer errMsg = new StringBuffer("");
		if (errorsArgsMap != null && errorsArgsMap.size() > 0) {
			for (Entry<String, Object[]> maps : errorsArgsMap.entrySet()) {
				Object[] strArr = maps.getValue();
				for (Object str : strArr) {
					errMsg.append((String) str).append(";");
				}
				errMsg.append("\r\n");
			}
		}
		return errMsg.toString();
	}

	@Override
	public String toString() {
		StringBuffer errMsg = new StringBuffer("");
		for(Entry<String, Object[]> maps : errorsArgsMap.entrySet()){
			Object[] strArr = maps.getValue();
			errMsg.append("["+maps.getKey()+":");
			for(Object str :strArr){
				errMsg.append((String)str).append(";");
			}
			errMsg.append("]");
		}
		
		return "AjaxValidationResult{" +
				"errors=" + errors +
				", errorsArgsMap=" + errMsg +
				", mode=" + mode +
				", flag=" + flag +
				'}';
	}
}
