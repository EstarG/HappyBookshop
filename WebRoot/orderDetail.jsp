<%@page import="com.chinasofti.etc.happybookshop.service.EmployeeService"%>
<%@page import="com.chinasofti.etc.happybookshop.service.serviceimpl.EmployeeServiceImpl"%>
<%@page import="com.chinasofti.etc.happybookshop.po.Employee"%>
<%@page import="com.chinasofti.etc.happybookshop.po.OrderDetail"%>
<%@page import="com.chinasofti.etc.happybookshop.po.Order"%>
<%@page import="com.chinasofti.etc.happybookshop.po.User"%>

<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'bookcart.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <link href="style.css" rel="stylesheet" type="text/css" />
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
<meta http-equiv="Content-Type" content="text/html;charset=gb2312">
<title>菜单效果</title>
<style>
/* 先把这个 xmenu 的样式放到css里 */
.xmenu td
{
font-size:12px;
font-family:verdana,arial;
font-weight:bolder;
color:#ffffff;
border:1px solid #336699;
background:#336699;
filter:blendtrans(duration=0.5);
cursor:hand;
text-align:center;
}
</style>

<script language="JavaScript">
<!--
//这是把事件动作绑定到菜单上的函数
function attachXMenu(objid)
{
    var tds=objid.getElementsByTagName('td');
    for(var i=0;i<tds.length;i++)
    {
        with(tds[i])
        {
            onmouseover=function()
            {
                with(this)
                {
                    filters[0].apply();
                    style.background='#FEBD20'; //这是鼠标移上去时的背景颜色
                    style.border='1px solid #ffffff'; //边框
                    style.color='black'; //文字颜色
                    filters[0].play();
                }
            }
            onmouseout=function()
            {
                with(this)
                {
                    filters[0].apply();
                    style.background='#336699'; //这是鼠标离开时的背景颜色
                    style.border='1px solid #336699'; //边框
                    style.color='#ffffff'; //文字颜色
                    filters[0].play();
                }
            }
        }
    }
}
//-->
</script>
  </head>
  
  <body >
<!--顶部图片-->
<div id=toppic>
<img src="images/logo.png" width="70px" height="70px" style="position:absolute;visibility:visible;top:20px;left:100px" />
<font size="+5" color="white" face="华文彩云" style="position:absolute;visibility:visible;top:50px;left:180px" >
开心购书网
</font>
</div>
<div ><!--top标签开始-->
		<table width="100%" border="0" bgcolor="#C5a5a7" align="center">
		<tr><td>
		<div align="left" >
	    &nbsp;<span ><a href="index1.jsp" a ><font color="blick">欢迎光临小站</font></a></span>       
   		</td></tr></table>     
        </div>
      <!--菜单从这里开始, 注意要把class设置成和css里相同的, 还要为它设一个id-->
<table class="xmenu" id="xmenu0" width="800" cellpadding="1" cellspacing="4" border="0" bgcolor="#00000" align="center">
    <tr>
        <td>&nbsp;&nbsp;童&nbsp;&nbsp;书&nbsp;&nbsp;</td>
        <td>&nbsp;&nbsp;教&nbsp;&nbsp;材&nbsp;&nbsp;</td>
        <td>&nbsp;&nbsp;考试小说&nbsp;&nbsp;</td>
        <td>&nbsp;&nbsp;小&nbsp;&nbsp;说&nbsp;&nbsp;</td>
        <td>&nbsp;&nbsp;人文社科&nbsp;&nbsp;</td>
        <td>&nbsp;&nbsp;生&nbsp;&nbsp;活&nbsp;&nbsp;</td>
         <td>&nbsp;&nbsp;励&nbsp;&nbsp;志&nbsp;&nbsp;</td>
          <td>&nbsp;&nbsp;预&nbsp;&nbsp;售&nbsp;&nbsp;</td>
           <td>&nbsp;&nbsp;特&nbsp;&nbsp;价&nbsp;&nbsp;</td>
            <td>&nbsp;&nbsp;新书上市&nbsp;&nbsp;</td>
              <td>&nbsp;&nbsp;口碑好书&nbsp;&nbsp;</td>
    </tr>
