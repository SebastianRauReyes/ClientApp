package com.clienteapp.model;

public class Admin {
	
	int admin_id;
	String username_admin;
	String password_admin;
	
	
	
	public Admin(int admin_id, String username_admin, String password_admin) {
		super();
		this.admin_id = admin_id;
		this.username_admin = username_admin;
		this.password_admin = password_admin;
	}


	public Admin() {
		super();
	
	}


	public int getAdmin_id() {
		return admin_id;
	}


	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}


	public String getUsername_admin() {
		return username_admin;
	}


	public void setUsername_admin(String username_admin) {
		this.username_admin = username_admin;
	}


	public String getPassword_admin() {
		return password_admin;
	}


	public void setPassword_admin(String password_admin) {
		this.password_admin = password_admin;
	}
	
	
	
	
	
	

}
