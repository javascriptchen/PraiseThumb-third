package com.heima.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.heima.domain.Product;
import com.heima.utils.C3P0Utils02;

public class ProductDao {

	public Product findById(int id) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Utils02.getDataSource());
		Product p = qr.query("select * from products where pid = ?", new BeanHandler<Product>(Product.class), id);
		return p;
	}

	public void editProduct(Product p) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Utils02.getDataSource());
		Object[] params = {p.getPname(),p.getPrice(),p.getPid()};
		qr.update("update products set pname=?,price=? where pid=?", params);
	}

	public List<Product> findAll() throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Utils02.getDataSource());
		List<Product> ps = qr.query("select * from products", new BeanListHandler<Product>(Product.class));
		return ps;
	}

	public void addProduct(Product p) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Utils02.getDataSource());
		Object[] params = {p.getPname(),p.getPrice(),"1","c002"};
		qr.update("insert into products (pname,price,flag,category_id) values(?,?,?,?)",params);
	}

	public void deleteProduct(int id) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Utils02.getDataSource());
		qr.update("delete from products where pid=?",id);
	}

}
