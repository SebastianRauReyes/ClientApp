package com.clienteapp.services;

import com.clienteapp.exception.DAOException;
import com.clienteapp.exception.EmptyResultException;
import com.clienteapp.model.Customer;

public interface CustomerService {
	
	Customer find(int customer_id) throws DAOException, EmptyResultException;

	java.util.List<Customer> findAll() throws DAOException;

	void update(int customer_id,String company_name, String contact_name, String contact_tittle, String address, String city) throws DAOException;
	
	void delete(int customer_id) throws DAOException;
	
	void create(String company_name, String contact_name, String contact_tittle, String address, String city) throws DAOException, EmptyResultException;

}
