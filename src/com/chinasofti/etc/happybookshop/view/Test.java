package com.chinasofti.etc.happybookshop.view;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.chinasofti.etc.happybookshop.po.Book;
import com.chinasofti.etc.happybookshop.po.BookLinkAuthor;
import com.chinasofti.etc.happybookshop.po.Category;
import com.chinasofti.etc.happybookshop.po.Log;
import com.chinasofti.etc.happybookshop.po.Order;
import com.chinasofti.etc.happybookshop.po.OrderDetail;
import com.chinasofti.etc.happybookshop.po.User;
import com.chinasofti.etc.happybookshop.service.BookLinkAuthorService;
import com.chinasofti.etc.happybookshop.service.BookService;
import com.chinasofti.etc.happybookshop.service.CategoryService;
import com.chinasofti.etc.happybookshop.service.LogService;
import com.chinasofti.etc.happybookshop.service.UserService;
import com.chinasofti.etc.happybookshop.service.serviceimpl.BookLinkAuthorServiceImpl;
import com.chinasofti.etc.happybookshop.service.serviceimpl.BookServiceImpl;
import com.chinasofti.etc.happybookshop.service.serviceimpl.CategoryServiceImpl;
import com.chinasofti.etc.happybookshop.service.serviceimpl.LogServiceImpl;
import com.chinasofti.etc.happybookshop.service.serviceimpl.UserServiceImpl;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		UserService userService = new UserServiceImpl();
//		User user = userService.findUserByName("gbx");
//		System.out.println(user.getUserName() + " " + user.getUserPassword());
//		
//		User user1 = new User("gbx","gbx",1,"aa","aa","asdad");
//		userService.updateUserByuserName("zxcwwnhihn", user1);
//		System.out.println(">>>>");
//		BookLinkAuthorService bla = new BookLinkAuthorServiceImpl();
//		List<Integer> ids = bla.findAuthorIdByBookId(1);
//		Iterator<Integer> iterator = ids.iterator();
//		while (iterator.hasNext()){
//			System.out.println(iterator.next());
//		}
//		
//		
//		CategoryService categoryService = new CategoryServiceImpl();
//		Set<Category> categories = categoryService.findAllCategory();
//		for (Category c : categories) {
//			System.out.println(c.getCatName());
//		}
	
		
		
//		UserService userService = new UserServiceImpl();
//		List<User> users = userService.findAllUsers();
//		
//		
//		//String userName = "gbx";
//		for (User user: users){
//			for (Order o : user.getOrders()){
//				System.out.println("orderId" + o.getOrderId());
//				for(OrderDetail ods : o.getOrderDetails()) {
//					System.out.println("ods" + ods.getBookNum());
//				}
//			}
//		}
		LogService logService = new LogServiceImpl();
		System.out.println(logService.findMaxLogId());
		
//		List<Log> logs = logService.findAllLogs();
//		Iterator<Log> iterator = logs.iterator();
//		while (iterator.hasNext()){
//			Log log = iterator.next();
//			System.out.println(log.getLogEvent());
//		}
	}

}
 