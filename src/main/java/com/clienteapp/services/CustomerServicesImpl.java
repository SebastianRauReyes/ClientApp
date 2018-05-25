package com.clienteapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clienteapp.dao.CustomerDAO;
import com.clienteapp.exception.DAOException;
import com.clienteapp.exception.EmptyResultException;
import com.clienteapp.model.Customer;

@Service
public class CustomerServicesImpl implements CustomerService {
	
	
	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public Customer find(int customer_id) throws DAOException, EmptyResultException {
		
		Customer cus = customerDAO.findCustomer(customer_id);
		return cus;
		
	}

	@Override
	public List<Customer> findAll() throws DAOException, EmptyResultException {
		
		List<Customer> cus = customerDAO.findAllCustomers();
		return cus;
		
	}

	@Override
	public void update(int customer_id, String company_name, String contact_name, String contact_tittle, String address,
			String city) throws DAOException {
		
		customerDAO.update(customer_id, company_name,contact_name, contact_tittle, address, city);
		
	}

	@Override
	public void delete(int customer_id) throws DAOException {
		
		customerDAO.delete(customer_id);
		
	}

	@Override
	public void create(String company_name, String contact_name, String contact_tittle, String address, String city)
			throws DAOException {
			customerDAO.create(company_name, contact_name, contact_tittle, address, city);
			
			
	}

	

}
