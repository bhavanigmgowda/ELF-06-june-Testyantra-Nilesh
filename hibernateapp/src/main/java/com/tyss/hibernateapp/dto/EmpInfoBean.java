package com.tyss.hibernateapp.dto;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Check;

import lombok.Data;

@Data
@Entity
@Table(name="emp_info")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY) 
public class EmpInfoBean {
	 @Id
	 @Column(name="eid")
     private int eid;
	 @Column(name="name")
     private String name;
	 @Column(name="email")
     private String email;
}
