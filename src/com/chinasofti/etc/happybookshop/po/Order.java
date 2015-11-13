package com.chinasofti.etc.happybookshop.po;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Order {
	private int orderId;
	private java.util.Date date;
	private double orderTotal;
	private User user;
	private Set<OrderDetail> orderDetails = new HashSet<OrderDetail>();
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public java.util.Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}
	public double getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Set<OrderDetail> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(Set<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId, Date date, double orderTotal, User user, Set<OrderDetail> orderDetails) {
		super();
		this.orderId = orderId;
		this.date = date;
		this.orderTotal = orderTotal;
		this.user = user;
		this.orderDetails = orderDetails;
	}
}
