<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'head.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <body bgcolor="#boe5ff"  >
		<table width="80%" border="1" bgcolor="#832215" align="center">
		<tr><td>
	    &nbsp;<span ><font color="blick">欢迎光临小站</font>   
   		</span></td></tr></table>
   		
   		<table width="80%" border="0" bgcolor="#C5a5a7" align="center" >
   		<tr><td><h4 align="center">
        <span class="toptext"><a href="">童书    - </a></span>
        <span class="toptext"><a href="">教材  -</a></span>
        <span class="toptext"><a href="">考试  -</a></span>
        <span class="toptext"><a href="">小说  -</a></span>
        <span class="toptext"><a href="">青春文学  -</a></span>
        <span class="toptext"><a href="">人文社科  -</a></span>
        <span class="toptext"><a href="">生活  -</a></span>
        <span class="toptext"><a href="">励志  -</a></span>
        <span class="toptext"><a href="">预售  -</a></span>
        <span class="toptext"><a href="">特价    -</a></span> 
        <span class="toptext"><a href="">新书上市  -</a></span>
        <span class="toptext"><a href="">口碑好书</a></span></h4></td></tr></table>
        <hr size="1" color="#C5a5a7" width="80%">
  </body>
</html>
