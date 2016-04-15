/**
 * 
 */
package com.naren.autowire;

import org.springframework.stereotype.Component;

/**
 * @author narender
 *
 */
@Component
//@Genre(value="y",format = Format.Y)
public class AnnoteMeY implements AnnoteMe {

	/**
	 * 
	 */
	public AnnoteMeY() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.naren.autowire.AnnoteMe#annoteMe()
	 */
	public void annoteMe() {
		System.out.println("Annote Y.");

	}

}
