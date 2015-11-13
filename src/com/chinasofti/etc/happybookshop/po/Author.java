package com.chinasofti.etc.happybookshop.po;

public class Author {

	private int authorId;
	private String authorName;
	//
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Author(int authorId, String authorName) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
