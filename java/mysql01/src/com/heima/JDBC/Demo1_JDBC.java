package com.heima.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1_JDBC {

	public static void main(String[] args) {

		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "root");
			Statement st = conn.createStatement();
			String sql = "select * from t_stu";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				System.out.println("id = " + id + "---name=" + name + "---age=" + age);
			}
			st.close();
			conn.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
