package com.tyss.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import lombok.Data;
@XmlAccessorType(XmlAccessType.FIELD)
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
	public String getCollageName() {
		return collageName;
	}
	public String getUniversity() {
		return university;
	}
	public String getYop() {
		return yop;
	}
	public double getPercentage() {
		return percentage;
	}
	public String getLocation() {
		return location;
	}
	public String getDegreeType() {
		return degreeType;
	}
	public String getBranch() {
		return branch;
	}
	public void setEducationInfoPKBean(EmployeeEducationInfoPkBean educationInfoPKBean) {
		this.educationInfoPKBean = educationInfoPKBean;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public void setYop(String yop) {
		this.yop = yop;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setDegreeType(String degreeType) {
		this.degreeType = degreeType;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	


}
