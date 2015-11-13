package com.chinasofti.etc.happybookshop.dao;

import java.util.List;

import com.chinasofti.etc.happybookshop.po.Book;

public interface BookDao {
	//²é£º
	int findMaxBookId();
	Book findBookById(int bookId);
	Book findBookByName(String bookName);
	List<Book> findAllBook();
	List<Book> findBooksByBookType(int bookType);
	//Ôö£º
	int insertBook(Book book);
	//É¾
	int deleteBookById(int bookId);
	int deleteBookByName(String bookName);
	//¸Ä£º
	int upateBookByBookId(int bookId,Book newBook);
	int updateBookByBookName(String bookName,Book newBook);

}
