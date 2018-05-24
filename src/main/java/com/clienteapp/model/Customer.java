package com.clienteapp.model;

public class Customer {
	
	int customer_id;
	String company_name;
	String contact_name;
	String contact_tittle;
	String address;
	String city;
	
	public Customer() {
		super();
		
	}
	
	public Customer(int customer_id, String company_name, String contact_name, String contact_tittle, String address,
			String city) {
		super();
		this.customer_id = customer_id;
		this.company_name = company_name;
		this.contact_name = contact_name;
		this.contact_tittle = contact_tittle;
		this.address = address;
		this.city = city;
	}
	
	
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getContact_name() {
		return contact_name;
	}
	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}
	public String getContact_tittle() {
		return contact_tittle;
	}
	public void setContact_tittle(String contact_tittle) {
		this.contact_tittle = contact_tittle;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", company_name=" + company_name + ", contact_name="
				+ contact_name + ", contact_tittle=" + contact_tittle + ", address=" + address + ", city=" + city + "]";
	}
	

	
	
}

