<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.chinasofti.etc.happybookshop.po.User"%>
<%@page import="com.chinasofti.etc.happybookshop.po.Order"%>
<%@page import="com.chinasofti.etc.happybookshop.po.OrderDetail"%>
<%@page import="com.chinasofti.etc.happybookshop.po.Log"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Happy Bookshop</title>
<link rel="stylesheet" type="text/css" href="css/styles/微博.css"/>
<style type="text/css">
   <!--
   a:link { text-decoration: none;color:#006a92}
   a:active { text-decoration:blink}
   a:visited { text-decoration: none;color: green}
     img{border:0px}  
   a:hover{
 		text-decoration:underline;  /*鼠标放上去有下划线*/
		  }
   --> 
</style>
</head>
   <!-- ------------------ 频道头 --------------------- -->
<body bgcolor="#boe5ff"  >
		<table border="1" cellpadding="0" width="800" bgcolor="#ffffff" align="center">
			<tr>
				<td width="116" height="50">
					<div align="center">
						<b><br />事件号</b>
					</div>
				</td>
				<td width="116" height="50">
					<div align="center">
						<b>用户号</b>
					</div>
				</td>
				<td width="116" height="50">
					<div align="center">
						<b>详细</b>
					</div>
				</td>
				<td width="116" height="50">
					<div align="center">
						<b>时间</b>
					</div>
				</td>
			</tr>
			<%
				List<Log> logs = (List<Log>)session.getAttribute("logs");
				for(Log log : logs) {
					
			%>
			<tr>
				<td width="116" height="50">
					<div align="center">
						<b><%=log.getLogId()%></b>
					</div>
				</td>
				<td width="116" height="30">
					<div align="center">
						<b><%=log.getUserId()%></b>
					</div>
				</td>
				<td width="116" height="30">
					<div align="center">
						<b><%=log.getLogEvent() %></b>
					</div>
				</td>

				<td width="116" height="30">
					<div align="center">
						<b><%=log.getLogDate() %></b>
					</div>
				</td>
			</tr>
			<%
		 	}
		 	%>



		</table>

	<table align="center" width="100%" border="0">
		<tr align="center">
			<td><a href="www"><font color="blick" size="2">腾讯网</font>
			</a> |<a href="www"> <font color="blick" size="2">网站导航</font>
			</a> | <a href="www"> <font color="blick" size="2">认证服务</font>
			</a> | <a href="www"> <font color="blick" size="2">开放平台</font>
			</a> | <a href="www"> <font color="blick" size="2">意见反馈</font>
			</a> | <a href="www"> <font color="blick" size="2">简体中文</font>
			</a>
			</td>
		</tr>
		<tr align="center">
			<td><font color="blick" size="2">Copyright &copy;1998 -
					2012 Tencent.All Rights Reserved</font>
			</td>
		</tr>
	</table>
</body>
</html>
