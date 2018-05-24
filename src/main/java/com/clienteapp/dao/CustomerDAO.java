package com.clienteapp.dao;

import java.util.List;

import com.clienteapp.exception.DAOException;
import com.clienteapp.exception.EmptyResultException;
import com.clienteapp.model.Customer;



public interface CustomerDAO {
	 
	Customer findCustomer(int customer_id) throws DAOException, EmptyResultException;

	void create( String company_name, String contact_name, String contact_tittle, String address, String city) throws DAOException;

	void delete(int customer_id) throws DAOException;

	void update(int customer_id,String company_name, String contact_name, String contact_tittle, String address, String city) throws DAOException;

	
	Customer findCustomerByLogin(String company_name) throws DAOException, EmptyResultException;

	List<Customer> findAllCustomers() throws DAOException;

	List<Customer> findCustomerByName(String contact_name) throws DAOException;
}
