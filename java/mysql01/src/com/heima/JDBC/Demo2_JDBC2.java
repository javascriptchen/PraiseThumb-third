package com.heima.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.heima.util.JDBCUtil;

public class Demo2_JDBC2 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtil.getConn();
			st = conn.createStatement();
			String sql = "select * from t_stu";
			rs = st.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				System.out.println("id = " + id + "---name=" + name + "---age=" + age);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.release(conn, st, rs);
		}
	}
}
