package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class DB {
	private String url;
	private String username;
	private String password;
	private ResultSet rs=null;
	private Statement   st=null;
	private Connection   connection=null;



	/**
	 * 
	 */
	public DB() {
		url="jdbc:mysql://localhost:3306/mydatabase";
		username="root";
		password="123456789";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		 connection=DriverManager.getConnection(url,username,password);
			if(connection!=null){
				System.out.println("连接成功");
			}else {
				System.out.println("连接失败");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	public ResultSet query(String sql){
		try {
			System.out.println(111);
			st=connection.createStatement();
			rs=st.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			rs=null;
		}
		return rs;
	}

}
