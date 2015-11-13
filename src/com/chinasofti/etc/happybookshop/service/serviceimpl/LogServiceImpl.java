package com.chinasofti.etc.happybookshop.service.serviceimpl;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import com.chinasofti.etc.happybookshop.dao.LogDao;
import com.chinasofti.etc.happybookshop.po.Log;
import com.chinasofti.etc.happybookshop.service.LogService;

public class LogServiceImpl implements LogService {
	private LogDao logDao;

	public LogServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
		File file = new File("f:/myconfig.properties");
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(file));
			String logDaoString = properties.getProperty("LogDao");
			logDao = (LogDao) Class.forName(logDaoString).newInstance();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public List<Log> findAllLogs() {
		// TODO Auto-generated method stub
		return logDao.findAllLogs();
	}

	public List<Log> findLogByLogId(int logId) {
		// TODO Auto-generated method stub
		return logDao.findLogByLogId(logId);
	}


	public List<Log> findLogByUserId(int userId) {
		// TODO Auto-generated method stub
		return logDao.findLogByUserId(userId);
	}

	public List<Log> findLogByDate(Date date) {
		// TODO Auto-generated method stub
		return logDao.findLogByDate(date);
	}

	public int insertLog(Log log) {
		// TODO Auto-generated method stub
		return logDao.insertLog(log);
	}

	public int deleteLogByLogId(int logId) {
		// TODO Auto-generated method stub
		return logDao.deleteLogByLogId(logId);
	}

	public int deleteLogByUserId(int userId) {
		// TODO Auto-generated method stub
		return logDao.deleteLogByUserId(userId);
	}

	public int deleteLogByDate(Date date) {
		// TODO Auto-generated method stub
		return logDao.deleteLogByDate(date);
	}
	public int findMaxLogId() {
		// TODO Auto-generated method stub
		return logDao.findMaxLogId();
	}

}
