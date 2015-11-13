package com.chinasofti.etc.happybookshop.service.serviceimpl;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;

import com.chinasofti.etc.happybookshop.dao.CategoryDao;
import com.chinasofti.etc.happybookshop.po.Category;
import com.chinasofti.etc.happybookshop.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
	private CategoryDao categoryDao = null;

	public CategoryServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
		File file = new File("f:/myconfig.properties");
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(file));
			String categoryDaoString = properties.getProperty("CategoryDao");
			categoryDao = (CategoryDao) Class.forName(categoryDaoString).newInstance();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public Set<Category> findAllCategory() {
		// TODO Auto-generated method stub
		return categoryDao.findAllCategory();
	}

}
