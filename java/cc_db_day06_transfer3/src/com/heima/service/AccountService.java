package com.heima.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.heima.dao.AccountDao;
import com.heima.utils.C3P0Utils02;
import com.heima.utils.ConnectionManager;

public class AccountService {
	public void transfer(String fromName, String toName, double money) {
		AccountDao dao = new AccountDao();
		Connection conn = null;
		try {
			// 开启事务
			ConnectionManager.start();
			dao.fromAccount(fromName, money);
			System.out.println(1 / 0);
			dao.toAccount(toName, money);
			// 提交事务
			ConnectionManager.commit();
		} catch (Exception e) {
			System.out.println("转账出错，程序出现回滚");
			try {
				ConnectionManager.rollback();
			} catch (SQLException e1) {

				e1.printStackTrace();
			}
		} finally {
			try {
				ConnectionManager.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}
}
