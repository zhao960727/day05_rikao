package com.zyf.entity;

public class Book {
	
	private int bid;
	private String bname;
	private String type;
	private String phone;
	private String author;
	private int popular;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPopular() {
		return popular;
	}
	public void setPopular(int popular) {
		this.popular = popular;
	}
	public Book() {
		super();
	}
	public Book(int bid, String bname, String type, String phone, String author, int popular) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.type = type;
		this.phone = phone;
		this.author = author;
		this.popular = popular;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", type=" + type + ", phone=" + phone + ", author=" + author
				+ ", popular=" + popular + "]";
	}
	
}
