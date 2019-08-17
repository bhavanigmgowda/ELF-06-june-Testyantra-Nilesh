package com.tyss.springboot.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@Embeddable
@ToString
@Data
public class EmployeeAddressPKBean implements Serializable {
	// @XmlTransient
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "ID")
	private EmployeeInfoBean infoBean;
	@Column(name = "ADDRESS_TYPE")
	private String addressType;

}
