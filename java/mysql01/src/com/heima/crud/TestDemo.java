package com.heima.crud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.heima.util.JDBCUtil;

public class TestDemo {
	@Test
	public void testQuery() {

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
@Test
	public void testInsert() {
		Connection conn = null;
		Statement st = null;

		try {
			conn = JDBCUtil.getConn();
			st = conn.createStatement();
			
			String sql = "insert into t_stu(name,age) values('obama',49)";
			int result = st.executeUpdate(sql);
			if(result>0) {
				System.out.println("插入成功");
			}else {
				System.out.println("插入成功");				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.release(conn, st);
		}

	}

@Test
public void testDelete() {
	Connection conn = null;
	Statement st = null;

	try {
		conn = JDBCUtil.getConn();
		st = conn.createStatement();
		
		String sql = "delete from t_stu where name='obama'";
		int result = st.executeUpdate(sql);
		if(result>0) {
			System.out.println("删除成功");
		}else {
			System.out.println("删除成功");				
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		JDBCUtil.release(conn, st);
	}

}

@Test
public void testUpdate() {
	Connection conn = null;
	Statement st = null;

	try {
		conn = JDBCUtil.getConn();
		st = conn.createStatement();
		
		String sql = "update t_stu set name='zhangsan' where age=25";
		int result = st.executeUpdate(sql);
		if(result>0) {
			System.out.println("更新成功");
		}else {
			System.out.println("更新成功");				
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		JDBCUtil.release(conn, st);
	}

}
}
