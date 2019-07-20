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
@Data
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

}// End of Class
