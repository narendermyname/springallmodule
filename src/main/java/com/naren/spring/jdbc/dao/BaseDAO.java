/**
 * 
 */
package com.naren.spring.jdbc.dao;

import java.util.List;

import javax.sql.DataSource;

/**
 * @author narender
 *
 */
public interface BaseDAO<T> {
	
	/**
	 * Set Data Source
	 * @param datsSource
	 */
	//public void setDataSource(DataSource datsSource);
	
	public abstract T get(Long paramLong);

	public abstract T save(T paramT);
	
	public abstract void update(T paramT);

	public abstract void delete(T paramT);
	
	public abstract List<T> findAll();

}
