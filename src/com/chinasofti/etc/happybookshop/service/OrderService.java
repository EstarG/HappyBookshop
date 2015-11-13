package com.chinasofti.etc.happybookshop.service;

import java.util.List;
import java.util.Set;

import com.chinasofti.etc.happybookshop.po.Order;
import com.chinasofti.etc.happybookshop.po.User;

public interface OrderService {
	// ��ѯ�����˵���Ϣ
	int findMaxOrderId();
	Set<Order> findAllOrdersByUserId(int userId,List<User> users);
	// �������˵�
	int insertOrder(Order order);
}
