package com.chinasofti.etc.happybookshop.service.serviceimpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import com.chinasofti.etc.happybookshop.dao.BookDao;
import com.chinasofti.etc.happybookshop.po.Book;
import com.chinasofti.etc.happybookshop.service.BookService;


public class BookServiceImpl implements BookService {

	private static BookDao bookDao = null;
	static{
		File file = new File("f:\\myconfig.properties");
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String DaoString = properties.getProperty("DaoBook");
		try {
			bookDao = (BookDao)Class.forName(DaoString).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public int findMaxBookId() {
		// TODO Auto-generated method stub
		return bookDao.findMaxBookId();
	}

	public Book findBookById(int bookId) {
		// TODO Auto-generated method stub
		return bookDao.findBookById(bookId);
	}

	public Book findBookByName(String bookName) {
		// TODO Auto-generated method stub
		return bookDao.findBookByName(bookName);
	}

	public List<Book> findAllBook() {
		// TODO Auto-generated method stub
		return bookDao.findAllBook();
	}

	public int insertBook(Book book) {
		// TODO Auto-generated method stub
		return bookDao.insertBook(book);
	}

	public int deleteBookById(int bookId) {
		// TODO Auto-generated method stub
		return bookDao.deleteBookById(bookId);
	}

	public int deleteBookByName(String bookName) {
		// TODO Auto-generated method stub
		return bookDao.deleteBookByName(bookName);
	}

	public int upateBookByBookId(int bookId, Book newBook) {
		// TODO Auto-generated method stub
		return bookDao.upateBookByBookId(bookId, newBook);
	}

	public int updateBookByBookName(String bookName, Book newBook) {
		// TODO Auto-generated method stub
		return bookDao.updateBookByBookName(bookName, newBook);
	}

	public List<Book> findBooksByBookType(int bookType) {
		// TODO Auto-generated method stub
		return bookDao.findBooksByBookType(bookType);
	}

}
