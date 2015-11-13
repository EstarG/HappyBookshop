<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import = "com.chinasofti.etc.happybookshop.po.Book"%>
<%@ page import = "com.chinasofti.etc.happybookshop.po.Author"%>
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

function choiseBookNum()
{
	document.getElementById("bookNum").value = "";
}

function submitBookNum()
{
	var bookNum = document.getElementById("bookNum").value;
	if (bookNum == "" || bookNum == 0 || bookNum == "请输入数量" || isNaN(bookNum))
	{
		alert("请输入购买数量");
		return false;
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
    

<div id=bookimage>
 <!-- JAVA S-->
  	  <%
  	  	Book book = (Book)session.getAttribute("book");
  	  	List<Author> authors = (List<Author>)session.getAttribute("authors");
  	   %>
 <!-- JAVA E-->
<img alt="图书封面" src="<%="images/"+book.getBookPictureName()%>" width="250px" height="300px" >
</div>
<div id=detail align="left">
<span><font size="+2" face="华文琥珀">出版社:<%=book.getBookPublisher()%>  </font></span><br /><br />
<span><font size="+2" face="华文琥珀">I&nbsp;S&nbsp;B&nbsp;N:<%=book.getBookIsbn() %></font></span><br /><br />
<span><font size="+2" face="华文琥珀">书&nbsp;&nbsp;名&nbsp;&nbsp;:<%=book.getBookName() %></font></span><br /><br />
<span><font size="+2" face="华文琥珀">作&nbsp;&nbsp;者&nbsp;&nbsp;:<%
	Iterator<Author> iterator = authors.iterator();
	int authorNums = 0;//限定个数
	while (iterator.hasNext() && authorNums < 3){
		Author author = iterator.next();
		authorNums++;
		%>
		<%=author.getAuthorName() %>
	<% }%>
	</font></span><br /><br />
<span><font size="+2" face="华文琥珀">简&nbsp;&nbsp;介&nbsp;&nbsp;:<%=book.getBookDetails() %></font></span><br /><br /><br /><br />
<span><font size="+1" face="幼圆" color="red">价&nbsp;&nbsp;格&nbsp;&nbsp;:<%=book.getBookPrice() %></font></span><br /><br />
   <div align="left" style="margin-bottom: 4px; " id="quantityDropdownDiv">
      <span style="color:#666;"><label for="quantity">选择购买数量：</label></span>
   
<form action="cartServlet" method="get" onsubmit="return submitBookNum()">
	<input type="text" value="请输入数量" name="bookNum" onfocus="choiseBookNum()">
	<input type="submit" name="submit" value="确定"">
</form>



</div>
</div>
<div>
 <hr align="center" size="3" width="800px">
</div>
  </body>
</html>
