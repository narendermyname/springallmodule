/**
 * 
 */
package com.naren.spring.jdbc.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.naren.spring.jdbc.dao.Student;

/**
 * @author nstanwar
 *
 */
public class StudentMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet resultSet, int row) throws SQLException {
		Student student=new Student();
		student.setStudentID(resultSet.getLong("STUDENT_ID"));
		student.setFirstName(resultSet.getString("FIRSTNAME"));
		student.setFirstName(resultSet.getString("LASTNAME"));
		student.setAge(resultSet.getInt("AGE"));
		return student;
	}

}
