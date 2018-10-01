package com.heima.service;

import java.sql.SQLException;

import com.heima.dao.AccountDao;

public class AccountService {
	public void transfer(String fromName,String toName,double money) {
		AccountDao dao = new AccountDao();
		try {
			dao.fromAccount(fromName, money);
			dao.toAccount(toName, money);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
