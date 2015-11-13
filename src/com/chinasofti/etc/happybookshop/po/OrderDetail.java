package com.chinasofti.etc.happybookshop.po;

public class OrderDetail {
	private int orderDetailId;
	private Book book;
	private int bookNum;
	private Order order;
	//
	public int getOrderDetailId() {
		return orderDetailId;
	}
	public void setOrderDetailId(int orderDetailId) {
		this.orderDetailId = orderDetailId;
	}
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
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public OrderDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDetail(int orderDetailId, Book book, int bookNum, Order order) {
		super();
		this.orderDetailId = orderDetailId;
		this.book = book;
		this.bookNum = bookNum;
		this.order = order;
	}
}
