package com.tyss.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "employee_education_info")
public class EmployeeEducationInfo implements Serializable {

	@EmbeddedId
	private EmployeeEducationInfoPkBean educationInfoPKBean;

	@Column(name = "COLLAGE_NM")
	private String collageName;
	@Column(name = "UNIVERSITY")
	private String university;
	@Column(name = "YOP")
	private String yop;
	@Column(name = "PERCENTAGE")
	private double percentage;
	@Column(name = "LOCATION")
	private String location;
	@Column(name = "DEGREE_TYPE")
	private String degreeType;
	@Column(name = "BRANCH")
	private String branch;
	
	
	public EmployeeEducationInfoPkBean getEducationInfoPKBean() {
		return educationInfoPKBean;
	}
	public void setEducationInfoPKBean(EmployeeEducationInfoPkBean educationInfoPKBean) {
		this.educationInfoPKBean = educationInfoPKBean;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getYop() {
		return yop;
	}
	public void setYop(String yop) {
		this.yop = yop;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDegreeType() {
		return degreeType;
	}
	public void setDegreeType(String degreeType) {
		this.degreeType = degreeType;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	

}
