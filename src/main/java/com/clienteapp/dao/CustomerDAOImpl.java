package com.clienteapp.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.clienteapp.exception.DAOException;
import com.clienteapp.exception.EmptyResultException;
import com.clienteapp.mapper.CustomerMapper;
import com.clienteapp.model.Customer;




@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	
	private static final Logger logger = LoggerFactory.getLogger(CustomerDAOImpl.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	@Override
	public Customer findCustomer(int customer_id) throws DAOException, EmptyResultException {
		
		String query = "SELECT customer_id, company_name, contact_name, contact_tittle, address, city "
				+ " FROM customers WHERE customer_id = ?";

		Object[] params = new Object[] { customer_id };

		try {

			Customer cus = (Customer) jdbcTemplate.queryForObject(query, params, new CustomerMapper());
			//
			return cus;
			//return null;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public void create(String company_name, String contact_name, String contact_tittle, String address, String city)
			throws DAOException {
		
		String query = "INSERT INTO  customers(company_name, contact_name, contact_tittle, address, city)  VALUES (?,?,?,?,?)";

		Object[] params = new Object[] { company_name,contact_name, contact_tittle,address, city };

		Customer cus = null;
		
		try {
			// create
			jdbcTemplate.update(query, params);
			// search
			cus = this.findCustomerByLogin(company_name);

		} catch (EmptyResultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
		
	}

	@Override
	public void delete(int customer_id) throws DAOException {
		
		String query = "DELETE FROM customers WHERE customer_id = ? ";

		Object[] params = new Object[] { customer_id };

		try {
			jdbcTemplate.update(query, params);
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
		
	}

	@Override
	public void update(int customer_id, String company_name, String contact_name, String contact_tittle, String address,
			String city) throws DAOException {
		
		String query = "UPDATE customers SET company_name = ?, contact_name =?, contact_tittle = ?, address = ?, city = ? WHERE customer_id = ?";

		Object[] params = new Object[] { company_name, company_name, contact_tittle, address, city, customer_id};

		try {
			jdbcTemplate.update(query, params);
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
		
		
		
	}

	@Override
	public Customer findCustomerByLogin(String company_name) throws DAOException, EmptyResultException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findAllCustomers() throws DAOException, EmptyResultException {
		
		String query = "SELECT customer_id, company_name, contact_name, contact_tittle, address, city FROM customers";

		try {

			List<Customer> customers = jdbcTemplate.query(query, new CustomerMapper());
			//
			return customers;

		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
		
	}

	@Override
	public List<Customer> findCustomerByName(String contact_name) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

}
