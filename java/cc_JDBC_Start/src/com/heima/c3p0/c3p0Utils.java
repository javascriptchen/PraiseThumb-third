package com.heima.c3p0;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class c3p0Utils {
	private static ComboPooledDataSource ds = new ComboPooledDataSource();
	
	public static Connection getConnection() throws SQLException {
		// 返回一个连接对象,不要用DriverManager获取,而是连接池中获取
		return ds.getConnection();
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
