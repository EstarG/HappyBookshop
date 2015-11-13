<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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

		<table width="80%" border="1" bgcolor="#832215" align="center">
		<tr><td>
	    &nbsp;<span ><a href="index.jsp"  ><font color="blick">欢迎光临小站</font></a>    
		&nbsp;<a href="login.jsp"  ><font color="blick">登陆</font></a>       
   		&nbsp;<a href="register.jsp"  ><font color="blick">注册</font></a>
   		&nbsp;<a href="userlist.jsp"  ><font color="blick">清单</font></a>
   		&nbsp;<td align="right" border="1"><a href="userlist.jsp"  ><font color="blick" >清单</font></a></td></span></td></tr></table>     
      
      
       <table width="80%" border="0" bgcolor="#C5a5a7" align="center" >
       <tr><td><h4 align="center">
        <span class="toptext"><a href="首页">童书    - </a></span>
        <span class="toptext"><a href="广场">教材  -</a></span>
        <span class="toptext"><a href="地址">考试  -</a></span>
        <span class="toptext"><a href="地址">小说  -</a></span>
        <span class="toptext"><a href="地址">青春文学  -</a></span>
        <span class="toptext"><a href="登陆">人文社科  -</a></span>
        <span class="toptext"><a href="手机">生活  -</a></span>
        <span class="toptext"><a href="找人">励志  -</a></span>
        <span class="toptext"><a href="纤细">预售  -</a></span>
        <span class="toptext"><a href="账号">特价    -</a></span> 
        <span class="toptext"><a href="账号">新书上市  -</a></span>
        <span class="toptext"><a href="账号">口碑好书</a></span></h4></td></tr></table>
        <hr size="1" color="#C5a5a7" width="80%">
   
    <!--      ------------------------------------------------------------------------------------     -->
       &nbsp;&nbsp;<table width="80%"  border="1" align="center"><tr><td>
        
     
 		<table width="160" height="350px" border="1" bgcolor="#C5a5a7" align="left">
		        	<tr><td>  <a href="www"><font color="blick" size="4">功能选择</font></a></td></tr> 
		        
		           	<tr><td>  <a href="www"><font color="blick" size="2">用户</font></a></td></tr>
		            <tr><td>  &nbsp;&nbsp;&nbsp;&nbsp;<a href="underDesk?select='1' " ><font color="blick" size="2">显示所有用户 </font></a></td></tr>
		            <tr><td>  &nbsp;&nbsp;&nbsp;&nbsp;<a href="www" ><font color="blick" size="2">增加用户</font></a></td></tr>
		            
		            
		                          
		            <tr><td>  <a href="www" ><font color="blick" size="2">图书</font></a>    </td></tr>
		            <tr><td>  &nbsp;&nbsp;&nbsp;&nbsp;<a href="www" ><font color="blick" size="2">显示所有图书</font></a>  </td></tr>
		            <tr><td>  &nbsp;&nbsp;&nbsp;&nbsp;<a href="addbook.jsp" ><font color="blick" size="2">增加图书</font></a>      </td></tr>          
		            
		            
		            <tr><td>  <a href="www" ><font color="blick" size="2">订单</font></a>    </td></tr>
		            <tr><td>  &nbsp;&nbsp;&nbsp;&nbsp;<a href="www" ><font color="blick" size="2">显示所有订单</font></a>  </td></tr>
		            
		            <tr><td>  <a href="www" ><font color="blick" size="2">日志</font></a>    </td></tr>
		            <tr><td>  &nbsp;&nbsp;&nbsp;&nbsp;<a href="www" ><font color="blick" size="2">显示所有日志</font></a>  </td></tr>
			
			
			
			
			
			  
              <table border="1" width="84%" height="77%" bgcolor="#C5a5a7" align="right" border="1">
                      <tr align="center"><td>
                      <a href="userlogdetails.jsp" >用户名：张三 </a>  <a href="www" ><font color="blick" size="2">删除用户</font></a><br/>
                      <a href="userlogdetails.jsp" >用户名：张三 </a>  <a href="www" ><font color="blick" size="2">删除用户</font></a><br/>
                      <a href="userlogdetails.jsp" >用户名：张三 </a>  <a href="www" ><font color="blick" size="2">删除用户</font></a><br/>
                      <a href="userlogdetails.jsp" >用户名：张三 </a>  <a href="www" ><font color="blick" size="2">删除用户</font></a><br/>
                      <a href="userlogdetails.jsp" >用户名：张三 </a>  <a href="www" ><font color="blick" size="2">删除用户</font></a><br/>
                      <a href="userlogdetails.jsp" >用户名：张三 </a>  <a href="www" ><font color="blick" size="2">删除用户</font></a><br/>
                      <a href="userlogdetails.jsp" >用户名：张三 </a>  <a href="www" ><font color="blick" size="2">删除用户</font></a><br/></td></tr></table>
             
                 
              <table border="1" width="84%" height="77%" bgcolor="#C5a5a7" align="right" border="1">
                      <tr align="center"><td>
                      <a href="bookdetail.jsp" >图书名：张三 </a>  <a href="www" ><font color="blick" size="2">删除图书</font></a><br/>
                      <a href="bookdetail.jsp" >图书名：张三 </a>  <a href="www" ><font color="blick" size="2">删除图书</font></a><br/>
                      <a href="bookdetail.jsp" >图书名：张三 </a>  <a href="www" ><font color="blick" size="2">删除图书</font></a><br/>
                      <a href="bookdetail.jsp" >图书名：张三 </a>  <a href="www" ><font color="blick" size="2">删除图书</font></a><br/>
                      <a href="bookdetail.jsp" >图书名：张三 </a>  <a href="www" ><font color="blick" size="2">删除图书</font></a><br/>
                      <a href="bookdetail.jsp" >图书名：张三 </a>  <a href="www" ><font color="blick" size="2">删除图书</font></a><br/>
                      <a href="bookdetail.jsp" >图书名：张三 </a>  <a href="www" ><font color="blick" size="2">删除图书</font></a><br/></td></tr></table>
                      
                      
              <table border="1" width="84%" height="77%" bgcolor="#C5a5a7" align="right" border="1">
                      <tr align="center"><td>
                      <a href="www" >订单号：0000 </a>  <a href="www" ><font color="blick" size="2">删除订单</font></a><br/>
                      <a href="www" >订单号：0000 </a>  <a href="www" ><font color="blick" size="2">删除订单</font></a><br/>
                      <a href="www" >订单号：0000 </a>  <a href="www" ><font color="blick" size="2">删除订单</font></a><br/>
                      <a href="www" >订单号：0000 </a>  <a href="www" ><font color="blick" size="2">删除订单</font></a><br/>
                      <a href="www" >订单号：0000 </a>  <a href="www" ><font color="blick" size="2">删除订单</font></a><br/>
                      <a href="www" >订单号：0000 </a>  <a href="www" ><font color="blick" size="2">删除订单</font></a><br/>
                      <a href="www" >订单号：0000 </a>  <a href="www" ><font color="blick" size="2">删除订单</font></a><br/></td></tr></table>
                      
                      
              <table border="1" width="84%" height="77%" bgcolor="#C5a5a7" align="right" border="1">
                      <tr align="center"><td>
                      <a href="www" >用户名：张三 </a>&nbsp;&nbsp;&nbsp;&nbsp; <a href="www" >时间：00:00:00 </a> <a href="www" ><font color="blick" size="2">删除日志</font></a><br/>
                      <a href="www" >用户名：张三 </a>&nbsp;&nbsp;&nbsp;&nbsp; <a href="www" >时间：00:00:00 </a> <a href="www" ><font color="blick" size="2">删除日志</font></a><br/>
                      <a href="www" >用户名：张三 </a>&nbsp;&nbsp;&nbsp;&nbsp; <a href="www" >时间：00:00:00 </a> <a href="www" ><font color="blick" size="2">删除日志</font></a><br/>
                      <a href="www" >用户名：张三 </a>&nbsp;&nbsp;&nbsp;&nbsp; <a href="www" >时间：00:00:00 </a> <a href="www" ><font color="blick" size="2">删除日志</font></a><br/>
                      <a href="www" >用户名：张三 </a>&nbsp;&nbsp;&nbsp;&nbsp; <a href="www" >时间：00:00:00 </a> <a href="www" ><font color="blick" size="2">删除日志</font></a><br/>
                      <a href="www" >用户名：张三 </a>&nbsp;&nbsp;&nbsp;&nbsp; <a href="www" >时间：00:00:00 </a> <a href="www" ><font color="blick" size="2">删除日志</font></a><br/>
                      <a href="www" >用户名：张三 </a>&nbsp;&nbsp;&nbsp;&nbsp; <a href="www" >时间：00:00:00 </a> <a href="www" ><font color="blick" size="2">删除日志</font></a><br/></td></tr></table>
                 
              
              
              <table align="center" width="100%" border="0"> <tr align="center"><td><a href="www"><font color="blick" size="2">腾讯网</font></a> |<a href="www"> <font color="blick" size="2">网站导航</font></a> |
              <a href="www"> <font color="blick" size="2">认证服务</font></a> |
              <a href="www"> <font color="blick" size="2">开放平台</font></a> |
              <a href="www"> <font color="blick" size="2">意见反馈</font></a> |
              <a href="www"> <font color="blick" size="2">简体中文</font></a></td></tr> 
             <tr align="center"><td><font color="blick" size="2">Copyright &copy;1998 - 2012 Tencent.All Rights Reserved</font></td></tr></table> 
    
</body>
</html>
