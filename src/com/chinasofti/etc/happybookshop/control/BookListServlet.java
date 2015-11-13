package com.chinasofti.etc.happybookshop.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chinasofti.etc.happybookshop.dao.BookDao;
import com.chinasofti.etc.happybookshop.po.Book;
import com.chinasofti.etc.happybookshop.po.Category;
import com.chinasofti.etc.happybookshop.po.User;
import com.chinasofti.etc.happybookshop.service.BookService;
import com.chinasofti.etc.happybookshop.service.CategoryService;
import com.chinasofti.etc.happybookshop.service.UserService;
import com.chinasofti.etc.happybookshop.service.serviceimpl.BookServiceImpl;
import com.chinasofti.etc.happybookshop.service.serviceimpl.CategoryServiceImpl;
import com.chinasofti.etc.happybookshop.service.serviceimpl.UserServiceImpl;

public class BookListServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public BookListServlet() {
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
		// 初始化图书列表
		BookService bookService = new BookServiceImpl();
		List<Book> books = bookService.findAllBook();
//		System.out.println(books.size());
//		for (Book b : books) {
//			System.out.println(b.getBookName());
//		}
		
		HttpSession session = request.getSession();
		session.setAttribute("books", books);
		
		// 初始化用户权限
		int userAuthority = 0;
		session.setAttribute("authority", userAuthority);
		// 初始化图书分类列表
		CategoryService categoryService = new CategoryServiceImpl();
		Set<Category> categories = categoryService.findAllCategory();
		session.setAttribute("categories", categories);
		
		
		response.sendRedirect("index1.jsp");
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
