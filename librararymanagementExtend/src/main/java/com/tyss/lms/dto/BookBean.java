package com.tyss.lms.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@JsonRootName(value = "book-details")

@Entity
@Table(name = "bookDetails")
public class BookBean {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bookId")
	private int bookid;

	@Column(name = "bookName")
	private String bookname;

	@Column(name = "categeory")
	private String categeory;

	@Column(name = "author")
	private String author;

	@Column(name = "language")
	private String language;

	@Column(name = "price")
	private String price;

	@Column(name = "noofCopies")
	private int noofCopies;

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getCategeory() {
		return categeory;
	}

	public void setCategeory(String categeory) {
		this.categeory = categeory;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getNoofCopies() {
		return noofCopies;
	}

	public void setNoofCopies(int noofCopies) {
		this.noofCopies = noofCopies;
	}

}
