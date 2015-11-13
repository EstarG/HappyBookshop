package com.chinasofti.etc.happybookshop.po;

import java.util.HashSet;
import java.util.Set;

public class User {
	private int userId;
	private String userName;
	private String userPassword;
	private int userAuthority;
	private String userAddr;
	private String userPhoneNum;
	private String userEmail;
	private Set<Order> orders = new HashSet<Order>();
	//
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public int getUserAuthority() {
		return userAuthority;
	}
	public void setUserAuthority(int userAuthority) {
		this.userAuthority = userAuthority;
	}
	public String getUserAddr() {
		return userAddr;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}
	public String getUserPhoneNum() {
		return userPhoneNum;
	}
	public void setUserPhoneNum(String userPhoneNum) {
		this.userPhoneNum = userPhoneNum;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Set<Order> getOrders() {
		return orders;
	}
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String userName, String userPassword,
			int userAuthority, String userAddr, String userPhoneNum,
			String userEmail) {
		super();
	
		this.userName = userName;
		this.userPassword = userPassword;
		this.userAuthority = userAuthority;
		this.userAddr = userAddr;
		this.userPhoneNum = userPhoneNum;
		this.userEmail = userEmail;
	}
}
