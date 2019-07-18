package com.tyss.hibernateassesment.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="products")
public class ProductDTO {

	 @Id
	 @Column(name="productID")
	 private int productId;
	 @Column(name="productName")
	 private String productName;
	 @Column(name="price")
	 private double price;
	 @Column(name="colour")
	 private String colour;
	 @Column(name="weight")
	 private double weight;
	 
	 
	 
	 
}
