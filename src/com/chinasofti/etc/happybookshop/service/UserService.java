package com.chinasofti.etc.happybookshop.service;

import java.util.List;

import com.chinasofti.etc.happybookshop.po.User;

public interface UserService {
	//²é:
	int findMaxUserId();
	List<User> findAllUsers();
	User  findUserById(int userId);
	User  findUserByName(String userName);
	int  isValuedUser(String userName,String userPassword);
	//Ôö:
	int  insertUser(User user);
	//É¾£º
	int deleteUserById(int userId);
	int deleteUserByName(int userName);
	//¸Ä£º
	int updateUserByUserId(int userId,User newUser);
	int updateUserByuserName(String userName,User newUser);
}
