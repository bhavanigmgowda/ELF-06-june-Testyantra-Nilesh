package com.tyss.hibernateassesment.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="test")
public class TestDTO {
	
	 @Column(name="firstName")
	 private String firstName;
	 @Column(name="lastName")
	 private String lastName;
	 @Column(name="city")
	 private String city;
}
