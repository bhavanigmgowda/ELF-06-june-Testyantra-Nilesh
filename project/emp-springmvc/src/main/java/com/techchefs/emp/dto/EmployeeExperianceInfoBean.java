package com.techchefs.emp.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_experience_info")
public class EmployeeExperianceInfoBean implements Serializable{


	
	@EmbeddedId
	private EmployeeExpPKBean pkBean;
	
	@Column(name="DESIGNATION")
	private String designation;
	
	@Column(name="JOINING_DATE")
	private Date joining_date;
	
	@Column(name="LEAVING_DATE")
	private Date leaving_date;

}
