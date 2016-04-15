/**
 * 
 */
package com.naren.dto;

/**
 * @author nstanwar
 *
 */
public class Foo {

	/**
	 * 
	 */
	private String fooMessage;
	private Bar bar;
	/**
	 * @return the fooMessage
	 */
	public String getFooMessage() {
		return fooMessage;
	}
	/**
	 * @param fooMessage the fooMessage to set
	 */
	public void setFooMessage(String fooMessage) {
		this.fooMessage = fooMessage;
	}
	public Foo(Bar bar) {
		// TODO Auto-generated constructor stub
		this.bar=bar;
	}
	public void callBar()
	{
		bar.callBar();
	}
	
	public void init() {
	      // initialization logic
		System.out.println("init");
	   }
	   public void cleanup() {
	      // destruction logic
		   System.out.println("Clean");
	   }
	

}
