package com.cg.bean;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="MGR")
public class Manager extends Employee
{
	@Column(name="dept_name",length=20)
	private String deptName;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Manager [deptName=" + deptName + "]";
	}
	
	
}
