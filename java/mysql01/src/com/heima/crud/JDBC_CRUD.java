package com.heima.crud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.heima.util.JDBCUtil;

public class JDBC_CRUD {

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
				String name = rs.getString("name");
				int age = rs.getInt("age");
				System.out.println("name:" + name + " age:" + age);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			JDBCUtil.release(conn, st, rs);
		}

	}

}
