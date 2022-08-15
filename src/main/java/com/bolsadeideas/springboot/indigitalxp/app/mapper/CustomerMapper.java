package com.bolsadeideas.springboot.indigitalxp.app.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bolsadeideas.springboot.indigitalxp.app.model.Customer;

@Mapper
public interface CustomerMapper {
	public int create(Customer customer);
	public List<Customer>findCustomerDniOrEmail(Customer customer);
	public List<HashMap>indicator();
}
