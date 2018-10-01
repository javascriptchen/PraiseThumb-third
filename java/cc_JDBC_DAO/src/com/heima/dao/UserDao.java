package com.heima.dao;

import java.util.ArrayList;

public interface UserDao {
	public ArrayList findAll();

	void login(String username, String password);

	void insert(String username, String password);

	void delete(int id);

	void update(int id, String name);
}
