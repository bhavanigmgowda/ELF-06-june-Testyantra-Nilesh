package com.tyss.emp.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import lombok.Data;

@Data
@Embeddable
public class EmployeeEducationInfoPkBean {

	@ManyToOne
	@JoinColumn(name = "ID")
	private EmployeeInfoBean infoBean;
	@Column(name = "EDUCATION_TYPE")
	private String educationType;


}
