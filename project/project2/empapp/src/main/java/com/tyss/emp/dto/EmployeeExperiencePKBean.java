package com.tyss.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Embeddable
public class EmployeeExperiencePKBean implements Serializable {

	@ManyToOne
	@JoinColumn(name = "ID")
	private EmployeeInfoBean infoBean;
	@Column(name = "COMPANY_NM")
	private String comapnyName;
	
	
	public EmployeeInfoBean getInfoBean() {
		return infoBean;
	}
	public void setInfoBean(EmployeeInfoBean infoBean) {
		this.infoBean = infoBean;
	}
	public String getComapnyName() {
		return comapnyName;
	}
	public void setComapnyName(String comapnyName) {
		this.comapnyName = comapnyName;
	}

	
	
}
