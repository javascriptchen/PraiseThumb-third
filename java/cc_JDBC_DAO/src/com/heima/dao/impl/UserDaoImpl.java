package com.heima.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.heima.dao.UserDao;
import com.heima.util.JDBCUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public ArrayList findAll() {
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
				//System.out.println(userName + "=" + password);
				
			}
			return null;
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
			} else {
				System.out.println("登录失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.release(conn, st, rs);
		}
	}

	@Override
	public void insert(String username, String password) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JDBCUtil.getConn();
			String sql = "insert into t_user values(null,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			int result = ps.executeUpdate();
			if (result > 0) {
				System.out.println("添加成功");
			} else {
				System.out.println("添加失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.release(conn, ps);
		}
	}

	@Override
	public void delete(int id) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JDBCUtil.getConn();
			String sql = "delete from t_user where id=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			int result = ps.executeUpdate();
			if (result > 0) {
				System.out.println("删除成功");
			} else {
				System.out.println("删除失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.release(conn, ps);
		}
	}

	@Override
	public void update(int id, String name) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JDBCUtil.getConn();
			String sql = "update t_user set username=? where id=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, id);
			int result = ps.executeUpdate();
			if (result > 0) {
				System.out.println("更新成功");
			} else {
				System.out.println("更新失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.release(conn, ps);
		}
	}

}
