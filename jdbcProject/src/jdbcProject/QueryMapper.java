package jdbcProject;

public interface QueryMapper {
	
	
	public static final String SELECTQRY1= "SELECT * FROM emp112081";
	public static final String SELECTQRY2= "SELECT * FROM emp112081 WHERE emp_id=?";
	public static final String INSERTQRY1 = "INSERT INTO emp112081 VALUES(230,'Ashmita',3000,SYSDATE) ";
	public static final String INSERTQRY2  = "INSERT INTO emp112081(emp_id,emp_name,emp_sal)"+ "VALUES(444,'Amit',65000)";
	public static final String INSERTQRY3  ="INSERT INTO emp112081(emp_id,emp_name,emp_sal)"+"VALUES(?,?,?)";
	public static final String UPDATEQRY1 = "UPDATE emp112081 set emp_name=?,emp_sal=? WHERE emp_id=?";
	public static final String DELETEQRY1 = "DELETE from emp112081 WHERE emp_id=?";
}
