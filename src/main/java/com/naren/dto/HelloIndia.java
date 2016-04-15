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
public class HelloIndia implements InitializingBean,DisposableBean {

	/**
	 * 
	 */
	private String message1;
	private String message2;
	private String message3;
	public HelloIndia() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the message1
	 */
	public String getMessage1() {
		return message1;
	}
	/**
	 * @param message1 the message1 to set
	 */
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
	/**
	 * @return the message3
	 */
	public String getMessage3() {
		return message3;
	}
	/**
	 * @param message3 the message3 to set
	 */
	public void setMessage3(String message3) {
		this.message3 = message3;
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
