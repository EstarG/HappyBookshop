package com.chinasofti.etc.happybookshop.po;

import java.util.Date;

public class Log {
	private int logId;
	private int userId;
	private java.util.Date logDate;
	private String logEvent;
	//
	public int getLogId() {
		return logId;
	}
	public void setLogId(int logId) {
		this.logId = logId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public java.util.Date getLogDate() {
		return logDate;
	}
	public void setLogDate(java.util.Date logDate) {
		this.logDate = logDate;
	}
	public String getLogEvent() {
		return logEvent;
	}
	public void setLogEvent(String logEvent) {
		this.logEvent = logEvent;
	}
	public Log() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Log(int logId, int userId, Date logDate, String logEvent) {
		super();
		this.logId = logId;
		this.userId = userId;
		this.logDate = logDate;
		this.logEvent = logEvent;
	}
	
	
	
}
