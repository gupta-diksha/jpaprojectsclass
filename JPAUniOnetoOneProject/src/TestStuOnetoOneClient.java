import java.util.List;

import javax.persistence.EntityManager;

import com.cg.bean.*;
import com.cg.dao.StudentDaoImpl;
import com.cg.util.JPAUtil;


public class TestStuOnetoOneClient 
{
	static EntityManager em=null;
	static StudentDaoImpl stuDao=null;
	public static void main(String args[])
	{
		em=JPAUtil.getEntityManager();
		stuDao= new StudentDaoImpl();
		Address address1= new Address();
		address1.setCity("Pune");
		address1.setState("Maharashtra");
		address1.setStreet("Shivaji Chowk");
		address1.setZipCode("600085");
		
		Address address2= new Address();
		address2.setCity("Mumbai");
		address2.setState("Maharashtra");
		address2.setStreet("Borivali");
		address2.setZipCode("789455");
		
		Student st1 = new Student();
		st1.setStuName("Amit");
		st1.setStuAdd(address1);
		
		Student st2 = new Student();
		st2.setStuName("Diya");
		st2.setStuAdd(address2);
		
		stuDao.addStudent(st1);
		stuDao.addStudent(st2);
		System.out.println("Both students are added!!");
		
		System.out.println("***********************");
		List stList = stuDao.getAllStudents();
		System.out.println(stList);
		
	}

}
