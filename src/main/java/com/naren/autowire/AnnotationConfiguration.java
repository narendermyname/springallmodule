/**
 * 
 */
package com.naren.autowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author narender
 *
 */
@Configuration
public class AnnotationConfiguration {

	/**
	 * 
	 */
	public AnnotationConfiguration() {
		// TODO Auto-generated constructor stub
	}
	
	@Bean
	public AutowireParent autowireParent(){
		return new AutowireParent(autowireDependent());
	}

	@Bean
	public AutowireDependent autowireDependent(){
		return new AutowireDependent();
	}
}
