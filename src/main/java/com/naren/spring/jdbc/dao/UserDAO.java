/**
 * 
 */
package com.naren.spring.jdbc.dao;

import com.naren.dto.User;

/**
 * @author narender
 *
 */
public interface UserDAO extends BaseDAO<User> {

	/**
	 * find User By Email
	 * @param email
	 * @return
	 */
	public User findByEmail(String email);
}
