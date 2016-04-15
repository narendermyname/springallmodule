/**
 * 
 */
package com.naren.spring.jdbc.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.naren.dto.Product;

/**
 * @author narender
 *
 */
public class ProductMapper implements RowMapper<Product>{

	/**
	 * 
	 */
	public ProductMapper() {
		// TODO Auto-generated constructor stub
	}

	public Product mapRow(ResultSet resultSet, int arg1) throws SQLException {
		Product product=new Product();
		product.setId(resultSet.getLong("id"));
		product.setPrice(resultSet.getLong("price"));
		product.setProductName(resultSet.getString("productName"));
		product.setProductDesc(resultSet.getString("productDesc"));
		return product;
	}

}
