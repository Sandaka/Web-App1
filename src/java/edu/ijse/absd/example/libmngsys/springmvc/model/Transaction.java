package edu.ijse.absd.example.libmngsys.springmvc.model;

// Generated Sep 17, 2015 11:30:04 AM by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Transaction generated by hbm2java
 */
@Entity
@Table(name = "transaction", catalog = "libmngsysdb")
public class Transaction implements java.io.Serializable {

	private int id;
	private Member member;
	private Book book;
	private Date borroweddate;
	private Date returndate;

	public Transaction() {
	}

	public Transaction(int id, Member member, Book book) {
		this.id = id;
		this.member = member;
		this.book = book;
	}

	public Transaction(int id, Member member, Book book, Date borroweddate,
			Date returndate) {
		this.id = id;
		this.member = member;
		this.book = book;
		this.borroweddate = borroweddate;
		this.returndate = returndate;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "memberid", nullable = false)
	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bookid", nullable = false)
	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "borroweddate", length = 10)
	public Date getBorroweddate() {
		return this.borroweddate;
	}

	public void setBorroweddate(Date borroweddate) {
		this.borroweddate = borroweddate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "returndate", length = 10)
	public Date getReturndate() {
		return this.returndate;
	}

	public void setReturndate(Date returndate) {
		this.returndate = returndate;
	}

}
