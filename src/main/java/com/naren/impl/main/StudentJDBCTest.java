package com.naren.impl.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naren.config.AppConfig;
import com.naren.dto.Foo;
import com.naren.dto.HelloIndia;
import com.naren.dto.HelloWorld;
import com.naren.spring.jdbc.dao.Student;
import com.naren.spring.jdbc.dao.StudentDAO;

/**
 * Hello world!
 *
 */
public class StudentJDBCTest 
{
	private static final AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring-jdbc.xml");
	public static void main( String[] args )
	{
		springJDBC(1);
		//springAnnotationCONFIG();
		springXMLConfig();
	}

	public static void springXMLConfig()
	{
		AbstractApplicationContext appcontext=new ClassPathXmlApplicationContext("config.xml");
		HelloWorld messageH=(HelloWorld)appcontext.getBean("helloWorld");
		System.out.println(messageH.getMessage1());
		System.out.println(messageH.getMessage2());
		HelloIndia objB = (HelloIndia) appcontext.getBean("helloIndia");
		System.out.println(objB.getMessage1());
		System.out.println(objB.getMessage2());
		System.out.println(objB.getMessage3());
		appcontext.registerShutdownHook();
	}

	public static void springAnnotationCONFIG()
	{

		// OR SPRING CONFIG USING ANNOTATION 
		AnnotationConfigApplicationContext acApplicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
		Foo foo=(Foo)acApplicationContext.getBean("foo");
		foo.callBar();
		System.out.println(foo.getFooMessage());
	}

	public static void springJDBC(int option){
		Student student=new Student();
		student.setAge(271);
		student.setFirstName("Nareb1nder");
		student.setLastName("Tan1war");
		student.setStudentID(new Long(100010));
		switch(option){
		case 1:create(student);getStudentList();
		break;
		case 2:getStudent((long) 10000);
			break;
		case 3:deleteStudent((long) 10000);getStudentList();
			break;
		case 4:updateStudent(student);getStudentList();
			break;
		case 5:getStudentList();
			break;
		default :
		}

	}
	/**
	 * 
	 * @param student
	 */
	private static void create(Student student) {

		getStudentDAO().save(student);
	}
	/**
	 * 
	 * @param studentID
	 */
	private static void getStudent(Long studentID) {

		System.out.println(getStudentDAO().get(studentID));
	}
	/**
	 * 
	 */
	private static void deleteStudent(Long studentID) {
		Student student=new Student();
		student.setStudentID(studentID);
		getStudentDAO().delete(student);
	}
	/**
	 * @param student
	 */
	private static void updateStudent(Student student) {

		getStudentDAO().save(student);
	}
	/**
	 */
	private static void getStudentList() {

		List<Student> studentList=getStudentDAO().findAll();
		System.out.println(studentList);
	}
	/**
	 * 
	 * @return
	 */
	public static StudentDAO getStudentDAO(){
		return (StudentDAO) context.getBean("studentDAO");
	}
}
