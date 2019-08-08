package com.techchefs.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="employee_otherinfo")
public class EmployeeOtherInfoBean implements Serializable {

	@Id
	@OneToOne
	@JoinColumn(name="ID")
	//@PrimaryKeyJoinColumn(name="ID")
	private EmployeeInfoBean infoBean;
	
	@Column(name="PAN")
	private String pan;
	
	@Column(name="ISMARRIED")
	private String isMarried;
	
	@Column(name="BLOOD_GROUP")
	private String blood_group;
	
	@Column(name="ISCHALLENGED")
	private String ischallenged;
	
	@Column(name="EMERGENCY_CONTACT_NUMBER")
	private long emergency_contact_number;
	
	@Column(name="EMERGENCY_CONTACT_NAME")
	private String emergency_contact_name;
	
	@Column(name="NATIONALITY")
	private String nationality;
	
	@Column(name="RELIGION")
	private String religion;
	
	@Column(name="MOTHER_NM")
	private String mother_nm;
	
	@Column(name="FATHER_NM")
	private String father_nm;
	
	@Column(name="SPOUSE_NM")
	private String spouse_nm;
	
	@Column(name="PASSPORT")
	private String passport;
	
	@Column(name="ADHAR")
	private long adhar;

}
