/**
 * 
 */
package com.naren.spring.jdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.naren.dto.User;
import com.naren.spring.jdbc.mappers.UserMapper;

/**
 * @author narender
 *
 */
@Configuration
public class UserDAOImpl1 implements UserDAO {
	
	private static final String SQLQ_INSERT_QUERY="INSERT INTO APP_USER(EMAIL,FIRSTNAME,LASTNAME,USER_PASSWORD) VALUES(?,?,?,?)";
	private static final String SQL_DELETE_QUERY="DELETE FROM APP_USER WHERE EMAIL=?";
	private static final String SQLQ_UPDATE_QUERY="UPDATE APP_USER SET FIRSTNAME=?, LASTNAME=?,USER_PASSWORD=? WHERE EMAIL=?";
	private static final String SQLQ_SELECT_SEARCH="SELECT * FROM APP_USER WHERE EMAIL=?";
	private static final String SQL_SELECT_QUERY="SELECT * FROM APP_USER";
	private JdbcTemplate jdbcTemplateObject;
	private String driverClassName;
	private String url;
	private String username;
	private String password;
	/**
	 * 
	 */
	public UserDAOImpl1() {
		// TODO Auto-generated constructor stub
	}
	
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/* (non-Javadoc)
	 * @see com.naren.spring.jdbc.dao.BaseDAO#setDataSource(javax.sql.DataSource)
	 */
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/nstanwar");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	public void setDataSource(DataSource datsSource) {
		this.jdbcTemplateObject=new JdbcTemplate(dataSource());

	}

	/* (non-Javadoc)
	 * @see com.naren.spring.jdbc.dao.BaseDAO#get(java.lang.Long)
	 */
	public User get(Long paramLong) {
		User user=jdbcTemplateObject.queryForObject(SQLQ_SELECT_SEARCH, new Object[]{paramLong}, new UserMapper());
		return user;
	}

	/* (non-Javadoc)
	 * @see com.naren.spring.jdbc.dao.BaseDAO#save(java.lang.Object)
	 * save user
	 */
	public User save(User paramT) {
		jdbcTemplateObject.update(SQLQ_INSERT_QUERY, new Object[]{paramT.getEmail(),paramT.getFirstName(),paramT.getLastName(),paramT.getPassword()});
		return null;
	}

	/* (non-Javadoc)
	 * @see com.naren.spring.jdbc.dao.BaseDAO#delete(java.lang.Object)
	 * delete user
	 */
	public void delete(User paramT) {
		jdbcTemplateObject.update(SQL_DELETE_QUERY, new Object[]{paramT.getEmail()});

	}

	/* (non-Javadoc)
	 * @see com.naren.spring.jdbc.dao.BaseDAO#findAll()
	 * list all user
	 */
	public List<User> findAll() {
		List<User> userList=jdbcTemplateObject.query(SQL_SELECT_QUERY, new UserMapper());
		return userList;
	}
	/**
	 * find user by email
	 */
	public User findByEmail(String email) {
		User user=jdbcTemplateObject.queryForObject(SQLQ_SELECT_SEARCH, new Object[]{email}, new UserMapper());
		return user;
	}
	/**
	 * update user
	 */
	public void update(User paramT) {
		jdbcTemplateObject.update(SQLQ_UPDATE_QUERY, new Object[]{paramT.getFirstName(),paramT.getLastName(),paramT.getPassword(),paramT.getEmail()});
	}

}
