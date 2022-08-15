package com.bolsadeideas.springboot.indigitalxp.app.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.indigitalxp.app.mapper.CustomerMapper;
import com.bolsadeideas.springboot.indigitalxp.app.model.Customer;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerMapper customerMapper;
	
	public int create(Customer customer) {
		int result = customerMapper.create(customer);
		return result;
	}
	
	public List<Customer> findCustomerDniOrEmail(String dni, String email) {
		Customer currentCustomer = new Customer();
		currentCustomer.setDni(dni);
		currentCustomer.setEmail(email);
		List<Customer> list = customerMapper.findCustomerDniOrEmail(currentCustomer);
		return list;
	}
	
	public List<HashMap> indicator() {
		List<HashMap> map = customerMapper.indicator();
		return map;
	}
	

}
