package com.chinasofti.etc.happybookshop.po;

public class Book {

	private int bookId;
	private String bookName;
	private String bookPublisher;
	private double bookPrice;
	private String bookIsbn;
	private String bookDetails;
	private String bookPictureName;
	private int bookType;
	//
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookIsbn() {
		return bookIsbn;
	}
	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}
	public String getBookDetails() {
		return bookDetails;
	}
	public void setBookDetails(String bookDetails) {
		this.bookDetails = bookDetails;
	}
	public String getBookPictureName() {
		return bookPictureName;
	}
	public void setBookPictureName(String pictureName) {
		this.bookPictureName = pictureName;
	}
	
	public int getBookType() {
		return bookType;
	}
	public void setBookType(int bookType) {
		this.bookType = bookType;
	}
	public Book(int bookId, String bookName, String bookPublisher,
			double bookPrice, String bookIsbn, String bookDetails,
			String bookPictureName, int bookType) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPublisher = bookPublisher;
		this.bookPrice = bookPrice;
		this.bookIsbn = bookIsbn;
		this.bookDetails = bookDetails;
		this.bookPictureName = bookPictureName;
		this.bookType = bookType;
	}
	
	public Book(String bookName, String bookPublisher, double bookPrice,
			String bookIsbn, String bookDetails, String bookPictureName,
			int bookType) {
		super();
		this.bookName = bookName;
		this.bookPublisher = bookPublisher;
		this.bookPrice = bookPrice;
		this.bookIsbn = bookIsbn;
		this.bookDetails = bookDetails;
		this.bookPictureName = bookPictureName;
		this.bookType = bookType;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
