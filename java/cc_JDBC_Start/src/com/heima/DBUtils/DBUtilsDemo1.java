package com.heima.DBUtils;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

public class DBUtilsDemo1 {

	public static void main(String[] args) throws SQLException {
//		insert();
//		delete();
		update();
		
	}

	private static void update() throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Utils02.getDataSource());
		int row = qr.update("update category set cname=? where cid=?",new Object[] {"乒乓球",1});
		System.out.println(row);
	}

	private static void delete() throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Utils02.getDataSource());
		Object[] obj = {16};
		int row = qr.update("delete from category where cid=?", obj);
		System.out.println(row);
	}
	

	private static void insert() throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Utils02.getDataSource());
		Object[] obj = {null,"呵呵呵呵"};
		int row = qr.update("insert into category values(?,?)", obj);
		System.out.println(row);
	}
	
	

}
