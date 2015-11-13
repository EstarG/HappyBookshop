package com.chinasofti.etc.happybookshop.dao;

import com.chinasofti.etc.happybookshop.po.Author;

public interface AuthorDao {
	//²é
	int findMaxAuthorId();
	Author findAuthorByAuthorId(int authorId);
	Author findAuthorByAuthorName(String uthorName);
	//Ôö
	int insertAuthor(Author author);
	//É¾
	int deleteAuthorByAuthorId(int authorId);
	int deleteAuthorByAuthorName(String authorName);
	//¸Ä
	int updateAuthorByAuthorId(int authorId, Author newAuthor);
	int updateAuthorByAuthorName(int authorName,Author newAuthor);
}
