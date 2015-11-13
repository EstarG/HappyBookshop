<%@page import="com.chinasofti.etc.happybookshop.po.Book"%>
<%@page import="com.chinasofti.etc.happybookshop.po.Category"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://#.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
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

		<table width="80%" border="0" bgcolor="#832215" align="center">
		<tr><td>
		<% int userAuthority = (Integer)session.getAttribute("authority"); %>
		<% String userName = (String)session.getAttribute("userName"); %>
	    &nbsp;<span ><a href="index1.jsp"  ><font color="blick">欢迎光临小站</font></a></span>   
	    <%
	    	if(userAuthority == 0) {
	     %>    
		&nbsp;<span ><a href="login.jsp"  ><font color="blick">登陆</font></a></span>       
   		&nbsp;<span ><a href="register.jsp"  ><font color="blick">注册</font></a></span>
   		 <%
   			}else if (userAuthority == 1) {
   		 %>
   		 &nbsp;<td align="right" border="1"><span ><font color="blick">欢迎回来，<%=userName%></font></span> 
   		 &nbsp;<span ><a href="logoutServlet"  ><font color="blick">安全退出</font></a></span></td>
   		<% 
   		  } else if (userAuthority == 2) {
   		    %>
   		    &nbsp;<td align="right" border="1"><span ><font color="blick">欢迎回来，<%=userName%></font></span> 
   		 &nbsp;<span ><a href="logoutServlet"  ><font color="blick">安全退出</font></a></span>
   		 &nbsp;<span ><a href="admin/admin.jsp"  ><font color="blick">管理</font></a></span></td>
   		<% 
   			}
   		 %>  
   		</td></tr></table>     
      
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
      <table width="80%"  border="1" align="center"><tr><td>
        
     
 		<table width="160" height="600px" border="0" bgcolor="#C5a5a7" align="left">
 			<tr><td>  <a href="#" class="daohangtwo"><font color="blick" size="4">图书分类</font></a></td></tr>
 					<%
 						Set<Category> categgories = (Set<Category>)session.getAttribute("categories");
 						for(Category c : categgories) {
 					 %>
 					 <tr><td>  <a href="#" class="daohangtwo"><font color="blick" size="2"><%=c.getCatName() %></font></a></td></tr>
 					 <%
 					 	}
 					  %>
		  <!--       	 
		        
		           	<tr><td>  <a href="#" class="daohang"><font color="blick" size="2">小说</font></a></td></tr>
		            <tr><td>  <a href="#" class="daohang"  ><font color="blick" size="2">悬疑 </font></a></td></tr>
		            <tr><td>  <a href="#" class="daohangaa"><font color="blick" size="2">言情</font></a></td></tr>
		            <tr><td>  <a href="#" class="daohangaa"><font color="blick" size="2">历史</font></a></td></tr>              
		            <tr><td>  <a href="#" class="daohangaa"><font color="blick" size="2">社会</font></a></td></tr>                    
		            <tr><td>  <a href="#" class="daohang"><font color="blick" size="2">文学</font></a>    </td></tr>
		            <tr><td>  <a href="#" class="daohangaa"><font color="blick" size="2">文学</font></a>
		                                      <a href="#" class="daohangaa"><font color="blick" size="2">传记</font></a>                
		                                      <a href="#" class="daohangaa"><font color="blick" size="2">艺术</font></a></td></tr>
		            <tr><td>  <a href="#" class="daohang"><font color="blick" size="2">青春</font></a>    </td></tr>
		            <tr><td>  <a href="#" class="daohangaa"><font color="blick" size="2">青春文学</font></a>
		                                       <a href="#" class="daohangaa"><font color="blick" size="2">电影</font></a>                
		                                       <a href="#" class="daohangaa"><font color="blick" size="2">幽默</font></a></td></tr>
		            <tr><td>  <a href="#" class="daohangaa"><font color="blick" size="2">励志</font></a>
		                                       <a href="#" class="daohangaa"><font color="blick" size="2">修养</font></a>                
		                                       <a href="#" class="daohangaa"><font color="blick" size="2">职场</font></a></td></tr>
		            <tr><td> <a href="#" class="daohang"><font color="blick" size="2">童书</font></a>    </td></tr>
		            <tr><td> <a href="#" class="daohangaa"><font color="blick" size="2">科学</font></a>
		                                      <a href="#" class="daohangaa"><font color="blick" size="2">英语</font></a>                
		                                      <a href="#" class="daohangaa"><font color="blick" size="2">图画</font></a></td></tr>
		            <tr><td> <a href="#" class="daohangaa"><font color="blick" size="2">生活</font></a>
		                                      <a href="#" class="daohangaa"><font color="blick" size="2">创意</font></a>                
		                                      <a href="#" class="daohangaa"><font color="blick" size="2">旅行</font></a></td></tr>
		        
		            <tr><td> <a href="#" class="daohang"><font color="blick" size="2">人文社科</font></a>    </td></tr>
		            <tr><td> <a href="#" class="daohangaa"><font color="blick" size="2">历史</font></a>
		                                  <a href="#" class="daohangaa"><font color="blick" size="2">文化</font></a>                
		                                  <a href="#" class="daohangaa"><font color="blick" size="2">心理</font></a></td></tr>
		            <tr><td> <a href="#" class="daohangaa"><font color="blick" size="2">科技</font></a>
		                                  <a href="#" class="daohangaa"><font color="blick" size="2">科普</font></a>                
		                                  <a href="#" class="daohangaa"><font color="blick" size="2">农林</font></a></td></tr>
		       
		            <tr><td> <a href="#" class="daohang"><font color="blick" size="2">教育</font></a>    </td></tr>
		          <tr><td> <a href="#" class="daohangaa"><font color="blick" size="2">教材</font></a></td></tr>
		           -->
        </table> &nbsp;&nbsp;&nbsp;
			<a href="bookdetail.jsp"><img src="images/shupi.bmp" width="25%" height="345"  align="right"></a>
        <table border="1" width="57%" height="345" align="right">
              	<tr><td  bgcolor="#C5a5a7">
              			
              			<a href="bookdetail.jsp">&nbsp;&nbsp;<img src="images/aaa.bmp" width="530" height="100" ></a>
              			<a href="bookdetail.jsp">
              			<p><font color="#ffffff" size="2"> 
              			 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;《礼记·文王世子》：“秋学礼，执礼者诏之；冬读书，典书者诏之。” 唐 韩愈《感二鸟赋》序：“读书著文，自七岁至今，凡二十二年。”明赵震元《为李公师祭袁石寓（袁可立子）宪副》：“舞象采芹，弱冠□璐振臂，当国家之巨艰，
              			读书鄙腐儒之章句。”夏丏尊叶圣陶 《文心》十四：“正是王先生的声音，原来王先生在读书。”  </font></p></a>
              			&nbsp;&nbsp;<a href="bookdetail.jsp"><img src="images/bbb.bmp" width="30%" height="10%" ></a>&nbsp;&nbsp;
              			<a href="bookdetail.jsp"><img src="images/ccc.bmp" width="30%" height="10%" ></a>&nbsp;&nbsp;
              			<a href="bookdetail.jsp"><img src="images/ddd.bmp" width="30%" height="10%" ></a>&nbsp;&nbsp;
              			<a href="bookdetail.jsp"><p ><font color="#ffffff" size="2"> 
              			 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;《礼记·文王世子》：“秋学礼，执礼者诏之；冬读书，典书者诏之。” 
              			唐 韩愈《感二鸟赋》序：“读书著文，自七岁至今，凡二十二年。”明赵震元《为李公师祭袁石寓（袁可立子）宪副》：
              		“舞象采芹，弱冠□璐振臂，当国家之巨艰，
              			读书鄙腐儒之章句。  </font></p></a>
              			
              	</td></tr>
              </table>
              
              
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <table border="1" width="80%" height="100%" bgcolor="#C5a5a7" align="center" border="1">
            		 <a href="bookdetail.jsp"><img src="images/tubiao.bmp" width="786" height="70" >&nbsp;&nbsp;</a>&nbsp;
              <tr><td>	&nbsp;&nbsp;&nbsp;&nbsp;
            <table align="left"> 
            <%
            List<Book> books = (List<Book>)session.getAttribute("books");
            for(Book b : books) {
             %>
             <tr ><td> <a href="bookDetailServlet?bookId=<%=b.getBookId() %>"><img src="<%="images/" + b.getBookPictureName() %>" width="180" height="200" ></a></td><font size="2" color="blick"><td></br>作&nbsp;&nbsp;&nbsp; 者：<%=b.getBookName() %> </br></br>出版社： <%=b.getBookPublisher() %> </br></br>&nbsp;&nbsp;&nbsp;&nbsp;<%=b.getBookDetails() %></td></font></tr>
             <%
             }
              %>
              </table>
              
              
              <table align="center" width="100%"> <tr align="center"><td><a href="#"><font color="blick" size="2">腾讯网</font></a> |<a href="#"> <font color="blick" size="2">网站导航</font></a> |
              <a href="#"> <font color="blick" size="2">认证服务</font></a> |
              <a href="#"> <font color="blick" size="2">开放平台</font></a> |
              <a href="#"> <font color="blick" size="2">意见反馈</font></a> |
              <a href="#"> <font color="blick" size="2">简体中文</font></a></td></tr> 
             <tr align="center"><td><font color="blick" size="2">Copyright &copy;1998 - 2012 Tencent.All Rights Reserved</font></td></tr></table> 
    
</body>
</html>
