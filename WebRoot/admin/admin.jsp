<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>仪表盘-开心购物网</title>
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
        <frameset rows="15%, 85%">
        	<frame name="frame_1" src="head.jsp">
        	<frameset cols = "24%, 76%">
        	<frame name="frame_2" src="left.jsp" marginwidth="150">
        	<frame name="frame_3" src="right.jsp">
        </frameset>
</html>
