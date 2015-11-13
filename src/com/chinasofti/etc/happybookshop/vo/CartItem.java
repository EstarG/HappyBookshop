package com.chinasofti.etc.happybookshop.vo;

import com.chinasofti.etc.happybookshop.po.Book;

public class CartItem {
	private Book book;
	private int bookNum;
	private double smallTotal;
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public int getBookNum() {
		return bookNum;
	}
	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	public double getSmallTotal() {
		return smallTotal;
	}
	public void setSmallTotal(double smallTotal) {
		this.smallTotal = smallTotal;
	}
	public CartItem(Book book, int bookNum, double smallTotal) {
		super();
		this.book = book;
		this.bookNum = bookNum;
		this.smallTotal = smallTotal;
	}
	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
