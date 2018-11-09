package jdbcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestEmpInserDemo {
	
	public static void main(String[] args){
		Connection con = null;
		Statement st = null;
		PreparedStatement pst = null;
		ResultSet rs= null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid= "system";
		String pwd="corp123";
		
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url,uid,pwd);
		st =  con.createStatement();
		int data = st.executeUpdate(QueryMapper.INSERTQRY1);
		System.out.println("Data is inserted!!");
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	

}
