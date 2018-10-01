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
	
	@Test
	public void testInsert() {
		UserDao dao = new UserDaoImpl();
		dao.insert("obama", "12345");
	}
	
	@Test
	public void testDelete() {
		UserDao dao = new UserDaoImpl();
		dao.delete(1);
	}
	
	@Test
	public void testUpdate() {
		UserDao dao = new UserDaoImpl();
		dao.update(2, "mysql");
	}
}
