package com.chinasofti.etc.happybookshop.dao.mysqlimpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.chinasofti.etc.happybookshop.dao.UserDao;
import com.chinasofti.etc.happybookshop.po.Book;
import com.chinasofti.etc.happybookshop.po.Order;
import com.chinasofti.etc.happybookshop.po.OrderDetail;
import com.chinasofti.etc.happybookshop.po.User;
import com.chinasofti.etc.happybookshop.service.BookService;
import com.chinasofti.etc.happybookshop.service.serviceimpl.BookServiceImpl;

public class UserDaoImpl extends BaseDao implements UserDao {

	//��������û�ID
	public int findMaxUserId() {
		// TODO Auto-generated method stub
		getConn();
		String sql = "select Max(userId) from Users";
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
	//�鿴�����û�
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList<User>();
		getConn();
		String sql = "select * from Users";
		doQuery(sql);
		try {
			//��������û�
			while (rs.next()){
				User user = new User();
				user.setUserId(rs.getInt(1));
				user.setUserName(rs.getString(2));
				user.setUserPassword(rs.getString(3));
				user.setUserAuthority(rs.getInt(4));
				user.setUserAddr(rs.getString(5));
				user.setUserPhoneNum(rs.getString(6));
				user.setUserEmail(rs.getString(7));
				users.add(user);
			}
			if (users.size() == 0) return null;
			else{
				//��ÿһ��user����
				for (User user: users){
					sql = "select * from Orders where userId = ?";
					doQuery(sql, user.getUserId());
					while (rs.next()){
						Order order = new Order();
						order.setOrderId(rs.getInt(1));
						order.setDate(rs.getDate(2));
						order.setOrderTotal(3);
						order.setUser(user);
						user.getOrders().add(order);
					}
					BookService bookService = new BookServiceImpl();
					
					//Ȼ����orderDetails
					for (Order order: user.getOrders()){
						sql = "select * from OrderDetails where orderId = ?";
						doQuery(sql, order.getOrderId());
						while (rs.next()){
							OrderDetail orderDetail = new OrderDetail();
							orderDetail.setOrderDetailId(rs.getInt(1));
							orderDetail.setBookNum(rs.getInt(3));
							Book book = bookService.findBookById(rs.getInt(2));//2����ı��
							orderDetail.setBook(book);
							orderDetail.setOrder(order);
							order.getOrderDetails().add(orderDetail);
						}
					}
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll();
		return users;
		
	}
	//ͨ���û�Id�����û�
	public User findUserById(int userId) {
		// TODO Auto-generated method stub
		User user = null;
		getConn();
		String sql = "select * from Users where userId = ?";
		doQuery(sql, userId);
		try {
			//���Ȼ���û���Ϣ
			if (rs.next()){
				user = new User();
				user.setUserId(rs.getInt(1));
				user.setUserName(rs.getString(2));
				user.setUserPassword(rs.getString(3));
				user.setUserAuthority(rs.getInt(4));
				user.setUserAddr(rs.getString(5));
				user.setUserPhoneNum(rs.getString(6));
				user.setUserEmail(rs.getString(7));
			}
			if (user == null) return null;
			else{
				//Ȼ����order��Ϣ
				sql = "select * from Orders where userId = ?";
				doQuery(sql, user.getUserId());
				while (rs.next()){
					Order order = new Order();
					order.setOrderId(rs.getInt(1));
					order.setDate(rs.getDate(2));
					order.setOrderTotal(3);
					order.setUser(user);
					user.getOrders().add(order);
				}
				BookService bookService = new BookServiceImpl();
				
				//Ȼ����orderDetails
				for (Order order: user.getOrders()){
					sql = "select * from OrderDetails where orderId = ?";
					doQuery(sql, order.getOrderId());
					while (rs.next()){
						OrderDetail orderDetail = new OrderDetail();
						orderDetail.setOrderDetailId(rs.getInt(1));
						orderDetail.setBookNum(rs.getInt(rs.getInt(3)));
						Book book = bookService.findBookById(rs.getInt(2));//2����ı��
						orderDetail.setBook(book);
						orderDetail.setOrder(order);
					}
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll();
		return user;
	}
	//ͨ���û����ֲ����û�
	public User findUserByName(String userName) {
		// TODO Auto-generated method stub
		User user = null;
		getConn();
		String sql = "select * from Users where userName = ?";
		doQuery(sql, userName);
		try {
			//���Ȼ���û���Ϣ
			if (rs.next()){
				user = new User();
				user.setUserId(rs.getInt(1));
				user.setUserName(rs.getString(2));
				user.setUserPassword(rs.getString(3));
				user.setUserAuthority(rs.getInt(4));
				user.setUserAddr(rs.getString(5));
				user.setUserPhoneNum(rs.getString(6));
				user.setUserEmail(rs.getString(7));
				
				//System.out.println(">>>>>>>" + user.getUserName() + "  " + user.getUserPassword());
			}
			if (user == null) return null;
			else{
				//Ȼ����order��Ϣ
				sql = "select * from Orders where userId = ?";
				doQuery(sql, user.getUserId());
				while (rs.next()){
					Order order = new Order();
					order.setOrderId(rs.getInt(1));
					order.setDate(rs.getDate(2));
					order.setOrderTotal(3);
					order.setUser(user);
					user.getOrders().add(order);
				}
				BookService bookService = new BookServiceImpl();
				
				//Ȼ����orderDetails
				for (Order order: user.getOrders()){
					sql = "select * from OrderDetails where orderId = ?";
					doQuery(sql, order.getOrderId());
					while (rs.next()){
						OrderDetail orderDetail = new OrderDetail();
						orderDetail.setOrderDetailId(rs.getInt(1));
						orderDetail.setBookNum(rs.getInt(rs.getInt(3)));
						Book book = bookService.findBookById(rs.getInt(2));//2����ı��
						orderDetail.setBook(book);
						orderDetail.setOrder(order);
					}
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll();
		return user;
	}
    //����û�Ȩ��0��ʾ�Ƿ��û�1��ʾ��ͨ�û�2��ʾ����Ա
	public int isValuedUser(String userName, String userPassword) {
		// TODO Auto-generated method stub
		User user = this.findUserByName(userName);
		if (user != null && user.getUserPassword().equals(userPassword)){
			result = user.getUserAuthority();
		}
		else{
			return 0;
		}
		return result;
	}

	//�����ݿ�������û�
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		getConn();
		String sql = "insert into Users values(?,?,?,?,?,?,?)";
		int maxId = this.findMaxUserId();
		//System.out.println(user.getUserName() + " " + user.getUserPassword()+ " " + user.getUserAuthority());
		doOperate(sql, maxId + 1,user.getUserName(),user.getUserPassword(),user.getUserAuthority()
				,user.getUserAddr(),user.getUserPhoneNum(),user.getUserEmail());
		closeAll();
		return result;
	}
    //�����û�IDɾ���û�
	public int deleteUserById(int userId) {
		// TODO Auto-generated method stub
		getConn();
		String sql = "delete from Users where userId = ?";
		doOperate(sql, userId);
		closeAll();
		return result;
	}
	 //�����û�����ɾ���û�
	public int deleteUserByName(int userName) {
		// TODO Auto-generated method stub
		getConn();
		String sql = "delete from Users where userName = ?";
		doOperate(sql, userName);
		closeAll();
		return result;
	}
    //ͨ���û�ID�������ݿ��е��û���
	public int updateUserByUserId(int userId, User newUser) {
		// TODO Auto-generated method stub
		getConn();
		String sql = "update Users set userName = ?,userPassword = ?,userAuthority = ?,userAddr = ?,userphoneNum = ?,useremail = ? where userId = ?";
		
		doOperate(sql,newUser.getUserName(),newUser.getUserPassword(),newUser.getUserAuthority(),newUser.getUserAddr()
				,newUser.getUserPhoneNum(),newUser.getUserEmail(),userId);
		closeAll();
		return result;
	}
	//ͨ���û����ָ������ݿ��е��û���
	public int updateUserByuserName(String userName, User newUser) {
		// TODO Auto-generated method stub
		getConn();
		String sql = "update Users set userName = ?,userPassword = ?,userAuthority = ?,userAddr = ?,userphoneNum = ?,useremail = ? where userName = ?";
		
		doOperate(sql,newUser.getUserName(),newUser.getUserPassword(),newUser.getUserAuthority(),newUser.getUserAddr()
				,newUser.getUserPhoneNum(),newUser.getUserEmail(),userName);
		closeAll();
		return result;
	}

}
