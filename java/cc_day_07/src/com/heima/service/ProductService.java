package com.heima.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.heima.dao.ProductDao;
import com.heima.domain.Product;
import com.heima.utils.C3P0Utils02;
import com.heima.utils.ConnectionManager;

public class ProductService {
	// 添加商品
	public void addProduct(Product p) {
		ProductDao dao = new ProductDao();
		try {
			dao.addProduct(p);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Product findById(int id) {
		ProductDao dao = new ProductDao();
		Product p = null;
		try {
			p = dao.findById(id);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return p;
	}

	public void updateProduct(Product p) {
		ProductDao dao = new ProductDao();
		try {
			p = dao.updateProduct(p);
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

	public void deleteById(int id) {
		ProductDao dao = new ProductDao();
		try {
			dao.deleteById(id);
		} catch (SQLException e) {

			e.printStackTrace();
		} 
	}

	public void deleteAll(List<Integer> ids) {
		ProductDao dao = new ProductDao();
		try {
			ConnectionManager.start();
			for (Integer id : ids) {
				dao.deleteById( id);
			}
			ConnectionManager.commit();
		} catch (Exception e) {

			e.printStackTrace();
			try {
				ConnectionManager.rollback();
			} catch (SQLException e1) {

				e1.printStackTrace();
			}
		} finally {
			try {
				ConnectionManager.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}
}
