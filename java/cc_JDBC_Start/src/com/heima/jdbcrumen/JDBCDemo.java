package com.heima.jdbcrumen;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;

import com.mysql.jdbc.PreparedStatement;

public class JDBCDemo {

	public static void main(String[] args) throws Exception {
		String driverName = null;
		String url = null;
		String username = null;
		String password = null;

		Properties ps = new Properties();
		ps.load(new FileInputStream("jdbc_config.properties"));
		driverName = ps.getProperty(driverName);
		url = ps.getProperty(url);
		username = ps.getProperty(username);
		password = ps.getProperty(password);

		Class.forName(driverName);
		Connection conn = DriverManager.getConnection(url, username, password);
		String sql = "select * from user where username=?";
		PreparedStatement st = (PreparedStatement) conn.prepareStatement(sql);
		st.setObject(1, "zhangsan");
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			Object username1 = rs.getObject("username");
			Object password1 = rs.getObject("password");
			System.out.println(username1 + "=" + password1);
		}
	}

}
