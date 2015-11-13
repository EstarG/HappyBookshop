package com.chinasofti.etc.happybookshop.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chinasofti.etc.happybookshop.po.Log;
import com.chinasofti.etc.happybookshop.po.User;
import com.chinasofti.etc.happybookshop.service.LogService;
import com.chinasofti.etc.happybookshop.service.UserService;
import com.chinasofti.etc.happybookshop.service.serviceimpl.LogServiceImpl;
import com.chinasofti.etc.happybookshop.service.serviceimpl.UserServiceImpl;

public class LoginServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public LoginServlet() {
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
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		//System.out.println(">>>>>>>>>>" + userName + "  " + password);
		
		
		// 将所有用户查找出来，获得每个用户的Order 以及每个Order的OrderDetail
		UserService userService = new UserServiceImpl();
		List<User> users = userService.findAllUsers();
		session.setAttribute("users", users);
		
		
		//将当前登录用户的信息放入session;
		for (User user: users){
			if (user.getUserName().equals(userName)){
				session.setAttribute("user", user);
				//System.out.println(">>>>>>>>>>>>>888" +user.getUserName());
				//生成日志
				LogService logService = new LogServiceImpl();
				int maxId = logService.findMaxLogId();
				//获取时间
				java.util.Date date = new java.util.Date();
				java.sql.Date dateTime = new java.sql.Date(date.getTime());
				Log log = new Log(maxId + 1,user.getUserId(),dateTime,"用户登录");
				logService.insertLog(log);
				
				break;
			}
		}
		
		User user = userService.findUserByName(userName);
		int userAuthority = 0;
		if (user != null) {
			userAuthority = user.getUserAuthority();
		}
		if (userService.isValuedUser(userName, password) != 0) {
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("userName", userName);
			httpSession.setAttribute("authority", userAuthority);
			response.sendRedirect("index1.jsp");
		} else {
			RequestDispatcher rdp = request.getRequestDispatcher("login.jsp");
			rdp.forward(request, response);
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
