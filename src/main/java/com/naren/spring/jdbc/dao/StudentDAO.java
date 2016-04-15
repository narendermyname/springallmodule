/**
 * 
 */
package com.naren.spring.jdbc.dao;


/**
 * @author nstanwar
 *
 */
public interface StudentDAO extends BaseDAO<Student> {
	/**
	 * Get student based on student firstName
	 * @param firstName
	 * @return Student
	 */
	public Student getStudent(String firstName);
}
