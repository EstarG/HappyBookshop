package com.chinasofti.etc.happybookshop.po;

public class BookLinkAuthor {
	
    private int bookLinkAuthorId;
	private int bookId;
	private int authorId;
	//
	public int getBookLinkAuthorId() {
		return bookLinkAuthorId;
	}
	public void setBookLinkAuthorId(int bookLinkAuthorId) {
		this.bookLinkAuthorId = bookLinkAuthorId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public BookLinkAuthor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookLinkAuthor(int bookLinkAuthorId, int bookId, int authorId) {
		super();
		this.bookLinkAuthorId = bookLinkAuthorId;
		this.bookId = bookId;
		this.authorId = authorId;
	}
	public BookLinkAuthor(int bookId, int authorId) {
		super();
		this.bookId = bookId;
		this.authorId = authorId;
	}
	
}
