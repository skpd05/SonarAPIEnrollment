package com.mc.demo.app.enrollement.model;

import org.springframework.data.repository.CrudRepository;



public interface UserRespository extends CrudRepository<Userprofile, Integer> {
	
	public Userprofile findUserByUserid(String userid);
	
	public Userprofile findUserByAccountnumber(String accountnumber);

}
