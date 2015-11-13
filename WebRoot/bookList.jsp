<%@page import="com.chinasofti.etc.happybookshop.service.BookService"%>
<%@page import="com.chinasofti.etc.happybookshop.po.Book"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
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
    This is my bookList JSP page. <br>
    <%
    List<Book> books = (List<Book>)session.getAttribute("books");
    for (Book b : books) {
    %>
    
    	<a href="bookDetailServlet?bookId=<%=b.getBookId() %>"><%=b.getBookName()%><br/></a>
   <%
    }
     %>
  </body>
</html>
