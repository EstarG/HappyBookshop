package com.chinasofti.etc.happybookshop.dao;

import java.util.List;

import com.chinasofti.etc.happybookshop.po.Log;

public interface LogDao {
	// ��ѯ��־��Ϣ
    int findMaxLogId();
	List<Log> findAllLogs();
	List<Log> findLogByLogId(int logId);
	List<Log> findLogByUserId(int userId);
	List<Log> findLogByDate(java.util.Date date);
	// ���һ���µ���־
	int insertLog(Log log);
	// ɾ��һ����־
	int deleteLogByLogId(int logId);
	int deleteLogByUserId(int userId);
	int deleteLogByDate(java.util.Date date);

}
