package com.chinasofti.etc.happybookshop.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chinasofti.etc.happybookshop.po.Log;
import com.chinasofti.etc.happybookshop.po.Order;
import com.chinasofti.etc.happybookshop.po.OrderDetail;
import com.chinasofti.etc.happybookshop.po.User;
import com.chinasofti.etc.happybookshop.service.LogService;
import com.chinasofti.etc.happybookshop.service.OrderDetailService;
import com.chinasofti.etc.happybookshop.service.OrderService;
import com.chinasofti.etc.happybookshop.service.serviceimpl.LogServiceImpl;
import com.chinasofti.etc.happybookshop.service.serviceimpl.OrderDetailServiceImpl;
import com.chinasofti.etc.happybookshop.service.serviceimpl.OrderServiceImpl;
import com.chinasofti.etc.happybookshop.vo.CartItem;

public class ConfirmBuy extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ConfirmBuy() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		//得到当前购物用户的信息，这里已经带了Order
		User user = null;
		user = (User)session.getAttribute("user");
		if (user == null){
			response.sendRedirect("userNotLogin.jsp");
		}
		else{
		
			// 创建订单详细细节对象
			List<OrderDetail>  orderDetails = new ArrayList<OrderDetail>();
			//创建订单
			Order order = new Order();
			//得到购物车
			Map<String,CartItem> cart = (HashMap<String, CartItem>)session.getAttribute("cart");
			
			OrderService orderService = new OrderServiceImpl();
			OrderDetailService orderDetailService  = new OrderDetailServiceImpl();
			
			
			//初始化Order对象
			order.setOrderId(orderService.findMaxOrderId() + 1);
			java.util.Date date = new java.util.Date();
			java.sql.Date dateTime = new java.sql.Date(date.getTime()); 
			order.setDate(dateTime);
			//记录总价钱
			double totalMoney = 0;
			//order.setDate(date)
			//System.out.println("<><><><><><>******" + user.getUserName() + "  " + user.getUserPassword());
			Iterator<CartItem> iterator = cart.values().iterator();
			
			while (iterator.hasNext()){
				CartItem cartItem = iterator.next();
				totalMoney += cartItem.getSmallTotal();
				//每一本书对应一个OrderDetail
				OrderDetail orderDetail = new OrderDetail();
				orderDetail.setBook(cartItem.getBook());
				orderDetail.setBookNum(cartItem.getBookNum());
				orderDetail.setOrder(order);
				//没生成一个OrderDetail就往数据里送
				orderDetailService.insertOrderDetails(orderDetail);
				
				orderDetails.add(orderDetail);
			}
			
			//初始化Order对象的总价钱
			order.setOrderTotal(totalMoney);
			//初始化化Order对象的Uer
			order.setUser(user);
			//出事话Set<OrderDetail>
			Iterator<OrderDetail> iterator2 = orderDetails.iterator();
			while (iterator2.hasNext()){
				OrderDetail orderDetail = iterator2.next();
				order.getOrderDetails().add(orderDetail);
			}
			//1：将订单放入数据库
			orderService.insertOrder(order);
			session.setAttribute("order", order);
			//更新session里面的User
			user.getOrders().add(order);
			session.setAttribute("user", user);
			//2:订单细节放到session里面
			session.setAttribute("orderDetails", orderDetails);
			//3：初始化购物车
			cart = null;
			session.setAttribute("cart", cart);
			
			//4：生成日志
			LogService logService = new LogServiceImpl();
			int maxId = logService.findMaxLogId();
			//获取时间
	
			Log log = new Log(maxId + 1,user.getUserId(),dateTime,"用户购书");
			logService.insertLog(log);
			
			//5：页面跳转
			response.sendRedirect("orderDetail.jsp");
		}
		 
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
