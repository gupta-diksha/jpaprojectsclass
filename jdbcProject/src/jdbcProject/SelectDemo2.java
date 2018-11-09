package jdbcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class SelectDemo2 {

	public static void main(String[] args) {
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
		st = (Statement) con.createStatement();
		rs= st.executeQuery(QueryMapper.SELECTQRY1);
		ResultSetMetaData rsmd = rs.getMetaData();
		
		int columnCount = rsmd.getColumnCount();
		System.out.println("Number of columns:"+columnCount);
		for(int i=1;i<=columnCount;i++)
		{
			System.out.println("Column Name:"+rsmd.getColumnName(i)+"\tcolumn type:"+rsmd.getColumnTypeName(i));
		}
		//System.out.println("Table name:"+rsmd.getTableName(1));
		
		
		/*while(rs.next())
		{
		
		System.out.println(rs.getInt("emp_id")+"\t\t"+rs.getString("emp_name")+"\t\t"+rs.getFloat("emp_sal")+"\t\t"+rs.getDate("emp_dob"));
		}*/
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
