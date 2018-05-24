package com.clienteapp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.clienteapp.model.Admin;
import com.clienteapp.model.Customer;

public class CustomerMapper implements RowMapper<Customer> {
	
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer cus = new Customer();
		cus.setCustomer_id(rs.getInt("customer_id"));
		cus.setCompany_name(rs.getString("company_name"));
		cus.setContact_name(rs.getString("contact_name"));
		cus.setContact_tittle(rs.getString("contact_tittle"));
		cus.setAddress(rs.getString("address"));
		cus.setCity(rs.getString("city"));
		return cus;
	}
}
