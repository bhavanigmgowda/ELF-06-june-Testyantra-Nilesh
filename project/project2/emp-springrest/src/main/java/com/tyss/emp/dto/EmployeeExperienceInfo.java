package com.tyss.emp.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import lombok.Data;
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "employee_experience_info")
public class EmployeeExperienceInfo implements Serializable {
	@EmbeddedId
	private EmployeeExperiencePKBean employeeExperiencePKBean;

	@Column(name = "DESIGNATION")
	private String Designation;
	@Column(name = "JOINING_DATE")
	private Date joiningDate;
	@Column(name = "LEAVING_DATE")
	private Date leavingDate;
	
	
	
	public EmployeeExperiencePKBean getEmployeeExperiencePKBean() {
		return employeeExperiencePKBean;
	}
	public String getDesignation() {
		return Designation;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public Date getLeavingDate() {
		return leavingDate;
	}
	public void setEmployeeExperiencePKBean(EmployeeExperiencePKBean employeeExperiencePKBean) {
		this.employeeExperiencePKBean = employeeExperiencePKBean;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public void setLeavingDate(Date leavingDate) {
		this.leavingDate = leavingDate;
	}
	
	

}
