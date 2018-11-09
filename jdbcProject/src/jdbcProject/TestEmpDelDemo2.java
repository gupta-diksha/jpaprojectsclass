package jdbcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TestEmpDelDemo2 {


	public static void main(String[] args)
	{
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
		int flag=0;
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,uid,pwd);
			st = (Statement) con.createStatement();
			rs= st.executeQuery(QueryMapper.SELECTQRY1);

			pst=con.prepareStatement(QueryMapper.DELETEQRY1);
			pst.setInt(1, eid);
			flag=1;
			int data = pst.executeUpdate();
			if(data>0)
			{

				System.out.println("Data deleted!!");
				st = (Statement) con.createStatement();
				rs= st.executeQuery(QueryMapper.SELECTQRY1);
				System.out.println("EMPID\t\tEMPNAME\t\tEMPSALARY\t\tEMPDOB");
				while(rs.next())
				{

					System.out.println(rs.getInt("emp_id")+"\t\t"+rs.getString("emp_name")+"\t\t"+rs.getFloat("emp_sal")+"\t\t"+rs.getDate("emp_dob"));
				}

			}
			else
				System.out.println("Record not found");


		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
