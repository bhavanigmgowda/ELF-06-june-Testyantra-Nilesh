package com.tyss.emp.dto;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "employee_otherinfo")
public class EmployeeOtherInfoBean implements Serializable {

	@Id
	@OneToOne
	@JoinColumn(name = "ID")
	private EmployeeInfoBean infoBean;

	@Column(name = "ISMARRIED")
	private boolean ismarried;
	@Column(name = "PAN")
	private String pan;
	@Column(name = "BLOOD_GROUP")
	private String blood_grp;
	@Column(name = "ISCHALLENGED")
	private boolean isChallenged;
	@Column(name = "EMERGENCY_CONTACT_NUMBER")
	private long emergency_contact_number;
	@Column(name = "EMERGENCY_CONTACT_NAME")
	private String emergency_contact_name;
	@Column(name = "NATIONALITY")
	private String nationality;
	@Column(name = "RELIGION")
	private String religion;
	@Column(name = "FATHER_NM")
	private String father_name;
	@Column(name = "MOTHER_NM")
	private String mother_name;
	@Column(name = "SPOUSE_NM")
	private String spouse_NM;

	@Column(name = "PASSPORT")
	private long passport;
	@Column(name = "ADHAR")
	private long adhar;
	
	
	public EmployeeInfoBean getInfoBean() {
		return infoBean;
	}
	public boolean isIsmarried() {
		return ismarried;
	}
	public String getPan() {
		return pan;
	}
	public String getBlood_grp() {
		return blood_grp;
	}
	public boolean isChallenged() {
		return isChallenged;
	}
	public long getEmergency_contact_number() {
		return emergency_contact_number;
	}
	public String getEmergency_contact_name() {
		return emergency_contact_name;
	}
	public String getNationality() {
		return nationality;
	}
	public String getReligion() {
		return religion;
	}
	public String getFather_name() {
		return father_name;
	}
	public String getMother_name() {
		return mother_name;
	}
	public String getSpouse_NM() {
		return spouse_NM;
	}
	public long getPassport() {
		return passport;
	}
	public long getAdhar() {
		return adhar;
	}
	public void setInfoBean(EmployeeInfoBean infoBean) {
		this.infoBean = infoBean;
	}
	public void setIsmarried(boolean ismarried) {
		this.ismarried = ismarried;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public void setBlood_grp(String blood_grp) {
		this.blood_grp = blood_grp;
	}
	public void setChallenged(boolean isChallenged) {
		this.isChallenged = isChallenged;
	}
	public void setEmergency_contact_number(long emergency_contact_number) {
		this.emergency_contact_number = emergency_contact_number;
	}
	public void setEmergency_contact_name(String emergency_contact_name) {
		this.emergency_contact_name = emergency_contact_name;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}
	public void setSpouse_NM(String spouse_NM) {
		this.spouse_NM = spouse_NM;
	}
	public void setPassport(long passport) {
		this.passport = passport;
	}
	public void setAdhar(long adhar) {
		this.adhar = adhar;
	}
	
	
	

}// end of class
