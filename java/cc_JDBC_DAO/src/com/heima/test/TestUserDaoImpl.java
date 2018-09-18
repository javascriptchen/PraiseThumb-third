package com.heima.test;

import org.junit.Test;

import com.heima.dao.UserDao;
import com.heima.dao.impl.UserDaoImpl;

public class TestUserDaoImpl {
	@Test
	public void findAll() {
		UserDao dao = new UserDaoImpl();
		dao.findAll();
	}
	
	@Test
	public void testLogin() {
		UserDao dao = new UserDaoImpl();
		dao.login("admin","10087' or '1=1");
	}
}
