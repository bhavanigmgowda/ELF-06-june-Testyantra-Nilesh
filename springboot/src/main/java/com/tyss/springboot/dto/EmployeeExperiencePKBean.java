package com.tyss.springboot.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@Embeddable
public class EmployeeExperiencePKBean implements Serializable {
	//@XmlTransient
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "ID")
	private EmployeeInfoBean infoBean;
	@Column(name = "COMPANY_NM")
	private String comapnyName;
	
	
	
	public EmployeeInfoBean getInfoBean() {
		return infoBean;
	}
	public String getComapnyName() {
		return comapnyName;
	}
	public void setInfoBean(EmployeeInfoBean infoBean) {
		this.infoBean = infoBean;
	}
	public void setComapnyName(String comapnyName) {
		this.comapnyName = comapnyName;
	}

	
	
}
