/**
 * 
 */
package com.naren.autowire;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;

import com.naren.qualifier.Format;
import com.naren.qualifier.Genre;

/**
 * @author narender
 *
 */
public class AutowireParent {

	public AutowireParent() {
	}

	/**
	 * 
	 */
	//@Autowired(required=false)
	//resource is same as @Autowire
	//@Resource
	//use @Inject at the class-level, field-level, method-level and constructor-argument level
	@Inject
	private AutowireDependent autowireDependent;
	private AutowireDependent autowireDependent2;
	@Autowired//(required=false)
	@Genre(value="x" ,format=Format.X)
	private AnnoteMe annoteMeX;
	@Autowired//(required=false)
	@Genre(value="y" ,format=Format.Y)
	private AnnoteMe annoteMeY;
	@Autowired
	public AutowireParent(AutowireDependent autowireDependent) {
		this.autowireDependent2=autowireDependent;
	}
	@PostConstruct
	public void init(){
		System.out.println("in starts init() "+autowireDependent+" "+autowireDependent);
	}
	@PreDestroy
	public void destroy(){
		System.out.println("destroy()");
	}

	public void  callDependennt(){
		System.out.println("starts from Parent call method.");
		autowireDependent.iMDependent();
		//annoteMeX.annoteMe();
		//annoteMeY.annoteMe();
	}
	public void callDependennt1() {
		System.out.println("starts from Parent call method.");
		autowireDependent.iMDependent();
		annoteMeX.annoteMe();
		annoteMeY.annoteMe();
		
	}
}
