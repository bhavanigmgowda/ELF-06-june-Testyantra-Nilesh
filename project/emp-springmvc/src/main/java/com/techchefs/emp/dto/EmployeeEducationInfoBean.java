package com.techchefs.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_education_info")
public class EmployeeEducationInfoBean implements Serializable{
	
	
	@EmbeddedId
	private EmployeeEducationPKBean eduPkBean;
	
	@Column(name="COLLAGE_NAME")
	private String college_name;
	
	@Column(name="UNIVERSITY")
	private String university;
	
	@Column(name="YOP")
	private String yop;
	
	@Column(name="PERCENTAGE")
	private double percentage;
	
	@Column(name="LOCATION")
	private String location;

	@Column(name="DEGREE_TYPE")
	private String degree_type;
	
	@Column(name="BRANCH")
	private String branch;
	
	


}
