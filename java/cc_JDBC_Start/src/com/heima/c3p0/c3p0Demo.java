package com.heima.c3p0;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class c3p0Demo {

	public static void main(String[] args) throws SQLException {
		insert();
		//query();
	}

	private static void query() throws SQLException {
		Connection conn = c3p0Utils.getConnection();
		String sql = "select * from user where username=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setObject(1, "zhangsan");
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			System.out.println(rs.getObject("username"));
		}
		c3p0Utils.closeAll(conn, ps, rs);
	}

	private static void insert() throws SQLException {
		Connection conn = c3p0Utils.getConnection();
		String sql = "insert into user values(?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setObject(1, "wang");
		ps.setObject(2, "zhao");
		int row = ps.executeUpdate();
		System.out.println(row);
		c3p0Utils.closeAll(conn, ps, null);
	}

}
