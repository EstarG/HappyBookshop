package com.chinasofti.etc.happybookshop.service;

import com.chinasofti.etc.happybookshop.po.Author;

public interface AuthorService {
	//²é
	int findMaxAuthorId();
	Author findAuthorByAuthorId(int authorId);
	Author findAuthorByAuthorName(String string);
	//Ôö
	int insertAuthor(Author author);
	//É¾
	int deleteAuthorByAuthorId(int authorId);
	int deleteAuthorByAuthorName(int authorName);
	//¸Ä
	int updateAuthorByAuthorId(int authorId, Author newAuthor);
	int updateAuthorByAuthorName(int authorName,Author newAuthor);
}
