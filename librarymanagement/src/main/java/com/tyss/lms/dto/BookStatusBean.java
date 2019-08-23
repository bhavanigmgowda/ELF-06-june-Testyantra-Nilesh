package com.tyss.lms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;
@JsonRootName(value = "book-status-details")
/*
 * @Data
 * 
 * @Entity
 * 
 * @Table(name="BookStatus")
 */
public class BookStatusBean {

	/*
	 * @Id
	 * 
	 * @Column(name="bookId") private int bookId;
	 * 
	 * @Column(name="remainingBooks") private int remainingBooks;
	 */
}
