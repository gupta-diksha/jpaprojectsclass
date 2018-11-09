package com.cg.bean;

import javax.persistence.*;

@Entity
@Table(name="Students")
public class Student 
{	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="roll_no",length=10)
	private int rollNo;
	
	@Column(name="stu_name",length=25)
	private String stuName;
	
	@Transient
	private int stuMarks;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="add_id")
	private Address stuAdd;
	
	
	public Address getStuAdd() {
		return stuAdd;
	}
	public void setStuAdd(Address stuAdd) {
		this.stuAdd = stuAdd;
	}
	
	public int getRollNo()
	{
		return rollNo;
	}
	public void setRollNo(int rollNo) 
	{
		this.rollNo = rollNo;
	}
	public String getStuName()
	{
		return stuName;
	}
	public void setStuName(String stuName)
	{
		this.stuName = stuName;
	}
	public int getStuMarks()
	{
		return stuMarks;
	}
	public void setStuMarks(int stuMarks)
	{
		this.stuMarks = stuMarks;
	}
	@Override
	public String toString() 
	{
		return "Student [rollNo=" + rollNo + ", stuName=" + stuName
				+ ", stuMarks=" + stuMarks + ", stuAdd=" + stuAdd + "]";
	}
	public Student(int rollNo, String stuName, int stuMarks, Address stuAdd) 
	{
		super();
		this.rollNo = rollNo;
		this.stuName = stuName;
		this.stuMarks = stuMarks;
		this.stuAdd = stuAdd;
	}
	public Student() 
	{
		super();
	}
	

}
