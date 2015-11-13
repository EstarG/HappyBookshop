package com.chinasofti.etc.happybookshop.service.serviceimpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import com.chinasofti.etc.happybookshop.dao.UserDao;
import com.chinasofti.etc.happybookshop.po.User;
import com.chinasofti.etc.happybookshop.service.UserService;



public class UserServiceImpl implements UserService {

	private static UserDao userDao = null;
	static{
		File file = new File("f:\\myconfig.properties");
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String DaoString = properties.getProperty("DaoUser");
		try {
			userDao = (UserDao)Class.forName(DaoString).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public int findMaxUserId() {
		// TODO Auto-generated method stub
		return userDao.findMaxUserId();
	}

	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return userDao.findAllUsers();
	}

	public User findUserById(int userId) {
		// TODO Auto-generated method stub
		return userDao.findUserById(userId);
	}

	public User findUserByName(String userName) {
		// TODO Auto-generated method stub
		return userDao.findUserByName(userName);
	}

	public int isValuedUser(String userName, String userPassword) {
		// TODO Auto-generated method stub
		return userDao.isValuedUser(userName, userPassword);
	}

	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return userDao.insertUser(user);
	}

	public int deleteUserById(int userId) {
		// TODO Auto-generated method stub
		return userDao.deleteUserById(userId);
	}

	public int deleteUserByName(int userName) {
		// TODO Auto-generated method stub
		return userDao.deleteUserByName(userName);
	}

	public int updateUserByUserId(int userId, User newUser) {
		// TODO Auto-generated method stub
		return userDao.updateUserByUserId(userId, newUser);
	}

	public int updateUserByuserName(String userName, User newUser) {
		// TODO Auto-generated method stub
		return userDao.updateUserByuserName(userName, newUser);
	}

}
