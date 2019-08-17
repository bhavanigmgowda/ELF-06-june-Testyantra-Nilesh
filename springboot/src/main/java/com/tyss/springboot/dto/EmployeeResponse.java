package com.tyss.springboot.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
@Data
public class EmployeeResponse implements Serializable {

	private int statusCode;
	private String message;
	private String description;
	private List<EmployeeInfoBean> bean;

	
}
