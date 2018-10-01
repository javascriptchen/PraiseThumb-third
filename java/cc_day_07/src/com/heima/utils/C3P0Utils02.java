package com.heima.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Utils02 {
	private static ComboPooledDataSource ds = new ComboPooledDataSource();
	
	public static Connection getConnection() throws SQLException {
		// 返回一个连接对象,不要用DriverManager获取,而是连接池中获取
		return ds.getConnection();
	}

	public static DataSource getDataSource() {
		return ds;
	}
	
	// 关闭所有资源的统一代码
	public static void closeAll(Connection conn, Statement st, ResultSet rs) {
		// 负责关闭
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
