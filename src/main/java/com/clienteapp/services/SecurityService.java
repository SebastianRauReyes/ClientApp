package com.clienteapp.services;

import com.clienteapp.exception.DAOException;
import com.clienteapp.exception.LoginException;
import com.clienteapp.model.Admin;

public interface SecurityService {
	
	Admin validate(int admin_id, String clave) throws LoginException, DAOException;

}
