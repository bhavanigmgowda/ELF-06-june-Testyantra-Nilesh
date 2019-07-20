package com.tyss.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "employee_address_info")
public class EmployeeAddressInfo implements Serializable {

	
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

	
	public EmployeeAddressPKBean getAddressPkBean() {
		return addressPkBean;
	}
	public void setAddressPkBean(EmployeeAddressPKBean addressPkBean) {
		this.addressPkBean = addressPkBean;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}
