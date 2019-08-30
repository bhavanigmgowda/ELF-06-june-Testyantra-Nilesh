package com.tyss.lms.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;

import lombok.Data;

@Data
@Entity
@Table(name="RequestDetails")
@EnableTransactionManagement
public class RequestBean {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int requestId;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "bookid")
	private BookBean bookbean;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "id")
	private UserBean userbean;


	@Column(name = "status")
	private boolean status;


	public int getRequestId() {
		return requestId;
	}


	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}


	public BookBean getBookbean() {
		return bookbean;
	}


	public void setBookbean(BookBean bookbean) {
		this.bookbean = bookbean;
	}


	public UserBean getUserbean() {
		return userbean;
	}


	public void setUserbean(UserBean userbean) {
		this.userbean = userbean;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


}
