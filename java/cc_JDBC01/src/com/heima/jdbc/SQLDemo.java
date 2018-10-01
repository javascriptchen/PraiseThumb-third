package com.heima.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.heima.jdbc.util.JDBCUtils;

public class SQLDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("用户名");
		String username = sc.nextLine();
		System.out.println("密码");
		String password = sc.nextLine();
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtils.getConnection();
			String sql = "select * from user where username=? and password=?";
			st = conn.prepareStatement(sql);
			st.setObject(1, username);
			st.setObject(2, password);
			rs = st.executeQuery();
			if(rs.next()) {
				System.out.println("success");
			}else {
				System.out.println("err");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			JDBCUtils.closeAll(conn, st, rs);
		}
	}

}
