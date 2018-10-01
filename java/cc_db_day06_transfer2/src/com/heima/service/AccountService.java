package com.heima.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.heima.dao.AccountDao;
import com.heima.utils.C3P0Utils02;

public class AccountService {
	public void transfer(String fromName, String toName, double money) {
		AccountDao dao = new AccountDao();
		Connection conn = null;
		try {
			conn = C3P0Utils02.getConnection();
			//开启事务
			conn.setAutoCommit(false);
			dao.fromAccount(conn, fromName, money);
			System.out.println(1 / 0);
			dao.toAccount(conn, toName, money);
			//提交事务
			conn.commit();
		} catch (Exception e) {
			System.out.println("转账出错，程序出现回滚");
			try {
				conn.rollback();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
}
