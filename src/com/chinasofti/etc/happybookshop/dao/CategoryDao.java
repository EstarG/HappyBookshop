package com.chinasofti.etc.happybookshop.dao;

import java.util.Set;

import com.chinasofti.etc.happybookshop.po.Category;

public interface CategoryDao {
	Set<Category> findAllCategory();
}
