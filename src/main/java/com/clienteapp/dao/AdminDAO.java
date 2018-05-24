package com.clienteapp.dao;

import com.clienteapp.exception.DAOException;
import com.clienteapp.exception.LoginException;
import com.clienteapp.model.Admin;

public interface AdminDAO {

	Admin validate(int admin_id, String password_admin) throws LoginException, DAOException;

}
