package com.tyss.emp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "dapartment_info")
public class DepartmentInfoBean {

	@Id
	@Column(name = "DEPT_ID")
	private int deptID;
	@Column(name = "DEPT_NAME")
	private String deptName;

}
