package com.clienteapp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.clienteapp.model.Admin;


public class AdminMapper implements RowMapper<Admin> {
	
	public Admin mapRow(ResultSet rs, int rowNum) throws SQLException {
		Admin admin = new Admin();
		
		admin.setAdmin_id(rs.getInt("admin_id"));
		admin.setPassword_admin(rs.getString("password_admin"));
		admin.setUsername_admin(rs.getString("username_admin"));
		
		return admin;
	}
}
