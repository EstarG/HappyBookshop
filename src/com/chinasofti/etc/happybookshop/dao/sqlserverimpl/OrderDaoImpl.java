package com.chinasofti.etc.happybookshop.dao.sqlserverimpl;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.chinasofti.etc.happybookshop.dao.OrderDao;
import com.chinasofti.etc.happybookshop.po.Order;
import com.chinasofti.etc.happybookshop.po.User;


public class OrderDaoImpl extends BaseDao implements OrderDao {
	
	//查找最大ID
	public int findMaxOrderId() {
		// TODO Auto-generated method stub
		getConn();
		String sql = "select MAX(orderId) from orders";
		doQuery(sql);
		int maxId = 0;
		try {
			if (rs.next()) {
				maxId = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return maxId;
	}
	//插入订单
	public int insertOrder(Order order) {
		// TODO Auto-generated method stub
		getConn();
		int maxId = this.findMaxOrderId();
		//java.sql.Date dateTime = new java.sql.Date(order.getDate().getTime()); 
		String sql = "insert into Orders values(?, ?, ?, ?)";
		doOperate(sql, (maxId + 1), order.getDate(), order.getOrderTotal(), order.getUser().getUserId());
		return result;
	}
    
	//通过用户的ID查看用户订单
	public Set<Order> findAllOrdersByUserId(int userId, List<User> users) {
		// TODO Auto-generated method stub
		Set<Order> orders = null;
		
		for (User user:users){
			if (user.getUserId() == userId){
				orders = new HashSet<Order>();
				orders = user.getOrders();
				break;
			}
		}
		return orders;
	}
}
