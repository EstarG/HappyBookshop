package com.chinasofti.etc.happybookshop.po;

public class Categorys {
	private int catId;
	private int catName;
	//
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public int getCatName() {
		return catName;
	}
	public void setCatName(int catName) {
		this.catName = catName;
	}
	public Categorys() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categorys(int catId, int catName) {
		super();
		this.catId = catId;
		this.catName = catName;
	}
	
}
