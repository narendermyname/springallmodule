/**
 * 
 */
package com.naren.impl.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naren.dto.TextEditor;

/**
 * @author nstanwar
 *
 */
public class InjectingInnerBean {

	/**
	 * 
	 */
	public InjectingInnerBean() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appcontext=new ClassPathXmlApplicationContext("spring-texteditor.xml");
		TextEditor textEditor=(TextEditor)appcontext.getBean("textEditor");
		textEditor.checkSpell();
	}

}
