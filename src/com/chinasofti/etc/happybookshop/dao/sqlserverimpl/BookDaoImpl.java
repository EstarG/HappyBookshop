package com.chinasofti.etc.happybookshop.dao.sqlserverimpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinasofti.etc.happybookshop.dao.BookDao;
import com.chinasofti.etc.happybookshop.po.Book;

public class BookDaoImpl extends BaseDao implements BookDao {

	//找出最大的递增的键值，来做正确的插入
	public int findMaxBookId() {
		// TODO Auto-generated method stub
		getConn();
		String sql = "select Max(BookId) from Books";
		doQuery(sql);
		try {
			if (rs.next()){
				result = rs.getInt(1); 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll();
		return result;
	}
	//根据书籍的ID查询书
	public Book findBookById(int bookId) {
		// TODO Auto-generated method stub
		Book book = null;
		getConn();
		String sql = "select * from Books where bookId = ?";
		doQuery(sql, bookId);
		try {
			if (rs.next()) {
				book = new Book();
				book.setBookId(rs.getInt(1));
				book.setBookName(rs.getString(2));
				book.setBookPublisher(rs.getString(3));
				book.setBookPrice(rs.getDouble(4));
				book.setBookIsbn(rs.getString(5));
				book.setBookDetails(rs.getString(6));
				book.setBookPictureName(rs.getString(7));
				book.setBookType(rs.getInt(8));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll();
		return book;
	}
    //根据书籍的名字查找书
	public Book findBookByName(String bookName) {
		// TODO Auto-generated method stub
		Book book = null;
		getConn();
		String sql = " select * from Books where bookName = ?";
		doQuery(sql, bookName);
		try {
			if (rs.next()) {
				book = new Book();
				book.setBookId(rs.getInt(1));
				book.setBookName(rs.getString(2));
				book.setBookPublisher(rs.getString(3));
				book.setBookPrice(rs.getDouble(4));
				book.setBookIsbn(rs.getString(5));
				book.setBookDetails(rs.getString(6));
				book.setBookPictureName(rs.getString(7));
				book.setBookType(rs.getInt(8));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll();
		return book;
	}
	//查找所有的书籍
	public List<Book> findAllBook() {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<Book>();
		String sql = "select * from Books";
		getConn();
		doQuery(sql);
		try {
			while (rs.next()) {
				Book book = new Book();
				book.setBookId(rs.getInt(1));
				book.setBookName(rs.getString(2));
				book.setBookPublisher(rs.getString(3));
				book.setBookPrice(rs.getDouble(4));
				book.setBookIsbn(rs.getString(5));
				book.setBookDetails(rs.getString(6));
				book.setBookPictureName(rs.getString(7));
				book.setBookType(rs.getInt(8));
				books.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll();
		return books;
	}
    //向数据库添加书籍
	public int insertBook(Book book) {
		// TODO Auto-generated method stub
		getConn();
		String sql = "insert into Books values(?,?,?,?,?,?,?,?)";
		int maxId = this.findMaxBookId();
		doOperate(sql, maxId + 1,book.getBookName(),book.getBookPublisher(),
				book.getBookPrice(),book.getBookIsbn(),book.getBookDetails(),
				book.getBookPictureName(),book.getBookType());
		closeAll();
		return result;
	}
    //通过书籍ID删除书籍
	public int deleteBookById(int bookId) {
		// TODO Auto-generated method stub
		getConn();
		String sql = "delete from Books where bookId = ?";
		doOperate(sql, bookId);
		closeAll();
		return result;
	}
    //通过书名删除书籍
	public int deleteBookByName(String bookName) {
		// TODO Auto-generated method stub
		getConn();
		String sql = "delete from Books where bookName = ?";
		doOperate(sql, bookName);
		closeAll();
		return result;
	}
	//通过书籍ID修改书籍
	public int upateBookByBookId(int bookId, Book newBook) {
		// TODO Auto-generated method stub
		getConn();
		String sql = "update Books set bookId = ?,bookName = ?,bookPublisher=?,bookPrice=?,bookIsbn=?,bookDetails=?,bookPictureName=?,bookType=? where bookId = ?";
		
//		String sql = "delete from Books where bookId = ?";
//		doOperate(sql, bookId);
//		result = 0;//这里不管删没删除成功都会影响result所以要清0
//		sql = "insert into Books values(?,?,?,?,?,?,?)";
		
		doOperate(sql,newBook.getBookDetails(),newBook.getBookName(),newBook.getBookPublisher(),newBook.getBookPrice(),
				newBook.getBookIsbn(),newBook.getBookDetails(),newBook.getBookPictureName(),newBook.getBookType(),bookId);
		closeAll();
		return result;
	}
    //通过书名更新书籍
	public int updateBookByBookName(String bookName, Book newBook) {
		// TODO Auto-generated method stub
		getConn();
//		String sql = "delete from Books where bookName = ?";
//		doOperate(sql, bookName);
//		result = 0;//这里不管删没删除成功都会影响result所以要清0
//		sql = "insert into Books values(?,?,?,?,?)";
		String sql = "update Books set bookId = ?,bookName = ?,bookPublisher=?,bookPrice=?,bookIsbn=?,bookDetails=?,bookPictureName=?,bookType=? where bookName = ?";
		doOperate(sql,newBook.getBookId(),newBook.getBookName(),newBook.getBookPublisher(),newBook.getBookPrice(),
				newBook.getBookIsbn(),newBook.getBookDetails(),newBook.getBookPictureName(),newBook.getBookType(),bookName);
		closeAll();
		return result;
	}
	//按类型查找
	public List<Book> findBooksByBookType(int bookType) {
		// TODO Auto-generated method stub
		getConn();
		String sql = "select * from Books where bookType = ?";
		doQuery(sql, bookType);
		List<Book> books = new ArrayList<Book>();
		try {
			while (rs.next()){
				Book book = new Book();
				book.setBookId(rs.getInt(1));
				book.setBookName(rs.getString(2));
				book.setBookPublisher(rs.getString(3));
				book.setBookPrice(rs.getDouble(4));
				book.setBookIsbn(rs.getString(5));
				book.setBookDetails(rs.getString(6));
				book.setBookPictureName(rs.getString(7));
				book.setBookType(rs.getInt(8));
				books.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll();
        return books;
	}
}
