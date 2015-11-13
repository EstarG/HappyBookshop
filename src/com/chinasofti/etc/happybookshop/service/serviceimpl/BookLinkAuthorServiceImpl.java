package com.chinasofti.etc.happybookshop.service.serviceimpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import com.chinasofti.etc.happybookshop.dao.BookLinkAuthorDao;
import com.chinasofti.etc.happybookshop.po.BookLinkAuthor;
import com.chinasofti.etc.happybookshop.service.BookLinkAuthorService;

public class BookLinkAuthorServiceImpl implements BookLinkAuthorService{

	private static BookLinkAuthorDao bookLinkAuthorDao = null;
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
		String DaoString = properties.getProperty("DaoBookLinkAuthor");
		try {
			bookLinkAuthorDao = (BookLinkAuthorDao)Class.forName(DaoString).newInstance();
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
	public List<Integer> findAuthorIdByBookId(int bookId) {
		// TODO Auto-generated method stub
		return bookLinkAuthorDao.findAuthorIdByBookId(bookId);
	}

	public List<Integer> findBookIdByAuthorId(int AuthorId) {
		// TODO Auto-generated method stub
		return bookLinkAuthorDao.findBookIdByAuthorId(AuthorId);
	}

	public int insertBookLinkAuthor(BookLinkAuthor bookLinkAuthor) {
		// TODO Auto-generated method stub
		return bookLinkAuthorDao.insertBookLinkAuthor(bookLinkAuthor);
	}

	public int deleteBookLinkAuthorByBookId(int bookId) {
		// TODO Auto-generated method stub
		return bookLinkAuthorDao.deleteBookLinkAuthorByBookId(bookId);
	}

	public int deleteBookLinkAuthorByAuthorId(int AuthorId) {
		// TODO Auto-generated method stub
		return bookLinkAuthorDao.deleteBookLinkAuthorByAuthorId(AuthorId);
	}

	public int updateBookLinkAuthorByBookId(int bookId,
			BookLinkAuthor newBookLinkAuthor) {
		// TODO Auto-generated method stub
		return bookLinkAuthorDao.updateBookLinkAuthorByBookId(bookId, newBookLinkAuthor);
	}

	public int updateBookLinkAuthorByAuthorId(int authorId,
			BookLinkAuthor newBookLinkAuthor) {
		// TODO Auto-generated method stub
		return bookLinkAuthorDao.updateBookLinkAuthorByAuthorId(authorId, newBookLinkAuthor);
	}
}
