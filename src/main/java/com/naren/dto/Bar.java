/**
 * 
 */
package com.naren.dto;

/**
 * @author nstanwar
 *
 */
public class Bar {

	/**
	 * 
	 */
	private String barMesage;
	
	/**
	 * @return the barMesage
	 */
	public String getBarMesage() {
		return barMesage;
	}

	/**
	 * @param barMesage the barMesage to set
	 */
	public void setBarMesage(String barMesage) {
		this.barMesage = barMesage;
	}

	public Bar() {
		// TODO Auto-generated constructor stub
	}

	public void callBar()
	{
		System.out.println("Call Bar jj");
	}
}
