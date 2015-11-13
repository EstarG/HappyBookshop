package com.chinasofti.etc.happybookshop.service;

import java.util.List;
import java.util.Set;

import com.chinasofti.etc.happybookshop.po.Order;
import com.chinasofti.etc.happybookshop.po.User;

public interface OrderService {
	// 查询所有账单信息
	int findMaxOrderId();
	Set<Order> findAllOrdersByUserId(int userId,List<User> users);
	// 插入新账单
	int insertOrder(Order order);
}
