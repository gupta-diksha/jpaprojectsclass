package jdbcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TestEmpDel {
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		PreparedStatement pst = null;
		ResultSet rs= null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid= "system";
		String pwd="corp123";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id to be deleted:");
		int eid = sc.nextInt();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,uid,pwd);
			st = (Statement) con.createStatement();
			
			pst=con.prepareStatement(QueryMapper.DELETEQRY1);
			pst.setInt(1, eid);
			int data = pst.executeUpdate();
			System.out.println("Data deleted...");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
}
	}
