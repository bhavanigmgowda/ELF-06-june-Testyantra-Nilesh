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
public class EmployeeExpPKBean implements Serializable{
	
	@ManyToOne
	@JoinColumn(name="ID")
	private EmployeeInfoBean bean;
	
	@Column(name="COMPANY_NM")
	private String company_name;
	

}
