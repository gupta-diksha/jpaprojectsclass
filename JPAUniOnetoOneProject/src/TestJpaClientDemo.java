import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cg.bean.Student;
import com.cg.dao.StudentDaoImpl;

public class TestJpaClientDemo 
{
	public static void main(String [] args)
	{
		StudentDaoImpl stoDao= new StudentDaoImpl();
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Enter name:");
		String nm=sc.next();*/
		
		Student st = new Student();//entity enters in a born state
		//st.setStuName(nm);
		//Student stu = stoDao.addStudent(st);
		//System.out.println("Data inserted in the table"+stu);
		System.out.println("retrieve student based on roll:");
		Student student=stoDao.getStuByRollNo(2);
		System.out.println(student);
		
		System.out.println("****Fetch all data****");
		List<Student> stList=stoDao.getAllStudents();
		Iterator<Student> it= stList.iterator();
		System.out.println("RollNo \t\t\t Studentname");
		 System.out.println("*************************");
		 while(it.hasNext())
		 {
			 Student tempStu=it.next();
			 System.out.println(tempStu.getRollNo()+"\t\t\t"+tempStu.getStuName());
		 }
		 
		 
		 /*System.out.println("Enter the roll number to be deleted:");
		 int delroll= sc.nextInt();
		 System.out.println("Deleted roll:"+stoDao.deleteStudent(delroll));*/
		 
		 System.out.println("******Update name*******");
		 Student st3= stoDao.updateStudentName(3, "Ganpat");
		 System.out.println("Updates :"+st3);
		 
		
	}
}
