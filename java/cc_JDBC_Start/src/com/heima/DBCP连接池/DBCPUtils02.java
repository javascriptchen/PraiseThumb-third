package com.heima.DBCP连接池;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
/**
 * 所有的连接池必须遵循 javax.sql.DataSource接口
 * 
 * 在DBCP连接池中
 * 		实现 javax.sql.DataSource接口的实现类是:
 * 			 BasicDataSource
 * 		使用:
 * 			创建BasicDataSource对象,并且给他设置数据库连接的四大要素即可
 * 			private static BasicDataSource ds = new BasicDataSource();
 * 			//设置数据库连接四大要素
 * 			ds.setDriverClassName(driverName);
 * 			ds.setUrl(url);
 * 			ds.setUsername(username);
 * 			ds.setPassword(password);
 * 		带有配置文件的DBCP的使用
 * 			核心类:BasicDataSourceFactory(工厂)
 * 				 public static DataSource createDataSource(Properties对象);
 * 		
 * @author yingpeng
 *
 */
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;

public class DBCPUtils02 {
	private static DataSource ds = null;
	static {
		try {
			Properties ps = new Properties();
			ps.load(DBCPUtils02.class.getClassLoader().getResourceAsStream("dbcpconfig.properties"));
			ds = BasicDataSourceFactory.createDataSource(ps);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static Connection getConnection() throws SQLException {
		// 返回一个连接对象,不要用DriverManager获取,而是连接池中获取
		return ds.getConnection();
	}

	// 关闭所有资源的统一代码
	public static void closeAll(Connection conn, Statement st, ResultSet rs) {
		// 负责关闭
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
