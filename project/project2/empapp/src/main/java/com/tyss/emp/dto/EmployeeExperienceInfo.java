package com.tyss.emp.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

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
	public void setEmployeeExperiencePKBean(EmployeeExperiencePKBean employeeExperiencePKBean) {
		this.employeeExperiencePKBean = employeeExperiencePKBean;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public Date getLeavingDate() {
		return leavingDate;
	}
	public void setLeavingDate(Date leavingDate) {
		this.leavingDate = leavingDate;
	}
	
	

}
