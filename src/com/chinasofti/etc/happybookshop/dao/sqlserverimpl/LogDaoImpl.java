package com.chinasofti.etc.happybookshop.dao.sqlserverimpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.chinasofti.etc.happybookshop.dao.LogDao;
import com.chinasofti.etc.happybookshop.po.Log;

public class LogDaoImpl extends BaseDao implements LogDao {

	public int findMaxLogId(){
		getConn();
		int maxId = 0;
		String sql = "select MAX(logId) from Logs";
		doQuery(sql);
		try {
			if (rs.next()){
				maxId = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll();
		return maxId;
	}
	public List<Log> findAllLogs() {
		// TODO Auto-generated method stub
		// 查找所有的日志信息
		List<Log> logs = new ArrayList<Log>();
		Log log = null;
		getConn();
		String sql = "select * from Logs";
		doQuery(sql);
		try {
			while(rs.next()) {
				log = new Log();
				log.setLogId(rs.getInt(1));
				log.setUserId(rs.getInt(2));
				log.setLogDate(rs.getDate(3));
				log.setLogEvent(rs.getString(4));
				
				logs.add(log);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return logs;
	}

	public List<Log> findLogByLogId(int logId) {
		// TODO Auto-generated method stub
		// 按照日志编号查找指定的日志信息
		List<Log> logs = new ArrayList<Log>();
		Log log = null;
		getConn();
		String sql = "select * from Logs where logId=?";
		doQuery(sql, logId);
		try {
			while(rs.next()) {
				log = new Log();
				log.setLogId(rs.getInt(1));
				log.setUserId(rs.getInt(2));
				log.setLogDate(rs.getDate(3));
				log.setLogEvent(rs.getString(4));
				
				logs.add(log);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return logs;
	}

	

	public List<Log> findLogByUserId(int userId) {
		// TODO Auto-generated method stub
		// 按照客户Id查找指定的日志信息
		List<Log> logs = new ArrayList<Log>();
		Log log = null;
		getConn();
		String sql = "select * from Logs where userId=?";
		doQuery(sql, userId);
		try {
			while(rs.next()) {
				log = new Log();
				log.setLogId(rs.getInt(1));
				log.setUserId(rs.getInt(2));
				log.setLogDate(rs.getDate(3));
				log.setLogEvent(rs.getString(4));
				
				logs.add(log);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return logs;
	}

	public List<Log> findLogByDate(Date date) {
		// TODO Auto-generated method stub
		// 先把日期转换为sql类型
		java.sql.Date dateTime = new java.sql.Date(date.getTime());
		// 按照日期查找指定的日志信息
		List<Log> logs = new ArrayList<Log>();
		Log log = null;
		getConn();
		String sql = "select * from Logs where logDate=?";
		doQuery(sql, dateTime);
		try {
			while(rs.next()) {
				log = new Log();
				log.setLogId(rs.getInt(1));
				log.setUserId(rs.getInt(2));
				log.setLogDate(rs.getDate(3));
				log.setLogEvent(rs.getString(4));
				
				logs.add(log);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return logs;
	}

	public int insertLog(Log log) {
		// TODO Auto-generated method stub
		// 先把日期转换为sql类型
		java.sql.Date dateTime = new java.sql.Date(log.getLogDate().getTime());
		// 插入一条日志信息
		getConn();
		int maxId = this.findMaxLogId();
		String sql = "insert into Logs values(?, ?, ?, ?)";
		doOperate(sql, maxId + 1, log.getUserId(), dateTime, log.getLogEvent());
		closeAll();
		return result;
	}

	public int deleteLogByLogId(int logId) {
		// TODO Auto-generated method stub
		// 按照日志编号删除一条日志信息
		getConn();
		String sql = "delete from Logs where logId=?";
		doOperate(sql, logId);
		closeAll();
		return result;
	}

	public int deleteLogByType(int logType) {
		// TODO Auto-generated method stub
		// 按照日志类型删除一条日志信息
		getConn();
		String sql = "delete from Logs where logType=?";
		doOperate(sql, logType);
		closeAll();
		return result;

	}

	public int deleteLogByUserId(int userId) {
		// TODO Auto-generated method stub
		// 按照客户编号删除一条日志信息
		getConn();
		String sql = "delete from Logs where userId=?";
		doOperate(sql, userId);
		closeAll();
		return result;

	}

	public int deleteLogByDate(Date date) {
		// TODO Auto-generated method stub
		// 先把日期转换为sql类型
		java.sql.Date dateTime = new java.sql.Date(date.getTime());
		// 按照日期删除一条日志信息
		getConn();
		String sql = "delete from Logs where logDate=?";
		doOperate(sql, dateTime);
		closeAll();
		return result;
	}
}
