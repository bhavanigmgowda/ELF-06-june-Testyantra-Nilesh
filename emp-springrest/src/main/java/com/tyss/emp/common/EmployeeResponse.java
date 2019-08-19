package com.tyss.emp.common;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.tyss.emp.dto.EmployeeInfoBean;

import lombok.Data;

@JsonRootName("employee-response")
public class EmployeeResponse {
	@JsonProperty("status-Code")
	private int statusCode;
	
	private String msg;

	private String description;
	@JsonProperty("data")
	private List<EmployeeInfoBean> bean;

	public int getStatusCode() {
		return statusCode;
	}

	public String getMsg() {
		return msg;
	}

	public String getDescription() {
		return description;
	}

	public List<EmployeeInfoBean> getBean() {
		return bean;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setBean(List<EmployeeInfoBean> bean) {
		this.bean = bean;
	}

}
