/**
 * 
 */
package com.naren.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.naren.dto.Bar;
import com.naren.dto.Foo;

/**
 * @author nstanwar
 *
 */
@Configuration
public class AppConfig {

	/**
	 * 
	 */
	public AppConfig() {
		// TODO Auto-generated constructor stub
	}
	@Bean(initMethod="init",destroyMethod="cleanup")
	@Scope("prototype")
	public Foo foo()
	{
		return new Foo(bar());
	}
	@Bean
	public Bar bar()
	{
		return new Bar();	
	}
}
