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
		// �������е���־��Ϣ
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
		// ������־��Ų���ָ������־��Ϣ
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
		// ���տͻ�Id����ָ������־��Ϣ
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
		// �Ȱ�����ת��Ϊsql����
		java.sql.Date dateTime = new java.sql.Date(date.getTime());
		// �������ڲ���ָ������־��Ϣ
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
		// �Ȱ�����ת��Ϊsql����
		java.sql.Date dateTime = new java.sql.Date(log.getLogDate().getTime());
		// ����һ����־��Ϣ
		getConn();
		int maxId = this.findMaxLogId();
		String sql = "insert into Logs values(?, ?, ?, ?)";
		doOperate(sql, maxId + 1, log.getUserId(), dateTime, log.getLogEvent());
		closeAll();
		return result;
	}

	public int deleteLogByLogId(int logId) {
		// TODO Auto-generated method stub
		// ������־���ɾ��һ����־��Ϣ
		getConn();
		String sql = "delete from Logs where logId=?";
		doOperate(sql, logId);
		closeAll();
		return result;
	}

	public int deleteLogByType(int logType) {
		// TODO Auto-generated method stub
		// ������־����ɾ��һ����־��Ϣ
		getConn();
		String sql = "delete from Logs where logType=?";
		doOperate(sql, logType);
		closeAll();
		return result;

	}

	public int deleteLogByUserId(int userId) {
		// TODO Auto-generated method stub
		// ���տͻ����ɾ��һ����־��Ϣ
		getConn();
		String sql = "delete from Logs where userId=?";
		doOperate(sql, userId);
		closeAll();
		return result;

	}

	public int deleteLogByDate(Date date) {
		// TODO Auto-generated method stub
		// �Ȱ�����ת��Ϊsql����
		java.sql.Date dateTime = new java.sql.Date(date.getTime());
		// ��������ɾ��һ����־��Ϣ
		getConn();
		String sql = "delete from Logs where logDate=?";
		doOperate(sql, dateTime);
		closeAll();
		return result;
	}
}
