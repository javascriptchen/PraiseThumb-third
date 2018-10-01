package com.heima.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.heima.utils.C3P0Utils02;

/**
 * 转账Dao，主要是用来操作数据库
 * 
 * 我们案例中只涉及到修改操作
 * 
 * @author chenchen
 *
 */
public class AccountDao {
	// 1.转账出去
	// jack 转出去 1000
	public void fromAccount(Connection conn, String name ,double money) throws SQLException {
		QueryRunner qr = new QueryRunner();
		qr.update("update account set money=money-? where name=?", money,name);
	}
	
	public void toAccount(Connection conn, String name ,double money) throws SQLException {
		QueryRunner qr = new QueryRunner();
		qr.update("update account set money=money+? where name=?", money,name);
	}
}
