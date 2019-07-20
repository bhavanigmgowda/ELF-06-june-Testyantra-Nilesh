package com.tyss.emp.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "training_info")
public class TrainingInfoBean implements Serializable {

	@Id
	@Column(name = "COURSE_ID")
	private int courseID;
	@Column(name = "COURSE_NAME")
	private String CourseName;
	@Column(name = "DURATION")
	private int duration;
	@Column(name = "TYPE")
	private String courseType;

	@ManyToMany(cascade = CascadeType.ALL)
	// table created by hibernate
	@JoinTable(name = "Employee_TrainingInfo", joinColumns = { @JoinColumn(name = "COURSE_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "ID") })

	List<EmployeeInfoBean> infoBeans;

	public int getCourseID() {
		return courseID;
	}

	public String getCourseName() {
		return CourseName;
	}

	public int getDuration() {
		return duration;
	}

	public String getCourseType() {
		return courseType;
	}

	public List<EmployeeInfoBean> getInfoBeans() {
		return infoBeans;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public void setInfoBeans(List<EmployeeInfoBean> infoBeans) {
		this.infoBeans = infoBeans;
	}
	
	
	
	

}// End of Class
