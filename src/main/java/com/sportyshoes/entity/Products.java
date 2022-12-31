package com.sportyshoes.entity;

public class Products {
	public String name_of_product;
	public String category_of_product;
	public float price_of_product;
	public String getName_of_product() {
		return name_of_product;
	}
	public void setName_of_product(String name_of_product) {
		this.name_of_product = name_of_product;
	}
	public String getCategory_of_product() {
		return category_of_product;
	}
	public void setCategory_of_product(String category_of_product) {
		this.category_of_product = category_of_product;
	}
	public float getPrice_of_product() {
		return price_of_product;
	}
	public void setPrice_of_product(float price_of_product) {
		this.price_of_product = price_of_product;
	}
	
	public Products(String name_of_product, String category_of_product, float price_of_product) {
		super();
		this.name_of_product = name_of_product;
		this.category_of_product = category_of_product;
		this.price_of_product = price_of_product;
	}
	
	

}
