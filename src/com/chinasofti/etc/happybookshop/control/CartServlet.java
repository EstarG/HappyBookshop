package com.chinasofti.etc.happybookshop.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chinasofti.etc.happybookshop.po.Book;
import com.chinasofti.etc.happybookshop.vo.CartItem;

public class CartServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public CartServlet() {
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
		
		//�õ��ϲ㴫���ļ��빺�ﳵ���������
		String strBookNum = request.getParameter("bookNum");
		int bookNum = Integer.parseInt(strBookNum.trim());
		
		
		
		//������bookDetails����Ѿ����
		Book book = (Book)session.getAttribute("book");


		Map<String,CartItem> cart = (HashMap<String, CartItem>)session.getAttribute("cart");
		
		//������ﳵ������
		if (cart == null)
		cart = new HashMap<String, CartItem>();
		//cart.put(cartItem.getBook().getBookIsbn(), cartItem);  
		
		//�������
		CartItem cItem = cart.get(book.getBookIsbn());
		//�Ȿ���һ����Ļ�
		if (cItem == null){
			CartItem cartItem = new CartItem(book,bookNum,bookNum*book.getBookPrice());
			cart.put(book.getBookIsbn(), cartItem);
		}//������
		else{
			cItem.setBookNum(cItem.getBookNum() + bookNum);
			cItem.setSmallTotal(cItem.getSmallTotal() + bookNum*cItem.getBook().getBookPrice());
			cart.put(cItem.getBook().getBookIsbn(), cItem);
		}
		session.setAttribute("cart", cart);
		//���ﹺ�ﳵ��
		response.sendRedirect("bookcart.jsp");
		
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
