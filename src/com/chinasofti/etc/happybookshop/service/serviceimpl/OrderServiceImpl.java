package com.chinasofti.etc.happybookshop.service.serviceimpl;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import com.chinasofti.etc.happybookshop.dao.OrderDao;
import com.chinasofti.etc.happybookshop.po.Order;
import com.chinasofti.etc.happybookshop.po.User;
import com.chinasofti.etc.happybookshop.service.OrderService;

public class OrderServiceImpl implements OrderService {
	private OrderDao orderDao;

	public OrderServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
		File file = new File("f:/myconfig.properties");
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(file));
			String orderDaoString = properties.getProperty("OrderDao");
			orderDao = (OrderDao) Class.forName(orderDaoString).newInstance();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
   
	//查找最大ID
	public int findMaxOrderId() {
		// TODO Auto-generated method stub
		return orderDao.findMaxOrderId();
	}
	
	//找到用户的订单
	public Set<Order> findAllOrdersByUserId(int userId, List<User> users) {
		// TODO Auto-generated method stub
		return orderDao.findAllOrdersByUserId(userId, users);
	}
   
	//插入订单
	public int insertOrder(Order order) {
		// TODO Auto-generated method stub
		return orderDao.insertOrder(order);
	}
	
	
}
