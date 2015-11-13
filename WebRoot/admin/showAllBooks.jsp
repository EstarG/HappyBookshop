<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import = "com.chinasofti.etc.happybookshop.po.Book"%>
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
  
		<table  width="85%" height="80%" bgcolor="#C5a5a7" align="left" border="1"><tr><td>
			    <%
			    	List<Book> books = (List<Book>)session.getAttribute("books");
			    	for(Book b : books) {
			    %>
			    <a href="userlogdetails.jsp"><h3 align="center">图书名：<%=b.getBookName() %></h3></a>
			    <%
			    	}
			    %>
			    </td></tr></table>
              
              
            <table align="center" width="100%" border="0"> <tr align="center"><td><a href="www"><font color="blick" size="2">腾讯网</font></a> |<a href="www"> <font color="blick" size="2">网站导航</font></a> |
              <a href="www"> <font color="blick" size="2">认证服务</font></a> |
              <a href="www"> <font color="blick" size="2">开放平台</font></a> |
              <a href="www"> <font color="blick" size="2">意见反馈</font></a> |
              <a href="www"> <font color="blick" size="2">简体中文</font></a></td></tr> 
             <tr align="center"><td><font color="blick" size="2">Copyright &copy;1998 - 2012 Tencent.All Rights Reserved</font></td></tr></table> 
          
</body>
</html>
