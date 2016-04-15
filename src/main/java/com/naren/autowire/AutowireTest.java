/**
 * 
 */
package com.naren.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author narender
 *
 */
public class AutowireTest {

	/**
	 * 
	 */
	public AutowireTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext=new ClassPathXmlApplicationContext("spring-autowiore.xml");
		AutowireParent autowire=appContext.getBean(AutowireParent.class);
		autowire.callDependennt1();
		//ApplicationContext context=new AnnotationConfigApplicationContext(AnnotationConfiguration.class);
		//OR 
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.naren");
		context.refresh();
		AutowireParent autowire1=context.getBean(AutowireParent.class);
		autowire1.callDependennt();
	}

}
