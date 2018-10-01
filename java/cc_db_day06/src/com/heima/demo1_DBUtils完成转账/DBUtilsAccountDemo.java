package com.heima.demo1_DBUtils完成转账;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

public class DBUtilsAccountDemo {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			// 1.创建QueryRunner对象
			QueryRunner qr = new QueryRunner();
			conn = C3P0Utils02.getConnection();
			// 开启事务
			conn.setAutoCommit(false);
			// 2.执行转账功能
			// 2.1减钱
			int rows1 = qr.update(conn, "update account set money=money-? where name=?", new Object[] { 1000, "jack" });
			// 模拟异常
			System.out.println(1 / 0);
			// 2.2加钱
			int rows2 = qr.update(conn, "update account set money=money+? where name=?", new Object[] { 1000, "tom" });
			conn.commit();
			if (rows1 > 0 && rows2 > 0) {
				System.out.println("转账成功");
			}
		} catch (Exception e) {
			System.out.println("转账出现问题，程序回滚");
			try {
				conn.rollback();
			} catch (SQLException e1) {

				e1.printStackTrace();
			}
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

}
