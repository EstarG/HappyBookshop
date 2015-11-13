package com.chinasofti.etc.happybookshop.service;

import java.util.List;

import com.chinasofti.etc.happybookshop.po.User;

public interface UserService {
	//��:
	int findMaxUserId();
	List<User> findAllUsers();
	User  findUserById(int userId);
	User  findUserByName(String userName);
	int  isValuedUser(String userName,String userPassword);
	//��:
	int  insertUser(User user);
	//ɾ��
	int deleteUserById(int userId);
	int deleteUserByName(int userName);
	//�ģ�
	int updateUserByUserId(int userId,User newUser);
	int updateUserByuserName(String userName,User newUser);
}
