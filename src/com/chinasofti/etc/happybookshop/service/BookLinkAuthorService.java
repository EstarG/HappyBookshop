package com.chinasofti.etc.happybookshop.service;

import java.util.List;

import com.chinasofti.etc.happybookshop.po.BookLinkAuthor;

public interface BookLinkAuthorService {
	//不存在递增的标识 
	// 查：
	 List<Integer> findAuthorIdByBookId(int bookId);
	 List<Integer> findBookIdByAuthorId(int AuthorId);
	 //增
	 int insertBookLinkAuthor(BookLinkAuthor bookLinkAuthor);
	 
	 //删
	 int deleteBookLinkAuthorByBookId(int bookId);
	 int deleteBookLinkAuthorByAuthorId(int AuthorId);
     //改
	 int updateBookLinkAuthorByBookId(int bookId, BookLinkAuthor newBookLinkAuthor);
	 int updateBookLinkAuthorByAuthorId(int authorId,BookLinkAuthor newBookLinkAuthor);
}
