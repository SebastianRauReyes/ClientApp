package com.clienteapp.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.clienteapp.exception.DAOException;
import com.clienteapp.exception.LoginException;
import com.clienteapp.mapper.AdminMapper;
import com.clienteapp.model.Admin;


@Repository
public class AdminDAOImpl implements AdminDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(AdminDAOImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Admin validate(int admin_id, String password_admin) throws LoginException, DAOException {
		
		//logger.info("validate(): login: " + login + ", clave: " + pwd);
		
		if ("".equals(admin_id) && "".equals(password_admin)) {
			throw new LoginException("Login and password incorrect");
		}
	
		String query = "SELECT admin_id, username_admin, password_admin"
				+ " FROM admin WHERE admin_id=? AND password_admin=?";
	
		Object[] params = new Object[] { admin_id, password_admin};
	
		try {
			Admin admin = (Admin) jdbcTemplate.queryForObject(query, params, new AdminMapper());
			//
			return admin;
	
		} catch (EmptyResultDataAccessException e) {
			logger.info("id y/o clave incorrecto");
			throw new LoginException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
		

	}

}
