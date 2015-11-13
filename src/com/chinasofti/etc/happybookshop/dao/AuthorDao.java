package com.chinasofti.etc.happybookshop.dao;

import com.chinasofti.etc.happybookshop.po.Author;

public interface AuthorDao {
	//��
	int findMaxAuthorId();
	Author findAuthorByAuthorId(int authorId);
	Author findAuthorByAuthorName(String uthorName);
	//��
	int insertAuthor(Author author);
	//ɾ
	int deleteAuthorByAuthorId(int authorId);
	int deleteAuthorByAuthorName(String authorName);
	//��
	int updateAuthorByAuthorId(int authorId, Author newAuthor);
	int updateAuthorByAuthorName(int authorName,Author newAuthor);
}
