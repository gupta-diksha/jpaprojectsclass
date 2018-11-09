package jdbcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TestEmpUpdate {
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		PreparedStatement pst = null;
		ResultSet rs= null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid= "system";
		String pwd="corp123";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee id:");
		int eid = sc.nextInt();
		System.out.println("Enter the name and salary to be updated:");
		String eNewName= sc.next();
		Float eNewSal = sc.nextFloat();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,uid,pwd);
			pst=con.prepareStatement(QueryMapper.UPDATEQRY1);
				
			pst.setInt(3, eid);
			
			pst.setString(1, eNewName);
			pst.setFloat(2, eNewSal);
			int data = pst.executeUpdate();
			System.out.println("Data inserted...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
}
	}
