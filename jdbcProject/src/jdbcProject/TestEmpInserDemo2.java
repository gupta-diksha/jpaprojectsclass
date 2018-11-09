package jdbcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestEmpInserDemo2 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		PreparedStatement pst = null;
		ResultSet rs= null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid= "system";
		String pwd="corp123";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Emp id:");
		int eid = sc.nextInt();
		System.out.println("enter Emp name:");
		String empname = sc.next();
		System.out.println("enter Emp salary:");
		Float esal = sc.nextFloat();
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url,uid,pwd);
		con.setAutoCommit(false);
		pst=con.prepareStatement(QueryMapper.INSERTQRY3);
		pst.setInt(1, eid);
		pst.setString(2, empname);
		pst.setFloat(3, esal);
		int data = pst.executeUpdate();
		con.commit();
		System.out.println("Data is inserted!!");
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
		}
	}

}
