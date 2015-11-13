package com.chinasofti.etc.happybookshop.dao.mysqlimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	protected Connection con = null;
	protected ResultSet rs = null;
	protected PreparedStatement pstmt = null;
	protected int result = 0;
	
	//ֻ����һ��
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//�����ݿ⽨������
	public void getConn(){
		String url = "jdbc:mysql://localhost:3306/happybookshop?user=root&password=1&useUnicode=true&characterEncoding=utf-8&autoReconnect=true&failOverReadOnly=false";
		
		try {
			con = DriverManager.getConnection(url);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//�ر�����
	public void closeAll(){

		try {
			if (rs != null && !rs.isClosed()) rs.close();
			if (pstmt != null && !pstmt.isClosed()) pstmt.close();
			if (rs != null && !rs.isClosed()) rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//����ѯ����
	public void  doQuery(String sql,Object ... params){
		try{
			pstmt = con.prepareStatement(sql);
			if (params != null){
				for (int i = 0; i < params.length; ++i){
					pstmt.setObject(i + 1,params[i]);
				}
			}
			rs = pstmt.executeQuery();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//�����²���
	public void doOperate(String sql,Object ... params){
		try {
			pstmt = con.prepareStatement(sql);
			if (params != null){
				for (int i = 0; i < params.length; ++i){
					pstmt.setObject(i + 1, params[i]);
				}
			}
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
