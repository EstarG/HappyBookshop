package com.chinasofti.etc.happybookshop.service;

import java.util.List;

import com.chinasofti.etc.happybookshop.po.BookLinkAuthor;

public interface BookLinkAuthorService {
	//�����ڵ����ı�ʶ 
	// �飺
	 List<Integer> findAuthorIdByBookId(int bookId);
	 List<Integer> findBookIdByAuthorId(int AuthorId);
	 //��
	 int insertBookLinkAuthor(BookLinkAuthor bookLinkAuthor);
	 
	 //ɾ
	 int deleteBookLinkAuthorByBookId(int bookId);
	 int deleteBookLinkAuthorByAuthorId(int AuthorId);
     //��
	 int updateBookLinkAuthorByBookId(int bookId, BookLinkAuthor newBookLinkAuthor);
	 int updateBookLinkAuthorByAuthorId(int authorId,BookLinkAuthor newBookLinkAuthor);
}
