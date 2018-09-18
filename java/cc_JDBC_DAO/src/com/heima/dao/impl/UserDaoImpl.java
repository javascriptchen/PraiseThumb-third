package com.heima.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.heima.dao.UserDao;
import com.heima.util.JDBCUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public void findAll() {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtil.getConn();
			st = conn.createStatement();
			String sql = "select * from t_user";
			rs = st.executeQuery(sql);
			while (rs.next()) {
				String userName = rs.getString("username");
				String password = rs.getString("password");
				System.out.println(userName + "=" + password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.release(conn, st, rs);
		}
	}

	@Override
	public void login(String username, String password) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtil.getConn();
			st = conn.createStatement();
			String sql = "select * from t_user where username=? and password=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("登录成功");
			}else {
				System.out.println("登录失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.release(conn, st, rs);
		}
	}

}
