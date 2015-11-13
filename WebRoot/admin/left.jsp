<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'left.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body bgcolor="#boe5ff">
  	<table width="160" height="350px" border="1" bgcolor="#C5a5a7" align="left">
  		<tr><td><font color="blick" size="4">功能选择</font></td></tr> 
  		<tr><td><font color="blick" size="2">用户</font></td></tr>
  		<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;<a href="showAllUsersServlet" target="frame_3"><font color="blick" size="2">显示所有用户 </font></a></td></tr>
		<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;<a href="admin/addUser.jsp" target="frame_3"><font color="blick" size="2">增加用户</font></a></td></tr>
		<tr><td><font color="blick" size="2">图书</font></td></tr>
		<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;<a href="admin/showAllBooks.jsp" target="frame_3"><font color="blick" size="2">显示所有图书</font></a>  </td></tr>
		<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;<a href="admin/addbook.jsp" target="frame_3"><font color="blick" size="2">增加图书</font></a>      </td></tr>          
		<tr><td><font color="blick" size="2">订单</font></td></tr>
		<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;<a href="admin/showAllOrders.jsp" target="frame_3"><font color="blick" size="2">显示所有订单</font></a>  </td></tr>
		<tr><td><font color="blick" size="2">日志</font></td></tr>
		<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;<a href="showAllLogsServlet" target="frame_3"><font color="blick" size="2">显示所有日志</font></a>  </td></tr>		
		<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;<a href="index1.jsp" target="_blank"><font color="blick" size="2">退出</font></a>  </td></tr>
  </body>
</html>
