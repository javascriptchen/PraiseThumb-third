package com.heima.demo1_原生JDBC完成转账;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCAccountDemo {

	public static void main(String[] args) throws Exception {
		//1.注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//2.获取连接
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day06", "root", "root");
		//3.获取sql执行对象
		Statement st= conn.createStatement();
		//4.执行sql
		int row1 = st.executeUpdate("update account set money=money-1000 where name='jack'");
		System.out.println(1/0);
		int row2 = st.executeUpdate("update account set money=money+1000 where name='tom'");
		if(row1>0&&row2>0) {
			System.out.println("转账成功");
		}
		//释放资源
		st.close();
		conn.close();
	}

}
