package com.heima.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.heima.jdbc.util.JDBCUtils;

public class SQLtest {

	public static void main(String[] args) {
		//insert();
		//delete();
		update();
	}

	private static void update() {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = JDBCUtils.getConnection();
			String sql = "update user set password=? where username=?";
			st = conn.prepareStatement(sql);
			st.setObject(1, "asfb123");
			st.setObject(2, "zhangsan");
			int num = st.executeUpdate();
			if(num>0) {
				System.out.println("success");
			}else {
				System.out.println("err");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			JDBCUtils.closeAll(conn, st, null);
		}
	}

	private static void delete() {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = JDBCUtils.getConnection();
			String sql = "delete from user where username = ?";
			st = conn.prepareStatement(sql);
			st.setObject(1, "lisi");
			int num = st.executeUpdate();
			if(num>0) {
				System.out.println("success");
			}else {
				System.out.println("err");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			JDBCUtils.closeAll(conn, st, null);
		}
	}

	private static void insert() {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = JDBCUtils.getConnection();
			String sql = "insert into user values(?,?)";
			st = conn.prepareStatement(sql);
			st.setObject(1, "lisi");
			st.setObject(2, "12345");
			int num = st.executeUpdate();
			if(num>0) {
				System.out.println("success");
			}else {
				System.out.println("err");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			JDBCUtils.closeAll(conn, st, null);
		}
	}

}
