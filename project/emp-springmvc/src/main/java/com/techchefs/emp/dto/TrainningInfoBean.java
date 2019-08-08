package com.techchefs.emp.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name="training_info")
@ToString
public class TrainningInfoBean implements Serializable{
	
	@Id
	@Column(name="COURSE_ID")
	private int courseId;
	
	@Column(name="COURSE_NAME")
	private String name;
	
	@Column(name="DURATION")
	private String duration;
	
	@Column(name="TYPE")
	private String type;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Employee_trainingInfo",
				joinColumns = {@JoinColumn(name="COURSE_ID")},
				inverseJoinColumns = {@JoinColumn(name="ID")})
	List<EmployeeInfoBean> infoBeans ;

}
