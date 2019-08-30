package com.tyss.lms.dto;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@JsonRootName(value = "issued-Book-Details")
@Entity
@Table(name="IssuedBookDetails")
public class IssuedBookBean {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int issueID;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "bookid")
	private BookBean bookbean;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "id")
	private UserBean userbean;

	@Column(name = "dateOfissue")
	private Date dateofissue;

	@Column(name = "dateofSubmission")
	private Date dateofSubmission;

	@Column(name = "dues")
	private double dues;

	public int getIssueID() {
		return issueID;
	}

	public void setIssueID(int issueID) {
		this.issueID = issueID;
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

	public Date getDateOfissue() {
		return dateofissue;
	}

	public void setDateOfissue(Date dateOfissue) {
		this.dateofissue = dateOfissue;
	}

	public Date getDateofSubmission() {
		return dateofSubmission;
	}

	public void setDateofSubmission(Date dateofSubmission) {
		this.dateofSubmission = dateofSubmission;
	}

	public double getDues() {
		return dues;
	}

	public void setDues(double dues) {
		this.dues = dues;
	}

	

}
