package com.chinasofti.etc.happybookshop.dao.sqlserverimpl;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import com.chinasofti.etc.happybookshop.dao.BookDao;
import com.chinasofti.etc.happybookshop.dao.OrderDetailDao;
import com.chinasofti.etc.happybookshop.po.Book;
import com.chinasofti.etc.happybookshop.po.Order;
import com.chinasofti.etc.happybookshop.po.OrderDetail;

public class OrderDetailDaoImpl extends BaseDao implements OrderDetailDao {

	public Set<OrderDetail> findOrderDetailsByOrderId(int orderId, Order order) {
		// TODO Auto-generated method stub
		Set<OrderDetail> orderDetails = new HashSet<OrderDetail>();
		OrderDetail detail = null;
		BookDao bookDao = new BookDaoImpl();
		Book book = null;

		getConn();
		String sql = "select * from OrderDetails where orderId=?";
		doQuery(sql, orderId);
		try {
			while (rs.next()) {
				detail = new OrderDetail();
				detail.setOrderDetailId(rs.getInt(1));
				book = bookDao.findBookById(rs.getInt(2));
				detail.setBook(book);
				detail.setBookNum(rs.getInt(3));
				detail.setOrder(order);
				
				orderDetails.add(detail);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return orderDetails;
	}

	public int insertOrderDetails(OrderDetail orderDetail) {
		// TODO Auto-generated method stub
		getConn();
		int maxId = this.findMaxOrderDetailsId();
		String sql = "insert into OrderDetails values(?,?,?,?)";
		doOperate(sql,maxId + 1,orderDetail.getBook().getBookId(),orderDetail.getBookNum(),orderDetail.getOrder().getOrderId());
		closeAll();
		return result;
	}

	public int findMaxOrderDetailsId() {
		// TODO Auto-generated method stub
		getConn();
		String sql = "select Max(orderDetailId) from OrderDetails";
		doQuery(sql);
		int maxId = 0;
		try {
			if (rs.next()){
				maxId = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeAll();
		return maxId;
	}
}
