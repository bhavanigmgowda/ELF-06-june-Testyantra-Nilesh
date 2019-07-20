package com.tyss.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "dapartment_info")
public class DepartmentInfoBean implements Serializable {

	@Id
	@Column(name = "DEPT_ID")
	private int deptID;
	@Column(name = "DEPT_NAME")
	private String deptName;
}
