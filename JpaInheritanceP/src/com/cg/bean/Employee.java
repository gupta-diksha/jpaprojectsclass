package com.cg.bean;

import javax.persistence.*;


@Entity
@Table(name="emp_store")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="emp_type")
@DiscriminatorValue(value="EMP")
public class Employee 
{
	@Id
	@Column(name="emp_id",length=6)
	private int empId;
	
	@Column(name="emp_name",length=20)
	private String empName;
	
	@Column(name="emp_sal",length=6)
	private float empSal;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empSal=" + empSal + "]";
	}

	

	

}
