package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.jws.soap.SOAPBinding.Use;

import org.junit.Test;
import entity.Student;
import entity.Teacher;



public class Dao {
	private String username;
	private String password;
	private String url;
	private Teacher teacher;
	
	public void dao(Student student){
		username="root";
		password="123456789";
		url="jdbc:mysql://localhost:3306/mydatabase";
		String sql="insert into user(username,password) value(?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection= DriverManager.getConnection(url,username,password);
			if(connection!=null){
				PreparedStatement pre=connection.prepareStatement(sql);
				pre.setString(1, teacher.getTname());
				pre.setString(2, teacher.getPassword());
				
				int re = pre.executeUpdate();
				if(re==1)
				System.out.println("插入成功");
				else
					System.out.println("插入失败");
			}
			connection.close();
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
