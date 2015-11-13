<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 
 
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
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
	function Reset()
	{
		var result=confirm("你确定重置吗？");
		return result;
	}
	function isEmpty(s) 
	{
  		if (s == null || s.length == 0)
    		return true;
  					// 如果有一个为非空，则test返回true，表示字符串非空。
						// 若test返回true，表示字符串为空。
 		 return !/\S/.test(s);
	}

	function check()
	{
		var s=document.getElementById("register");
		var len=document.getElementById("register").length;
		
		for(var i=0;i<len;i++){
			if(s.elements.item(i).value==""){
				alert("资料填写不完整！");
				return false;
			}
		}
	
	
	
		
	
	}
	function acc()
	{
		var a=document.getElementById("accept");
		var b=document.getElementById("notaccept");
		if(a.value=="")
		{
			alert("请选择同意");
			return false;
		}
		
	}
 	function name(userName){
	   	  var username=document.getElementById("userName");
		 
		  if(username.value=="")
		  {
		  		alert("用户名不能为空");
			  return false;
			 
		  }
		 return true;
	  }
	  function password(password){
	   	  var pass=document.getElementById("password");
		 
		  if(pass.value=="")
		  {
		  		alert("用户名不能为空");
			  return false;
			 
		  }
		 return true;
	  }

	function checkemail()
	{
		//判断输入是否为空
		if(document.getElementById("email").value.length!=0)
		{
			//分别检测是否包含字符“@”、“.”及其位置
			if(document.getElementById("email").value.charAt(0)=="."||
   				document.getElementById("email").value.charAt(0)=="@"||
   				document.getElementById("email").value.indexOf('@',0)==-1||
   				document.getElementById("email").value.indexOf('.',0)==-1||
   				document.getElementById("email").value.lastIndexOf('@')==document.zhuce.email.value.length-1||
   				document.getElementById("email").value.lastIndexOf('.')==document.zhuce.email.value.length-1
  				)
			{
				//如果格式不正确
				alert("E-mail 不合法!");
				document.getElementById("email").focus();
				return false;
			}
		}
		else
		{
			alert("Email 不可为空");
			document.getElementById("email").focus();
			return false;
		}
		return false;
	}




	function qr(password,querenpassword){
		  var a=document.getElementById(password);
		  var b=document.getElementById(querenpassword);
		  if(a.value!=b.value){
		  		alert("密码不一致");
		  		return false;
			}
		  return true;
	}


</script>
  <!--  <base href="http://localhost:8888/HappyBookshop/"> --> 
    
    <title></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
 
  </head>
  
  <body  bgcolor="BFEEFF" >
	<table width="80%" border="0" bgcolor="#B0E5FF" align="center">
		<tr><td>
	    &nbsp;<span ><a href="index1.jsp" ><font color="blick">欢迎光临 Happy BookShop</font></a></span>       
		&nbsp;<span ><a href="login.jsp"  ><font color="blick">登陆</font></a></span>       
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
        <center><font color="red" size="+3" face="隶书"> Happy  BookShop 账号注册</font> </center>
        <table align="center" cellspacing="0" cellpadding="60" width="600"  border="0" >
        <tr>
        	<td width="60" height="500"><marquee height="500px" direction="up"  onmouseover="this.stop()" onmouseout="this.start()" ><font face="隶书" size="15" color="blue">书山有路勤为径</font></marquee></td>
        	<td width="600">
        		
 			<table  cellspacing="0" cellpadding="10" width="550  border="0"  bgColor="#1cf9ee">
    			
    			<tr>
    				<td background="images/mr.gif">
    					<form action="registerServlet" method="post" id="register" onreset="return Reset()"  onsubmit="return check()" >	
    					<center><font color="red" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<p>亲，可一定要填写您的真实信息哦&nbsp;</font></center><p>
    	
    				<center>用 户 名:&nbsp;&nbsp;
    				<input style="background-color:#BFEEFF" type="text" name="userName" id="userName"  width="100" size="25"  onblur="name('userName')"><br><p>
    				
    			
    				密  &nbsp; &nbsp;&nbsp;&nbsp;   码:&nbsp;&nbsp;
    				<input style="background-color:#BFEEFF" type="password" name="userPassword" id="password" width="100" size="27" onblur="password('password')"><br><p>
    				
    		确认密码:&nbsp;&nbsp;
    				<input style="background-color:#BFEEFF" type="password" name="password" id="querenpassword" width="100" size="27" onblur="qr('password','querenpassword')"><br><p>
    			家庭地址:&nbsp;&nbsp;
    				<input style="background-color:#BFEEFF" type="text" name="add" id="add" width="100" size="25"><br><p>
    			联系电话:&nbsp;&nbsp;
    				<input style="background-color:#BFEEFF" type="text" name="telephone" id="telephone" width="100" size="25"><br><p>
    			
    				电子邮件:&nbsp;&nbsp;
    				<input style="background-color:#BFEEFF" type="text" name="e-mail" id="email" width="100" size="25" ><br><p></center>
    				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    					
    				<fieldset style="overflow-y" ><center>《Happy BookShop 使用协议》</center>
    				<p>1、特别提示<p>&nbsp;&nbsp;&nbsp;1.1、用户注册成功后，该用户帐号和密码由用户负责保管。<p>
    		&nbsp;&nbsp;&nbsp;
    		1.2、用户注册成功后，在使用购物服务的过程中，本公司有权基于用户的操作行为进行非商业性的调查研究<p>
    		2、请遵守国家的法律法规政策</fieldset><p>
    		<center>
    		<input type="radio" value="同意" id="accept" checked="checked" name="accept" onblur="acc()"/>同意&nbsp;&nbsp;&nbsp;&nbsp;
    		<input type="radio" value="同意" id="notaccept"  name="accept" onblur="acc()"/>不同意&nbsp;&nbsp;&nbsp;&nbsp;
    			
    				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    				<input type="submit" value="注册" name="submit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    				<input type="reset" value="重置" name="reset"></center>
    				</form>
    			</td>
    			</tr>
	</table>
   			</td>
   			<td width="60">
   			<marquee height="500px" direction="up"  onmouseover="this.stop()" onmouseout="this.start()">
   			<font face="隶书" size="15" color="blue">学海无涯苦作舟</font>
   			</marquee>
   		</td>
   </tr>	
  </table>
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

