package com.tyss.emp.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



import lombok.Data;
import lombok.ToString;

@Data
@Embeddable
@ToString
public class EmployeeAddressPKBean {
	@ManyToOne
	@JoinColumn(name = "ID")
	private EmployeeInfoBean infoBean;
	@Column(name = "ADDRESS_TYPE")
	private String addressType;

}
