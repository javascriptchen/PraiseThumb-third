package com.heima.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtils {
	private static String drivername = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/JDBCtest";
	private static String username = "root";
	private static String password = "root";

	static {
		try {
			Class.forName(drivername);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("驱动加载失败");
		}
	}

	public static Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url, username, password);
		return conn;
	}

	public static void closeAll(Connection conn, Statement st, ResultSet rs) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
