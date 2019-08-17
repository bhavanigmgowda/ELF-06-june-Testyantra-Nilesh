package com.tyss.springboot.dto;

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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

//@XmlRootElement(name = "employee-info-bean")
@JsonRootName(value = "employee-info-bean")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Data
@Table(name = "employee_info")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property ="id")
public class EmployeeInfoBean implements Serializable {
    
	//jsongenrator used to avoid not get whole obj mangrid only get id of manager 

	@Id
	@Column(name = "ID")
	private int id;
	//@XmlElement(name="age")
	
	@Column(name = "AGE")
	private int age;
	
	//@XmlElement(name="name")
	@JsonProperty(value="name")
	@Column(name = "NAME")
	private String name;
	//@XmlAttribute(name="gender")
	@JsonProperty(value="gender")
	@Column(name = "GENDER")
	private String gender;
	//@XmlElement(name="salary")
	@JsonProperty(value="salary")
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

	//@XmlElement(name = "department-Info-Bean")
	@JsonProperty(value="department-Info-Bean")
	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToOne // (cascade=CascadeType.ALL)
	@JoinColumn(name = "DEPT_ID", referencedColumnName = "DEPT_ID")
	private DepartmentInfoBean departmentInfoBean;

	// many to one relation for manager-id
	//@XmlElement(name = "manager-Id")
	@JsonProperty(value="manager-Id")
	
	@ManyToOne//(cascade = CascadeType.PERSIST)
	@JoinColumn(name ="MNGR_ID", referencedColumnName = "ID")
	@LazyCollection(LazyCollectionOption.FALSE)
	private EmployeeInfoBean managerId;

	//@XmlElement(name = "other-Info")
	@JsonProperty(value="otherInfo")
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "infoBean" )
	private EmployeeOtherInfoBean otherInfo;
    
	//@XmlElement(name = "address-Info-Bean")
	@JsonProperty(value="address-Info-Bean")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "addressPkBean.infoBean")
	private List<EmployeeAddressInfo> addressInfoBean;

	//@XmlElement(name = "educational-Info-Beans")
	@JsonProperty(value="educational-Info-Beans")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "educationInfoPKBean.infoBean")
	private List<EmployeeEducationInfo> educationalInfoBeans;

	//@XmlElement(name = "exp-Info-Bean")
	@JsonProperty(value="exp-Info-Bean")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employeeExperiencePKBean.infoBean")
	private List<EmployeeExperienceInfo> expInfoBean;

	//@XmlElement(name = "training-Info-Beans")
	@JsonProperty(value="training-Info-Beans")
	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "infoBeans")
	private List<TrainingInfoBean> trainingInfoBeans;

	// getter Setter

	
	

}
