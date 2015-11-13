<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <script language="javascript">//标题栏显示时间的脚本
var clocktext;
var pagetitle=document.title;
function scroll(){
	var today = new Date();
	sec=today.getSeconds();
	hr=today.getHours();
	mi=today.getMinutes();
	if(hr<10)hr="0"+hr;
	if(mi<10)hr="0"+mi;
	if(sec<10)sec="0"+sec;
	var clocktext="Happy BookShop 温馨提示你，现在时间是："+hr+":"+mi+":"+sec;
	
	setTimeout("scroll()",1000);
	document.title=pagetitle+clocktext;
}
if(document.all){
	scroll();
}
</script>
    <base href="<%=basePath%>">
    
    <title></title>
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
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body bgcolor="BFEEFF">
  	<table width="80%" border="0" bgcolor="#B0E5FF" align="center">
		<tr><td>
	    &nbsp;<span ><a href="首页地址" ><font color="blick">欢迎光临 Happy BookShop</font></a></span>       
		&nbsp;<span ><a href="首页地址"  ><font color="blick">登陆</font></a></span>       
   		&nbsp;<span ><a href="register.jsp"  ><font color="blick">注册</font></a></span>  
   		</td></tr>
   		
   	</table>     
        
       <table width="80%" height="20" border="0" bgcolor="#C5EBF7" align="center" >
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
   
     <center><font color="red" size="+3" face="隶书"> Happy  BookShop 用户信息</font> </center>
   &nbsp; &nbsp; <p>&nbsp; &nbsp; <p>
     <table width="800" align="center" cellpadding="0" cellspacing="0" border="0">
     	<tr>
     		<td>用户名:<%=session.getAttribute("userName") %></td>
     		<td>
     			<table width="600" align="center" cellpadding="0" cellspacing="0" border="1">
     				<tr>
     					<td width="150" align="center">登录时间</td>
     					<td align="center">事件</td>
     				</tr>
     				
     				<tr>
     					<td width="150" align="center">2011-11-12</td>
     					<td>买了几本书</td>
     					
     				</tr>
     				<tr>
     					<td width="150" align="center">2011-11-12</td>
     					<td>买了几本书</td>
     					
     				</tr>
     				<tr>
     					<td width="150" align="center">2011-11-12</td>
     					<td>买了几本书</td>
     					
     				</tr>
     				<tr>
     					<td width="150" align="center">2011-11-12</td>
     					<td>买了几本书</td>
     					
     				</tr>
     				<tr>
     					<td width="150" align="center">2011-11-12</td>
     					<td>买了几本书</td>
     					
     				</tr>
     				<tr>
     					<td width="150" align="center">2011-11-12</td>
     					<td>买了几本书</td>
     					
     				</tr>
     				<tr>
     					<td width="150" align="center">2011-11-12</td>
     					<td>买了几本书</td>
     					
     				</tr>
     				<tr>
     					<td width="150" align="center">2011-11-12</td>
     					<td>买了几本书</td>
     					
     				</tr>
     				<tr>
     					<td width="150" align="center">2011-11-12</td>
     					<td>买了几本书</td>
     					
     				</tr>
     			</table>
     		</td>
     	</tr>
     </table >
      &nbsp; &nbsp; <p>&nbsp; &nbsp; <p>&nbsp; &nbsp; <p>&nbsp; &nbsp;
       &nbsp; &nbsp; <p>&nbsp; &nbsp; <p>&nbsp; &nbsp; <p>&nbsp; &nbsp;
      <hr size="1" color="#C5a5a7" width="80%">
   <table width="80%" height="20" border="0" bgcolor="#C5EBF7" align="center">
   <tr>
   <td  width="750">
    <marquee direction="left">友情链接：
    	<a href=" ">Happy BookShop</a> &nbsp; &nbsp;
    	<a href=" ">百  度</a> &nbsp; &nbsp; 
    	<a href=" ">新  浪</a> &nbsp; &nbsp; 
    	<a href=" ">搜  狐</a> &nbsp; &nbsp; 
    	<a href=" ">山理工</a> &nbsp; &nbsp; 
    	<a href=" ">中软国际</a>&nbsp; &nbsp; 
    	<a href=" ">百  度</a> &nbsp; &nbsp; 
    	<a href=" ">新  浪</a> &nbsp; &nbsp; 
    	<a href=" ">搜  狐</a> &nbsp; &nbsp; 
    	<a href=" ">山理工</a> &nbsp; &nbsp; </marquee> 
    	
    </td>
    <td><font color="red"> &nbsp;&nbsp;Copyright&copy;&nbsp;Happy BookShop </font>
   
    </td>
    </tr>
    </table>
    
     
  </body>
</html>
