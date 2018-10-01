package com.heima.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.heima.jdbc.util.JDBCUtils;

public class jdbctest {
	public static void main(String[] args) {
		 query();
		// insert();
		// delete();
		//update();

	}

	private static void update() {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			String sql = "update t_stu set name='doubi' where name=?";
			st = conn.prepareStatement(sql);
			st.setObject(1, "zhangsan");
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			JDBCUtils.closeAll(conn, st, rs);
		}
	}

	private static void delete() {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			st = conn.createStatement();
			String sql = "delete from t_stu where name='chenchen'";
			int num = st.executeUpdate(sql);
			if (num > 0) {
				System.out.println("删除成功");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			JDBCUtils.closeAll(conn, st, rs);
		}
	}

	private static void insert() {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			st = conn.createStatement();
			String sql = "insert into t_stu values(null,'chenchen',18,100)";
			while (true) {
				int num = st.executeUpdate(sql);
				if (num > 0) {
					System.out.println("插入成功");
				}
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			JDBCUtils.closeAll(conn, st, rs);
		}
	}

	private static void query() {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			st = conn.createStatement();
			String sql = "select * from t_stu";
			rs = st.executeQuery(sql);
			while (rs.next()) {
				Object name = rs.getObject("name");
				Object age = rs.getObject("age");
				System.out.println(name + "..." + age);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			JDBCUtils.closeAll(conn, st, rs);
		}
	}
}
