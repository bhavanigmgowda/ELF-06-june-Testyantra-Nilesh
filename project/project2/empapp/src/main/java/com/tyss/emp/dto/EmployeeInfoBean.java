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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.sun.xml.txw2.annotation.XmlElement;

import lombok.Data;

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

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public double getSalary() {
		return salary;
	}

	public long getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getDesignation() {
		return designation;
	}

	public Date getDob() {
		return dob;
	}

	public long getAccount_no() {
		return account_no;
	}

	public Date getJoining_date() {
		return joining_date;
	}

	public String getPassword() {
		return password;
	}

	public DepartmentInfoBean getDepartmentInfoBean() {
		return departmentInfoBean;
	}

	public EmployeeInfoBean getManagerId() {
		return managerId;
	}

	public EmployeeOtherInfoBean getOtherInfo() {
		return otherInfo;
	}

	public List<EmployeeAddressInfo> getAddressInfoBean() {
		return addressInfoBean;
	}

	public List<EmployeeEducationInfo> getEducationalInfoBeans() {
		return educationalInfoBeans;
	}

	public List<EmployeeExperienceInfo> getExpInfoBean() {
		return expInfoBean;
	}

	public List<TrainingInfoBean> getTrainingInfoBeans() {
		return trainingInfoBeans;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}

	public void setJoining_date(Date joining_date) {
		this.joining_date = joining_date;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setDepartmentInfoBean(DepartmentInfoBean departmentInfoBean) {
		this.departmentInfoBean = departmentInfoBean;
	}

	public void setManagerId(EmployeeInfoBean managerId) {
		this.managerId = managerId;
	}

	public void setOtherInfo(EmployeeOtherInfoBean otherInfo) {
		this.otherInfo = otherInfo;
	}

	public void setAddressInfoBean(List<EmployeeAddressInfo> addressInfoBean) {
		this.addressInfoBean = addressInfoBean;
	}

	public void setEducationalInfoBeans(List<EmployeeEducationInfo> educationalInfoBeans) {
		this.educationalInfoBeans = educationalInfoBeans;
	}

	public void setExpInfoBean(List<EmployeeExperienceInfo> expInfoBean) {
		this.expInfoBean = expInfoBean;
	}

	public void setTrainingInfoBeans(List<TrainingInfoBean> trainingInfoBeans) {
		this.trainingInfoBeans = trainingInfoBeans;
	}
	
	
	
	
	
}
