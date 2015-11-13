package com.chinasofti.etc.happybookshop.dao;

import java.util.Set;

import com.chinasofti.etc.happybookshop.po.Order;
import com.chinasofti.etc.happybookshop.po.OrderDetail;

public interface OrderDetailDao {
	// 查询一张账单的详细信息
	int findMaxOrderDetailsId();
	Set<OrderDetail> findOrderDetailsByOrderId(int orderId, Order order);
	//插入账单信息表
	int insertOrderDetails(OrderDetail orderDetail);
}
