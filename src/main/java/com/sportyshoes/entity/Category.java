package com.sportyshoes.entity;

public class Category {
	public String category_Id;
	public String category_name;
	
	//Constructor
	public Category(String category_Id, String category_name) {
		super();
		this.category_Id = category_Id;
		this.category_name = category_name;
	}
	
	//getters and setters
	public String getCategory_Id() {
		return category_Id;
	}
	public void setCategory_Id(String category_Id) {
		this.category_Id = category_Id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	
}
