package com.chinasofti.etc.happybookshop.dao.mysqlimpl;

import java.sql.SQLException;

import com.chinasofti.etc.happybookshop.dao.AuthorDao;
import com.chinasofti.etc.happybookshop.po.Author;


public class AuthorDaoImpl extends BaseDao implements AuthorDao {

	//找出最大的递增的键值，来做正确的插入
	public int findMaxAuthorId() {
		// TODO Auto-generated method stub
		getConn();
		String sql = "select MAX(authorId) from Authors";
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
	//通过坐着ID查找作者
	public Author findAuthorByAuthorId(int authorId) {
		// TODO Auto-generated method stub
		Author author = null;
		getConn();
		String sql = "select * from Authors where authorId = ?";
		doQuery(sql, authorId);
		try {
			if (rs.next()){
				author = new Author();
				author.setAuthorId(rs.getInt(1));
				author.setAuthorName(rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll();
		return author;
	}
	//通过作者名字查找作者
	public Author findAuthorByAuthorName(String authorName) {
		// TODO Auto-generated method stub
		Author author = null;
		getConn();
		String sql = "select * from Authors where authorName = ?";
		doQuery(sql, authorName);
		try {
			if (rs.next()){
				author = new Author();
				author.setAuthorId(rs.getInt(1));
				author.setAuthorName(rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll();
		return author;
	}
	//向数据库中添加作者
	public int insertAuthor(Author author) {
		// TODO Auto-generated method stub
		getConn();
		String sql = "insert into Authors values(?,?)";
		doOperate(sql,author.getAuthorId(), author.getAuthorName());
		closeAll();
		return result;
	}
	//通过作者ID删除作者
	public int deleteAuthorByAuthorId(int authorId) {
		// TODO Auto-generated method stub
		getConn();
		String sql = "delete from Authors where AuthorId = ?";
		doOperate(sql, authorId);
		closeAll();
		return result;
	}
	//通过作者姓名删除作者
	public int deleteAuthorByAuthorName(String authorName) {
		// TODO Auto-generated method stub
		getConn();
		String sql = "delete from Authors where authorName = ?";
		doOperate(sql, authorName);
		closeAll();
		return result;
	}
	//根据作者ID修改作者
	public int updateAuthorByAuthorId(int authorId, Author newAuthor) {
		// TODO Auto-generated method stub
		getConn();
		String sql = "update Authors set AuthorId = ?,AuthorName = ? where authorId = ?";
		doOperate(sql, newAuthor.getAuthorId(),newAuthor.getAuthorName(),authorId);
		closeAll();
		return result;
	}
	//根据作者姓名修改作者
	public int updateAuthorByAuthorName(int authorName, Author newAuthor) {
		// TODO Auto-generated method stub
		getConn();
		String sql = "update Authors set AuthorId = ?,AuthorName = ? where authorName = ?";
		doOperate(sql, newAuthor.getAuthorId(),newAuthor.getAuthorName(),authorName);
		closeAll();
		return result;
	}
	
}
