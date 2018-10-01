package com.heima.DBUtils;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

public class DBUtilsDemo2 {

	public static void main(String[] args) throws SQLException {
		demo08();
	}

	public static void demo08() throws SQLException{
		//1.创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils02.getDataSource());
		//2.执行查询
		String sql = "select count(*) from category";
		Object count = qr.query(sql,new ScalarHandler<Object>());
		//3
		System.out.println(count);
	}

}
