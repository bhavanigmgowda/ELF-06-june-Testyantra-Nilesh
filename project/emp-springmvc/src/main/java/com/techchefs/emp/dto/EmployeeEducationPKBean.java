package com.techchefs.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Embeddable
public class EmployeeEducationPKBean implements Serializable{

	@ManyToOne
	@JoinColumn(name="ID")
	private EmployeeInfoBean bean;
	
	@Column(name="EDUCATION_TYPE")
	private String education_type;
	
}
