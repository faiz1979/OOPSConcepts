package com.in28minutes.oops.level2.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Faiz Mujawar", "abc");
		student.setEmail("faiz.mujawar@gmail.com");
		System.out.println(student.getEmail());
	}

}
