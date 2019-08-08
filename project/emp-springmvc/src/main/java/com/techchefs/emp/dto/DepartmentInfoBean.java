package com.techchefs.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="DEPARTMENT_INFO")
@Data
public class DepartmentInfoBean implements Serializable{
	@Id
	@Column(name="DEPT_ID")
	private int depatmentId;
	
	@Column(name="DEPT_NAME")
	private String departmentName;

}
