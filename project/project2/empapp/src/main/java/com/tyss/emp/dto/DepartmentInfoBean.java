package com.tyss.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Entity(name = "dapartment_info")
public class DepartmentInfoBean implements Serializable {

	
	@Id
	@Column(name = "DEPT_ID")
	private int deptID;
	@Column(name = "DEPT_NAME")
	private String deptName;
	
	public int getDeptID() {
		return deptID;
	}
	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
}
