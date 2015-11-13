package com.chinasofti.etc.happybookshop.service.serviceimpl;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;

import com.chinasofti.etc.happybookshop.dao.OrderDetailDao;
import com.chinasofti.etc.happybookshop.po.Order;
import com.chinasofti.etc.happybookshop.po.OrderDetail;
import com.chinasofti.etc.happybookshop.service.OrderDetailService;

public class OrderDetailServiceImpl implements OrderDetailService {
	private OrderDetailDao orderDetailDao;

	public OrderDetailServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
		File file = new File("f:/myconfig.properties");
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(file));
			String orderDetailDaoString = properties.getProperty("OrderDetailDao");
			orderDetailDao = (OrderDetailDao) Class.forName(orderDetailDaoString).newInstance();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public Set<OrderDetail> findOrderDetailsByOrderId(int orderId, Order order) {
		// TODO Auto-generated method stub
		return orderDetailDao.findOrderDetailsByOrderId(orderId, order);
	}

	public int findMaxOrderDetailsId() {
		// TODO Auto-generated method stub
		return orderDetailDao.findMaxOrderDetailsId();
	}

	public int insertOrderDetails(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		return orderDetailDao.insertOrderDetails(orderDetail);
	}
}
