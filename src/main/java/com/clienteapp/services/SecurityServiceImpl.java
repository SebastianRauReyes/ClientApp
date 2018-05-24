package com.clienteapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clienteapp.dao.AdminDAO;
import com.clienteapp.exception.DAOException;
import com.clienteapp.exception.LoginException;
import com.clienteapp.model.Admin;

@Service
public class SecurityServiceImpl implements SecurityService {
	
	@Autowired
	private AdminDAO adminDAO;

	@Override
	public Admin validate(int admin_id, String clave) throws LoginException, DAOException {
		
		Admin admin = adminDAO.validate(admin_id, clave);

		return admin;
	}
		

}
