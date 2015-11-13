package com.chinasofti.etc.happybookshop.dao;

import java.util.List;

import com.chinasofti.etc.happybookshop.po.BookLinkAuthor;


public interface BookLinkAuthorDao {
	 
	// ²é£º
	 int findMaxBookLinkAuthorId();
	 List<Integer> findAuthorIdByBookId(int bookId);
	 List<Integer> findBookIdByAuthorId(int AuthorId);
	 //Ôö
	 int insertBookLinkAuthor(BookLinkAuthor bookLinkAuthor);
	 
	 //É¾
	 int deleteBookLinkAuthorByBookId(int bookId);
	 int deleteBookLinkAuthorByAuthorId(int AuthorId);
     //¸Ä
	 int updateBookLinkAuthorByBookId(int bookId, BookLinkAuthor newBookLinkAuthor);
	 int updateBookLinkAuthorByAuthorId(int authorId,BookLinkAuthor newBookLinkAuthor);
}
