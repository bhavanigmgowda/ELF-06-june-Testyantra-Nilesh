package com.tyss.emp.dto;

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
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_info")
public class EmployeeInfoBean implements Serializable {


	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "AGE")
	private int age;
	@Column(name = "NAME")
	private String name;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "SALARY")
	private double salary;
	@Column(name = "PHONE")
	private long phone;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "DESIGNATION")
	private String designation;
	@Column(name = "DOB")
	private Date dob;
	@Column(name = "ACCOUNT_NUMBER")
	private long account_no;
	@Column(name = "JOINING_DATE")
	private Date joining_date;
	@Column(name = "Password")
	private String password;

	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToOne // (cascade=CascadeType.ALL)
	@JoinColumn(name = "DEPT_ID", referencedColumnName = "DEPT_ID")
	private DepartmentInfoBean departmentInfoBean;

	// many to one relation for manager-id
	@ManyToOne
	@JoinColumn(name = "MNGR_ID", referencedColumnName = "ID")
	@LazyCollection(LazyCollectionOption.FALSE)
	private EmployeeInfoBean managerId;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "infoBean")
	private EmployeeOtherInfoBean otherInfo;
	
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "addressPkBean.infoBean")
	private List<EmployeeAddressInfo> addressInfoBean;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "educationInfoPKBean.infoBean")
	private List<EmployeeEducationInfo> educationalInfoBeans;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employeeExperiencePKBean.infoBean")
	private List<EmployeeExperienceInfo> expInfoBean;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "infoBeans")
	private List<TrainingInfoBean> trainingInfoBeans;
}
