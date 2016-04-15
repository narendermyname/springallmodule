/**
 * 
 */
package com.naren.dto;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


/**
 * @author nstanwar
 *
 */
public class HelloWorld implements DisposableBean , InitializingBean  {

	/**
	 * 
	 */
	private String message1;
	private String message2;
	public String getMessage1() {
		return message1;
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}

	
	/**
	 * @return the message2
	 */
	public String getMessage2() {
		return message2;
	}

	/**
	 * @param message2 the message2 to set
	 */
	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Clean ME.........");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("INIT ME ..........");
		
	}
	
}
