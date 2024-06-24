package com.in28minutes.oops.level2.inheritance;

public class EmployeeRunner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Employer employer = new Employer();
		employer.setCompanyName("Silicon Stack");
		System.out.println(employer.getCompanyName());
		
		Employee employee = new Employee("Faiz", "Mujawar", 42);
		employee.setAddress("Tingrenagar");
		System.out.println(employee.getAddress()); */
		
		Employee employee = new Employee("Faiz Mujawar", "QA Analyst");
		System.out.println(employee);
		
		employee.setName("Faiz Mujawar");
		employee.setEmail("faiz.mujawar@gmail.com");
		employee.setPhoneNumber("+91-9823402333");
		
		employee.setTitle("QA Analyst");
		employee.setEmployer("Silicon Stack");
		employee.setEmployeeGrade(7);
		
		
		
		System.out.println(employee);
	}
	
	
}
