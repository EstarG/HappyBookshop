package com.chinasofti.etc.happybookshop.dao.sqlserverimpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinasofti.etc.happybookshop.dao.BookLinkAuthorDao;
import com.chinasofti.etc.happybookshop.po.BookLinkAuthor;



public class BookLinkAuthorDaoImpl extends BaseDao implements BookLinkAuthorDao {

	
	public int findMaxBookLinkAuthorId() {
		// TODO Auto-generated method stub
		getConn();
		String sql = "select MAX(bookLinkAuthorId) from BookLinkAuthors";
		int maxId = 0;
		doQuery(sql);
		try {
			if (rs.next()){
				maxId = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll();
		return maxId;
	}
	//通过书籍ID查找用户ID
	public List<Integer> findAuthorIdByBookId(int bookId) {
		// TODO Auto-generated method stub
		List<Integer> authorIds = new ArrayList<Integer>();
		getConn();
		String sql = "select authorId from BookLinkAuthors where bookId = ?";
		doQuery(sql, bookId);
		try {
			while (rs.next()){
				Integer authorId = rs.getInt(1);
				authorIds.add(authorId);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll();
		return authorIds;
	}
	//通过用户ID查找书籍ID
	public List<Integer> findBookIdByAuthorId(int AuthorId) {
		// TODO Auto-generated method stub
		List<Integer> bookIds = new ArrayList<Integer>();
		getConn();
		String sql = "select bookId from BookLinkAuthors where authorId = ?";
		doQuery(sql, AuthorId);
		try {
			while (rs.next()){
				Integer bookId = rs.getInt(1);
				bookIds.add(bookId);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll();
		return bookIds;
	}
	//向数据库中添加书连作者
	public int insertBookLinkAuthor(BookLinkAuthor bookLinkAuthor) {
		// TODO Auto-generated method stub
		getConn();
		int maxId = this.findMaxBookLinkAuthorId();
		String sql = "insert BookLinkAuthors values(?,?,?)";
		doOperate(sql,maxId + 1, bookLinkAuthor.getBookId(),bookLinkAuthor.getAuthorId());
		closeAll();
		return result;
	}

	//通过书籍ID删除
	public int deleteBookLinkAuthorByBookId(int bookId) {
		// TODO Auto-generated method stub
		getConn();
		String sql = "delete from BookLinkAuthors where bookId = ?";
		doOperate(sql, bookId);
		closeAll();
		return result;
	}

	//通过作者ID
	public int deleteBookLinkAuthorByAuthorId(int AuthorId) {
		// TODO Auto-generated method stub
		getConn();
		String sql = "delete from BookLinkAuthors where authorId = ?";
		doOperate(sql, AuthorId);
		closeAll();
		return result;
	}

	//通过书籍ID修改
	public int updateBookLinkAuthorByBookId(int bookId,BookLinkAuthor newBookLinkAuthor) {
		// TODO Auto-generated method stub
		getConn();
		String sql = "update BookLinkAuthors set bookId = ?,authorId = ? where bookId = ?";
		doOperate(sql, newBookLinkAuthor.getBookId(),newBookLinkAuthor.getAuthorId(),bookId);
		closeAll();
		return result;
	}

	//通过作者ID修改
	public int updateBookLinkAuthorByAuthorId(int authorId,BookLinkAuthor newBookLinkAuthor) {
		// TODO Auto-generated method stub
		getConn();
		String sql = "update BookLinkAuthors set bookId = ?,authorId = ? where authorId = ?";
		doOperate(sql, newBookLinkAuthor.getBookId(),newBookLinkAuthor.getAuthorId(),authorId);
		closeAll();
		return result;
	}
	

}
