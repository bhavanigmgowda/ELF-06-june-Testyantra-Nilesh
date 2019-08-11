package com.tyss.emp.dto;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name = "employee_address_info")
public class EmployeeAddressInfo {

	@EmbeddedId
	private EmployeeAddressPKBean addressPkBean;
	@Column(name = "ADDRESS_1")
	private String address1;
	@Column(name = "ADDRESS_2")
	private String address2;
	@Column(name = "LANDMARK")
	private String landmark;
	@Column(name = "STATE")
	private String state;
	@Column(name = "CITY")
	private String city;
	@Column(name = "COUNTRY")
	private String country;
	@Column(name = "PINCODE")
	private int pincode;
}
