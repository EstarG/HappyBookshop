package com.chinasofti.etc.happybookshop.service;

import java.util.List;

import com.chinasofti.etc.happybookshop.po.Log;

public interface LogService {
	// 查询日志信息
	int findMaxLogId();
	List<Log> findAllLogs();
	List<Log> findLogByLogId(int logId);
	List<Log> findLogByUserId(int userId);
	List<Log> findLogByDate(java.util.Date date);
	// 添加一条新的日志
	int insertLog(Log log);
	// 删除一条日志
	int deleteLogByLogId(int logId);
	int deleteLogByUserId(int userId);
	int deleteLogByDate(java.util.Date date);
}
