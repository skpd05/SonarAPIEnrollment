/**
 * 
 */
package com.mc.demo.app.enrollement.model;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Wipro
 *
 */
public interface AccountRepository extends CrudRepository<Account, Integer> {
	
	public Account findByAccountnumber(String accountnumber);

}
