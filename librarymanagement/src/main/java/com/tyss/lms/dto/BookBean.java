package com.tyss.lms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;


@JsonRootName(value = "book-details")
@Data
@Entity
@Table(name="bookDetails")
public class BookBean {
	
	  @Id
	 
	  @Column(name="bookId") 
	  private int bookid;
	  
	  @Column(name="bookName") 
	  private String bookname;
	  
	  @Column(name="categeory") 
	  private String categeory;
	  
	  @Column(name="author") 
	  private String author;
	  
	  @Column(name="language") 
	  private String language;
	 
	  @Column(name="price") 
	  private String price;
	  
	  @Column(name="noofCopies")
	  private int noofCopies;
	  
	 
	
}
