/**
 * 
 */
package com.naren.util;

import org.springframework.beans.BeansException;

/**
 * @author nstanwar
 *
 */
public class BeanPostProcessorClass implements org.springframework.beans.factory.config.BeanPostProcessor{

	/**
	 * 
	 */
	public BeanPostProcessorClass() {
		// TODO Auto-generated constructor stub
	}

	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("postProcessAfterInitialization : " + beanName);
	      return bean;  // you can return any other object as well
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("postProcessBeforeInitialization : " + beanName);
	      return bean;  // you can return any other object as well
	}

}
