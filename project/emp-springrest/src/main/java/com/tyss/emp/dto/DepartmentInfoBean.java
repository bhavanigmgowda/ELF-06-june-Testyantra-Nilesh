package com.tyss.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import lombok.Data;
@XmlAccessorType(XmlAccessType.FIELD)
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
	public String getDeptName() {
		return deptName;
	}
	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	

}
