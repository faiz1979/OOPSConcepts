package com.in28minutes.oops.level2.inheritance;

public class Employee extends Person {
	
	private String title;
	private String employer; 
	private int employeeGrade;
	private int salary;
	
	public Employee(String name, String title)
	{
		super(name);
		this.title = title;
		System.out.println("Employee Constructor from sub class - Employee");
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public int getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(int employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	public String toString()
	{
		return super.toString()  + " " + title + " " + employer + " " + employeeGrade;
	}
	

}
