package com.techchefs.emp.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;



@Entity
@Table(name="employee_info")
@Data
public class EmployeeInfoBean implements Serializable {
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "infoBean")
	private EmployeeOtherInfoBean employeeOtherInfoBean;
	
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy ="employeeAddressPKBean.bean" )
	private List<EmployeeAddressInfoBean> addressInfoBean;
	
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy ="eduPkBean.bean" )
	private List<EmployeeEducationInfoBean> employeeEducationInfoBean;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy ="pkBean.bean" )
	private List<EmployeeExperianceInfoBean> employeeExperienceInfoBean;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy ="infoBeans" )
	private List<TrainningInfoBean> trainingInfoBean;
	
	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="AGE")
	private int age;
	
	@Column(name="GENDER")
	private String gender;
	
	@Column(name="SALARY")
	private double salary;
	
	@Column(name="PHONE")
	private long phone;
	
	@Column(name="JOINING_DATE")
	private Date joining_date;
	
	@Column(name="ACCOUNT_NUMBER")
	private long account_number;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="DESIGNATION")
	private String designation;
	
	@Column(name="DOB")
	private Date dob;
	
	@ManyToOne
	@JoinColumn(name="DEPARTMENTID",referencedColumnName = "DEPT_ID")
	private DepartmentInfoBean departmentInfoBean;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="MANAGERID",referencedColumnName = "ID")
	private EmployeeInfoBean managerId;
	
	@Column(name="PASSWORD")
	private String password;
	
	
	
	
	
	

	
	

}
