package com.heima.DBCP连接池;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBCPUtils02TestDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//insert();
		query();
	}

	private static void insert() throws SQLException {
		Connection conn = DBCPUtils02.getConnection();
		String sql = "insert into user values(?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setObject(1, "lisi");
		ps.setObject(2, "12");
		int row = ps.executeUpdate();
		System.out.println(row);
		DBCPUtils02.closeAll(conn, ps, null);
	}

	private static void query() throws SQLException {
		Connection conn = DBCPUtils02.getConnection();
		String sql = "select * from user";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getObject("username")+"="+rs.getObject("password"));
		}
		DBCPUtils02.closeAll(conn, ps, rs);
	}
	
}
