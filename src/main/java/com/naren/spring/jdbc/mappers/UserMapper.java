/**
 * 
 */
package com.naren.spring.jdbc.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.naren.dto.User;

/**
 * @author narender
 *
 */
public class UserMapper implements RowMapper<User> {

	/**
	 * 
	 */
	public UserMapper() {
		// TODO Auto-generated constructor stub
	}

	public User mapRow(ResultSet result, int arg1) throws SQLException {
		User user=new User();
		user.setEmail(result.getString("EMAIL"));
		user.setFirstName(result.getString("FIRSTNAME"));
		user.setLastName(result.getString("LASTNAME"));
		user.setPassword(result.getString("USER_PASSWORD"));
		return user;
	}

}
