package com.chinasofti.etc.happybookshop.dao;

import java.util.List;
import java.util.Set;

import com.chinasofti.etc.happybookshop.po.Order;
import com.chinasofti.etc.happybookshop.po.User;

public interface OrderDao {
	// ��ѯ�����˵���Ϣ
	int findMaxOrderId();
	Set<Order> findAllOrdersByUserId(int userId,List<User> users);
	// �������˵�
	int insertOrder(Order order);
}
