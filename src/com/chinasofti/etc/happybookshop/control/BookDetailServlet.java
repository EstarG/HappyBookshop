package com.chinasofti.etc.happybookshop.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chinasofti.etc.happybookshop.po.Author;
import com.chinasofti.etc.happybookshop.po.Book;
import com.chinasofti.etc.happybookshop.po.BookLinkAuthor;
import com.chinasofti.etc.happybookshop.service.AuthorService;
import com.chinasofti.etc.happybookshop.service.BookLinkAuthorService;
import com.chinasofti.etc.happybookshop.service.BookService;
import com.chinasofti.etc.happybookshop.service.serviceimpl.AuthorServiceImpl;
import com.chinasofti.etc.happybookshop.service.serviceimpl.BookLinkAuthorServiceImpl;
import com.chinasofti.etc.happybookshop.service.serviceimpl.BookServiceImpl;

public class BookDetailServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public BookDetailServlet() {
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
		String strBookId = request.getParameter("bookId");
		int bookId = Integer.parseInt(strBookId.trim());//除去多余空格
		
		//找到相应的书
		BookService bookService = new BookServiceImpl();
		Book book = bookService.findBookById(bookId);
		System.out.println(book.getBookPictureName());
        
		HttpSession session = request.getSession();
		session.setAttribute("book", book);
		//通过BookId找用户
		AuthorService authorService = new AuthorServiceImpl();
		
		BookLinkAuthorService bookLinkAuthorService = new BookLinkAuthorServiceImpl();
		List<Integer> authorIds = bookLinkAuthorService.findAuthorIdByBookId(bookId);

		Iterator<Integer> iterator = authorIds.iterator();
		
		List<Author> authors = new ArrayList<Author>();
		
		while (iterator.hasNext()){
			Integer authorId = iterator.next();
			Author author = authorService.findAuthorByAuthorId(authorId);
			authors.add(author);
		}
		session.setAttribute("authors", authors);
		response.sendRedirect("bookdetail.jsp");
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
