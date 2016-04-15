package com.naren.spring.jdbc.dao.imp;import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.naren.spring.jdbc.dao.Student;
import com.naren.spring.jdbc.dao.StudentDAO;
import com.naren.spring.jdbc.mappers.StudentMapper;

/**

import javax.sql.DataSource;
 * 
 */

/**
 * @author nstanwar
 *
 */
public class StudentDAOImp implements StudentDAO{

	/**
	 * 
	 */
	private static final String SQLQ_INSERT_QUERY="INSERT INTO STUDENT(STUDENT_ID,FIRSTNAME,LASTNAME,AGE) VALUES(?,?,?,?)";
	private static final String SQL_DELETE_QUERY="DELETE FROM STUDENT WHERE STUDENT_ID=?";
	private static final String SQLQ_UPDATE_QUERY="UPDATE STUDENT SET LASTNAME=? WHERE STUDENT_ID=?";
	private static final String SQLQ_SELECT_SEARCH="SELECT * FROM STUDENT WHERE STUDENT_ID=?";
	private static final String SQL_SELECT_QUERY="SELECT * FROM STUDENT";
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	/**
	 * 
	 */
	public StudentDAOImp() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	public void setDataSource(DataSource dataSource)
	{
		this.dataSource=dataSource;
		this.jdbcTemplateObject=new JdbcTemplate(dataSource);
	}
	public void update(Student student) {
		jdbcTemplateObject.update(SQLQ_UPDATE_QUERY, new Object[]{student.getLastName(),student.getStudentID()});
	}
	public Student get(Long paramLong) {
		Student student=(Student) jdbcTemplateObject.queryForObject(SQLQ_SELECT_SEARCH,new Object[]{paramLong},new StudentMapper());
		return student;
	}
	public Student save(Student student) {
		jdbcTemplateObject.update(SQLQ_INSERT_QUERY,new Object[]{student.getStudentID(),student.getFirstName(),student.getLastName(),student.getAge()});
		return get(student.getStudentID());
	}
	public void delete(Student student) {
		jdbcTemplateObject.update(SQL_DELETE_QUERY,student.getStudentID());
		
	}
	public List<Student> findAll() {
		List<Student> studentListj=jdbcTemplateObject.query(SQL_SELECT_QUERY,new StudentMapper());
		return studentListj;
	}
	public Student getStudent(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

}
