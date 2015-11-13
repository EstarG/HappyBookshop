package com.chinasofti.etc.happybookshop.service.serviceimpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.chinasofti.etc.happybookshop.dao.AuthorDao;
import com.chinasofti.etc.happybookshop.po.Author;
import com.chinasofti.etc.happybookshop.service.AuthorService;

public class AuthorServiceImpl implements AuthorService{

	private static AuthorDao authorDao = null;
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
		String DaoString = properties.getProperty("DaoAuthor");
		try {
			authorDao = (AuthorDao)Class.forName(DaoString).newInstance();
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
	public int findMaxAuthorId() {
		// TODO Auto-generated method stub
		return authorDao.findMaxAuthorId();
	}

	public Author findAuthorByAuthorId(int authorId) {
		// TODO Auto-generated method stub
		return authorDao.findAuthorByAuthorId(authorId);
	}

	public Author findAuthorByAuthorName(String uthorName) {
		// TODO Auto-generated method stub
		return authorDao.findAuthorByAuthorName(uthorName);
	}

	public int insertAuthor(Author author) {
		// TODO Auto-generated method stub
		return authorDao.insertAuthor(author);
	}

	public int deleteAuthorByAuthorId(int authorId) {
		// TODO Auto-generated method stub
		return authorDao.deleteAuthorByAuthorId(authorId);
	}

	public int deleteAuthorByAuthorName(String authorName) {
		// TODO Auto-generated method stub
		return authorDao.deleteAuthorByAuthorName(authorName);
	}

	public int updateAuthorByAuthorId(int authorId, Author newAuthor) {
		// TODO Auto-generated method stub
		return authorDao.updateAuthorByAuthorId(authorId, newAuthor);
	}

	public int updateAuthorByAuthorName(int authorName, Author newAuthor) {
		// TODO Auto-generated method stub
		return authorDao.updateAuthorByAuthorName(authorName, newAuthor);
	}

	public int deleteAuthorByAuthorName(int authorName) {
		// TODO Auto-generated method stub
		return authorDao.findMaxAuthorId();
	}
	

}
