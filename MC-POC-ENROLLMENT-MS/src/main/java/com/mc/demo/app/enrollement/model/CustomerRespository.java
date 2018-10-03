package com.mc.demo.app.enrollement.model;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRespository extends CrudRepository<Customer, Integer> {

	public Customer getCustBycustid(String custid);
}
