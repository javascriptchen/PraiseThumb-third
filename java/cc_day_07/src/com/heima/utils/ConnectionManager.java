package com.heima.utils;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionManager {
	//1.定义一个集合ThreadLocal 对象来保存当前线程的连接
	private static ThreadLocal<Connection> tl = new ThreadLocal<>();
	//2.获取连接
	public static Connection getConnection() throws SQLException {
		Connection conn = tl.get();
		if(conn == null) {
			conn = C3P0Utils02.getConnection();
			tl.set(conn);
		}
		return conn;
	}
	//3.开启事务
	public static void start() throws SQLException {
		ConnectionManager.getConnection().setAutoCommit(false);
	}
	//4.提交事务
	public static void commit() throws SQLException {
		ConnectionManager.getConnection().commit();
	}
	
	//5.回滚事务
	public static void rollback() throws SQLException {
		ConnectionManager.getConnection().rollback();
	}
	//6.关闭连接
	public static void close() throws SQLException {
		ConnectionManager.getConnection().close();
	}
}
