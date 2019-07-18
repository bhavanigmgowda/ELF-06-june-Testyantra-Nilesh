package com.tyss.hibernateassesment.dto;


import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="customer")
public class CustomerBean {
    @Id
    @Column(name="Id")
	private int Id;
    @Column(name="firstName")
	private String firstName;
    @Column(name="lastName")
	private String lastName;
    @Column(name="contactNumber")
	private long contactNumber;
    @Column(name="address")
	private String address;
    @Column(name="city")
	private String city;
    @Column(name="state")
	private String state;
    @Column(name="country")
	private String country;
}
