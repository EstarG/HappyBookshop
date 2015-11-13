package com.chinasofti.etc.happybookshop.service;

import java.util.Set;

import com.chinasofti.etc.happybookshop.po.Order;
import com.chinasofti.etc.happybookshop.po.OrderDetail;

public interface OrderDetailService {
	// ��ѯһ���˵�����ϸ��Ϣ
	int findMaxOrderDetailsId();
	Set<OrderDetail> findOrderDetailsByOrderId(int orderId, Order order);
	//�����˵���Ϣ��
	int insertOrderDetails(OrderDetail orderDetail);
	
}
