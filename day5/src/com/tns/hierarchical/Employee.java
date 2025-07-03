package com.tns.hierarchical;

public class Employee extends Person{
	private Float salary;
	private int Empid;
	private String dept;
	

	public Employee(Float salary, int empid, String dept,String name, String city) {
		super( name, city);
		this.salary = salary;
		Empid = empid;
		this.dept = dept;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String city) {
		super(name, city);
		// TODO Auto-generated constructor stub
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public int getEmpid() {
		return Empid;
	}

	public void setEmpid(int empid) {
		Empid = empid;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", Empid=" + Empid + ", dept=" + dept + ", getName()=" + getName()
				+ ", getCity()=" + getCity() + "]";
	}
	

}
