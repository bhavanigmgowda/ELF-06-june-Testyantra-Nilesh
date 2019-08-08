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
public class EmployeeAddressPKBean implements Serializable {
	
	
	@ManyToOne
	@JoinColumn(name="ID")
	private EmployeeInfoBean bean;
	
	@Column(name="ADDRESS_TYPE")
	private String address_type;

}
