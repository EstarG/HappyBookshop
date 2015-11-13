package com.chinasofti.etc.happybookshop.dao.mysqlimpl;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import com.chinasofti.etc.happybookshop.dao.CategoryDao;
import com.chinasofti.etc.happybookshop.po.Category;

public class CategoryDaoImpl extends BaseDao implements CategoryDao {

	public Set<Category> findAllCategory() {
		// TODO Auto-generated method stub
		Set<Category> categories = new HashSet<Category>();
		Category category = null;
		getConn();
		String sql = "select * from categorys";
		doQuery(sql);
		try {
			while (rs.next()) {
				category = new Category();
				category.setCatId(rs.getInt(1));
				category.setCatName(rs.getString(2));
				categories.add(category);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return categories;
	}

}