</table>

<script>attachXMenu(xmenu0); //在上面这个table结束的地方执行事件动作的绑定, 这里的这个xmenu0就是那个table的id</script>
        <hr size="1" color="#C5a5a7">
    </div>
    <div  align="right" id="left">
<ul>
		<img src="images/03.gif" /><a  style="color:#0094ce" href="orderDetail.jsp">我的订单</a><br /><br />
		<img src="images/03.gif" /><a  style="color:#0094ce" href="orderhistory.jsp">订单历史</a><br /><br />
        <img src="images/03.gif" /><a  style="color:#0094ce" href="havebuyedbook.jsp">已购商品</a><br /><br />
		</ul>
</div>
<div id=righttop >
<!-- JAVA S -->
<%
	//获得订单细节
	List<OrderDetail> orderDetails = (List<OrderDetail>)session.getAttribute("orderDetails");
	Order order = (Order)session.getAttribute("order");
	//获得员工
	EmployeeService employeeService = new EmployeeServiceImpl();
	Employee employee = employeeService.findEmployeeById(((int)Math.random()*10)%5 + 1);//这里用Math.random实现
	//获得用户地址
	User user = (User)session.getAttribute("user");
%>
<!-- JAVA E -->
<table id="list" width="700px" align="center" border="1">
<tr><td>&nbsp;&nbsp;<font size="+1" face="黑体" >订单号：</font><%=order.getOrderId()%></td><td>  <font size="+1" face="黑体" >日期:</font><%=order.getDate()%><td><td></td><td> <font size="+1" face="黑体" >制单人：</font><%=employee.getEmployeeName() %></td></tr>

	<!-- 循环枚举购买的书记 -->
	 <tr>
        <td>&nbsp;&nbsp;<font size="+1" face="黑体" >序&nbsp;&nbsp;号&nbsp;&nbsp;</font></td>
        <td>&nbsp;&nbsp;<font size="+1" face="黑体" >书&nbsp;&nbsp;名&nbsp;&nbsp;</font></td>
        <td>&nbsp;&nbsp;<font size="+1" face="黑体" >单&nbsp;&nbsp;价&nbsp;&nbsp;</font></td>
        <td>&nbsp;&nbsp;<font size="+1" face="黑体" >数&nbsp;&nbsp;量&nbsp;&nbsp;</font></td>
         <td>&nbsp;&nbsp;<font size="+1" face="黑体" >小&nbsp;&nbsp;计&nbsp;&nbsp;</font></td>
      
    </tr>
	<%
		Iterator<OrderDetail> iterator = orderDetails.iterator();
		int no = 0;
		while (iterator.hasNext()){
		no++;
		OrderDetail orderDetail = iterator.next();
	%>
		<tr>
	        <td><%=no %></td>
	        <td><%=orderDetail.getBook().getBookName() %></td>
	        <td><%=orderDetail.getBook().getBookPrice() %></td>
	        <td><%=orderDetail.getBookNum() %></td>
	        <td><%=orderDetail.getBookNum()*orderDetail.getBook().getBookPrice() %></td>
	       
	      
	    </tr>
		    
	<%}%>
   
<br/><br/>
<br/>
<br/>
<br/>
<br/>

<tr>
<td><font size="+1" face="黑体" >总价：</font><%=order.getOrderTotal()%></td><td><font size="+1" face="黑体" >送货人：</font><%=employee.getEmployeeName() %></td><td><font size="+1" face="黑体" >收款人：</font><%=employee.getEmployeeName()%></td><td><font size="+1" face="黑体" >送货地址：</font><%=user.getUserAddr() %></td>
</tr>
</table>
<br/>
</div>
  </body>
</html>
