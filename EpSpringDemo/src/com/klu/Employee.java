package com.klu;

public class Employee {
	private int id;
	private String name;
	private String desg;
	private int salary;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desg=" + desg + ", salary=" + salary + "]";
	}
	
}
