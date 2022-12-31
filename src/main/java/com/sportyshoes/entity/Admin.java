package com.sportyshoes.entity;

public class Admin {
	
	public String Admin_username;
	public String Admin_Password;
	
	public String getAdmin_username() {
		return Admin_username;
	}
	public void setAdmin_username(String admin_username) {
		Admin_username = admin_username;
	}
	public String getAdmin_Password() {
		return Admin_Password;
	}
	public void setAdmin_Password(String admin_Password) {
		Admin_Password = admin_Password;
	}
	public Admin(String admin_username, String admin_Password) {
		super();
		Admin_username = admin_username;
		Admin_Password = admin_Password;
	}
	
	
	
	

}
