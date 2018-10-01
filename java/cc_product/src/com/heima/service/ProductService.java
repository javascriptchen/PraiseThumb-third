package com.heima.service;

import java.sql.SQLException;
import java.util.List;

import com.heima.dao.ProductDao;
import com.heima.domain.Product;

public class ProductService {

	public Product findById(int id) {
		Product p = null;
		ProductDao dao = new ProductDao();
		try {
			p = dao.findById(id);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return p;
	}

	public void editProduct(Product p) {
		ProductDao dao = new ProductDao();
		try {
			dao.editProduct(p);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	public List<Product> findAll() {
		ProductDao dao = new ProductDao();
		List<Product> ps = null;
		try {
			ps = dao.findAll();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return ps;
		
	}

	public void addProduct(Product p) {
		ProductDao dao = new ProductDao();
		try {
			dao.addProduct(p);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public void deleteProduct(int id) {
		ProductDao dao = new ProductDao();
		try {
			dao.deleteProduct(id);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
