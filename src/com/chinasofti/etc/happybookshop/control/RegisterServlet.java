package com.chinasofti.etc.happybookshop.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chinasofti.etc.happybookshop.dao.UserDao;
import com.chinasofti.etc.happybookshop.dao.sqlserverimpl.UserDaoImpl;
import com.chinasofti.etc.happybookshop.po.Order;
import com.chinasofti.etc.happybookshop.po.User;
import com.chinasofti.etc.happybookshop.service.UserService;
import com.chinasofti.etc.happybookshop.service.serviceimpl.UserServiceImpl;

public class RegisterServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public RegisterServlet() {
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
		
		String userName = request.getParameter("userName");
		String userPassword = request.getParameter("userPassword");
		int userAuthority = 1;
		String userAddr = request.getParameter("add");
		String phoneNum = request.getParameter("telephone");
		String email = request.getParameter("e-mail");
		
		User user = new User(userName, userPassword, userAuthority, userAddr, phoneNum, email);
		
		
		UserService useService = new UserServiceImpl();
		int result = 0;
		User user2 = useService.findUserByName(userName);
		if (user2 == null) {
			result = useService.insertUser(user);
		}
		
		System.out.println("registerResult=" + result);
		
		HttpSession session = request.getSession();
		session.setAttribute("registerResult", result);
		response.sendRedirect("registerResult.jsp");
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
