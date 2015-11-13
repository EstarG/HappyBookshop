<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.chinasofti.etc.happybookshop.po.Category" %>
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
	<table border="1" width="85%" height="80%" bgcolor="#C5a5a7" align="left" border="1">
		<tr>
			<td>
				<form action="../addBookServlet" method="post" id="register" onreset="return Reset()"  onsubmit="return check()" >	
    			<center><font color="red" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<p>亲，可一定要填写您的真实信息哦&nbsp;</font></center><p>
    			<center>图&nbsp;书&nbsp;名&nbsp;&nbsp;:
    			<input style="background-color:#BFEEFF" type="text" name="bookName" id="userName"  width="100" size="25"  onblur="name('userName')"><br><p>
    				
    			
    			       出&nbsp;版&nbsp;社&nbsp;&nbsp;:
    				<input style="background-color:#BFEEFF" type="text" name="bookPublisher" id="password" width="100" size="25" onblur="password('password')"><br><p>
    		                    价&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;格&nbsp;&nbsp;:
    			 	<input style="background-color:#BFEEFF" type="text" name="bookPrice" id="querenpassword" width="100" size="25" onblur="qr('password','querenpassword')"><br><p>
    			          简&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;介:
    				<input style="background-color:#BFEEFF" type="text" name="bookDetails" id="add" width="100" size="25"><br><p>
    			    I&nbsp;S&nbsp;B&nbsp;N&nbsp;&nbsp;&nbsp;:
    				<input style="background-color:#BFEEFF" type="text" name="bookIsbn" id="telephone" width="100" size="25"><br><p>
    			
    				图&nbsp;片&nbsp;名&nbsp;&nbsp;:
    				<input style="background-color:#BFEEFF" type="text" name="bookPictureName" id="email" width="100" size="25" ><br><p>
    				作&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;者:
    				<input style="background-color:#BFEEFF" type="text" name="authorsName" id="email" width="100" size="25" ><br><p>
    				图片分类:
    				<select name="bookType">
    					<%
    						Set<Category> categories = (Set<Category>)session.getAttribute("categories");
    						for(Category c : categories) {
    					 %>
    					 <option value=<%=c.getCatId() %>><%=c.getCatName() %></option>
    					 <%
    					 	}
    					  %>
    					
    				</select>
    				</center>
    				<center>
    				<input type="submit" value="提交" name="submit">
    				<input type="reset" value="重置" name="reset"></center>
    				</form>
    			</td>
    			</tr>
	</table>
	<table align="center" width="100%" border="0"> <tr align="center"><td><a href="www"><font color="blick" size="2">腾讯网</font></a> |<a href="www"> <font color="blick" size="2">网站导航</font></a> |
		<a href="www"> <font color="blick" size="2">认证服务</font></a> |
		<a href="www"> <font color="blick" size="2">开放平台</font></a> |
		<a href="www"> <font color="blick" size="2">意见反馈</font></a> |
		<a href="www"> <font color="blick" size="2">简体中文</font></a></td></tr>
		<tr align="center"><td><font color="blick" size="2">Copyright &copy;1998 - 2012 Tencent.All Rights Reserved</font></td></tr>
	</table>    
</body>
</html>
