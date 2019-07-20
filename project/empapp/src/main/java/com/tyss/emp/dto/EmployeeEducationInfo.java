package com.tyss.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
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

}
