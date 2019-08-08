package com.techchefs.emp.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="emp_training")
public class EmpTrainingInfoBean {
	
	private int id;
	private int courseId;

}
