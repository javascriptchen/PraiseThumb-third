package com.heima.demo1_原生JDBC完成转账支持事务;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCAccountDemo {

	public static void main(String[] args) {
		// 2.获取连接
		Connection conn = null;
		// 3.获取sql执行对象
		Statement st = null;
		// 4.执行sql
		int row1 = 0;
		int row2 = 0;
		try {
			// 1.注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day06", "root", "root");
			// 开启事务
			conn.setAutoCommit(false);
			st = conn.createStatement();
			row1 = st.executeUpdate("update account set money=money-1000 where name='jack'");
			System.out.println(1 / 0);
			row2 = st.executeUpdate("update account set money=money+1000 where name='tom'");
			conn.commit();
			if (row1 > 0 && row2 > 0) {
				System.out.println("转账成功");
			}
		} catch (Exception e) {
			System.out.println("转账出现问题，回滚事务");
			try {
				conn.rollback();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
		} finally {
			// 释放资源
			try {
				st.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}

}
