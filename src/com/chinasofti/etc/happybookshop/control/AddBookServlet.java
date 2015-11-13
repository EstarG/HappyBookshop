package com.chinasofti.etc.happybookshop.control;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasofti.etc.happybookshop.po.Author;
import com.chinasofti.etc.happybookshop.po.Book;
import com.chinasofti.etc.happybookshop.po.BookLinkAuthor;

import com.chinasofti.etc.happybookshop.service.AuthorService;
import com.chinasofti.etc.happybookshop.service.BookLinkAuthorService;
import com.chinasofti.etc.happybookshop.service.BookService;

import com.chinasofti.etc.happybookshop.service.serviceimpl.AuthorServiceImpl;
import com.chinasofti.etc.happybookshop.service.serviceimpl.BookLinkAuthorServiceImpl;
import com.chinasofti.etc.happybookshop.service.serviceimpl.BookServiceImpl;
import com.chinasofti.etc.happybookshop.service.serviceimpl.UserServiceImpl;
import com.sun.org.apache.bcel.internal.generic.ATHROW;

public class AddBookServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public AddBookServlet() {
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
		String bookName1 = request.getParameter("bookName").trim();
		String bookName = new String(bookName1.getBytes("ISO-8859-1"),"utf-8");
		
 		String bookPublisher1 = request.getParameter("bookPublisher").trim();
 		String bookPublisher = new String(bookPublisher1.getBytes("ISO-8859-1"),"utf-8");
 		
		String strBookPrice = request.getParameter("bookPrice").trim();
		double bookPrice = Double.parseDouble(strBookPrice);
		
		String bookDetails1 = request.getParameter("bookDetails").trim();
		String bookDetails = new String(bookDetails1.getBytes("ISO-8859-1"),"utf-8");
		
		String bookIsbn = request.getParameter("bookIsbn").trim();
		String bookPictureName = request.getParameter("bookPictureName").trim();
		String strBookType = request.getParameter("bookType");
		int bookType = Integer.parseInt(strBookType.trim());
		
		String strAuthors1 = request.getParameter("authorsName");
		String strAuthors = new String(strAuthors1.getBytes("ISO-8859-1"),"utf-8");
		String [] authors = strAuthors.split(";");
		//获得书籍的ID
		BookService bookService = new BookServiceImpl();
		int bookId = bookService.findMaxBookId() + 1;
		
		AuthorService authorService = new AuthorServiceImpl();
		BookLinkAuthorService bookLinkAuthorService = new BookLinkAuthorServiceImpl();
		
		for(int i = 0; i < authors.length; i++) {
			System.out.println(authors[i]);
			Author author = authorService.findAuthorByAuthorName(authors[i].trim());
			
			int authorId = 0;
			//作者不存在
			if (author == null){
				authorId = authorService.findMaxAuthorId();
				//System.out.println("*********>>>" + authorId);
				authorId++;
				//System.out.println("*********" + authorId);
				Author author2 = new Author(authorId,authors[i].trim());
				//System.out.println(author2.getAuthorId() +" " + author2.getAuthorName());
				authorService.insertAuthor(author2);//插入作者表
			}//作者已经存在
			else{
				authorId = author.getAuthorId();
			}
			BookLinkAuthor bookLinkAuthor = new BookLinkAuthor(bookId,authorId);//获得bookID和作者Id之后插入表中
			bookLinkAuthorService.insertBookLinkAuthor(bookLinkAuthor);
		}
		
		
		Book book = new Book(bookName, bookPublisher, bookPrice, bookIsbn, bookDetails, bookPictureName, bookType);
		
		int result = bookService.insertBook(book);
		if (result > 0) {
			System.out.println("添加新书成功");
			response.sendRedirect("admin/OperateOk.jsp");
		} else {
			System.out.println("添加新书失败");
			response.sendRedirect("admin/OperateFail.jsp");
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
