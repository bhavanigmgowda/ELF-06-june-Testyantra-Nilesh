package com.tyss.emp.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
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

}
