<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import = "com.chinasofti.etc.happybookshop.vo.CartItem"%>
<%@ page import = "com.chinasofti.etc.happybookshop.po.Author"  %>
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
  
  <body>
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
        <hr size="1" color="#C5a5a7">
    </div>
<center>
      <h1>
      欢迎查看购物车
      <!-- JAVA  S-->
      <%
        //这里获得购物车信息 
      	Map<String,CartItem> cart = (HashMap<String,CartItem>)session.getAttribute("cart");
      	//List<CartItem> cartItems = (List<CartItem>)cart.values();
      	//获得作者信息
      	List<Author> authors = (List<Author>)session.getAttribute("authors");
      %>
      <!-- JAVA E -->
      <img src="images/gouwu01.png" height="50px"/>
      </h1>
      <hr width="90%" size="1">
          
       <div id=bookcart>
        <div id=bookcartone>
       请选择支付人
      <input type="radio" name="city" value="beijing" checked>自己
	 &nbsp; &nbsp;
	     <input type="radio" name="city" value="nanjing">其他用户  &nbsp; &nbsp; &nbsp; 
    
        <select name="select">
	      <option>支付宝</option>
	      <option>网上银行支付</option>
        </select>
        </div>
        <!-- 确认购买   还需布局 -->
       <div id=bookcarttwo>
      <form action="confirmBuy" method="get">
        	<input type="submit" name="Submit" value=" 确定 " />
        </form>
        </div>
      </div>
        <!-- 这里点击继续购买，实现累加 跳转到书列表 -->
        <div id=cartbookS>
        <form action="index1.jsp" method="get">
        	<input type="submit" value="继续购买" name="B2" onclick="">
        </form>
        
	    <form action="clearBookCart" method="post"">
	        <input type="submit" value="清空购物车" name="B3" onclick="">
	    </form>
       
</div>
<from action="modifycart.jsp" method="post">
              <table border="1" cellpadding="0" width="500" bgcolor="#ffffff">
                  <tr> <td width="116"><div align="center"><b>书名</b></div></td>
                  <td width="116"><div align="center"><b>作者</b></div></td>
                  <td width="116"><div align="center"><b>单价</b></div></td>
                  <td width="116"><div align="center"><b>购买数量</b></div></td> </tr>
                  <!-- JAVA S -->
                  <% 
                    if (cart != null){
	                  	Iterator<CartItem> iterator = cart.values().iterator();
	                  	while (iterator.hasNext()){
	                  		CartItem cartItem = iterator.next();
                  %>
                  		<tr><td><div align="center"><%=cartItem.getBook().getBookName() %></div></td>
			            <td><div align="center"><%= cartItem.getBook().getBookPublisher()%></div></td>
			            <td><div align="center"><%=cartItem.getBook().getBookPrice() %></div></td>
			            <td><div align="center"><%=cartItem.getBookNum()%></div></td>
			            <td width="50px">
			            	<div align="center">
			            		<!-- 删除当前书籍的订单 -->
			            		<a href="deleteBookCart?cartBookId=<%=cartItem.getBook().getBookId() %>" ><img src="images/delete.png" /></a>
			            	</div>
			            </td>
			            </tr>
                  	      <% }%>
                  <% }%>
                  <!-- JAVA E -->
           

            
         <br/>
  </body>
</html>
