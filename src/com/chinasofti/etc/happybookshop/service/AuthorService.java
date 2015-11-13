package com.chinasofti.etc.happybookshop.service;

import com.chinasofti.etc.happybookshop.po.Author;

public interface AuthorService {
	//��
	int findMaxAuthorId();
	Author findAuthorByAuthorId(int authorId);
	Author findAuthorByAuthorName(String string);
	//��
	int insertAuthor(Author author);
	//ɾ
	int deleteAuthorByAuthorId(int authorId);
	int deleteAuthorByAuthorName(int authorName);
	//��
	int updateAuthorByAuthorId(int authorId, Author newAuthor);
	int updateAuthorByAuthorName(int authorName,Author newAuthor);
}
