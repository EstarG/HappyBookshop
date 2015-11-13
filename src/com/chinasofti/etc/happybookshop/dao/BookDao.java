package com.chinasofti.etc.happybookshop.dao;

import java.util.List;

import com.chinasofti.etc.happybookshop.po.Book;

public interface BookDao {
	//�飺
	int findMaxBookId();
	Book findBookById(int bookId);
	Book findBookByName(String bookName);
	List<Book> findAllBook();
	List<Book> findBooksByBookType(int bookType);
	//����
	int insertBook(Book book);
	//ɾ
	int deleteBookById(int bookId);
	int deleteBookByName(String bookName);
	//�ģ�
	int upateBookByBookId(int bookId,Book newBook);
	int updateBookByBookName(String bookName,Book newBook);

}
