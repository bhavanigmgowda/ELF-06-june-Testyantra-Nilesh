package com.tyss.lms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;
@Data
//@JsonRootName(value = "user-details")
@Entity
@Table(name="UserDetails")
public class UserBean {
     @Id
     @Column(name="id")
	 private int id;
     @Column(name="name")
	 private String  name;
     @Column(name="phone")
	 private long phone;
     @Column(name="password")
	 private String  password;
     @Column(name="usertype")
	 private String  useType; 
     @Column(name="email")
     private String email;
	  

}
