package org.student;

import org.department.Department;

public class Student extends Department {

	
	public void studentName() {
		System.out.println("Student Name is Ram");
	}
	public void studentDept() {
		System.out.println("Student department is: Computer Science");
	}
	public void studentID()
	{
		System.out.println("Student ID is 201");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student student = new Student();
student.collegeName();
student.collegeCode();
student.collegeRank();
student.deptName();
student.studentName();
student.studentID();
student.studentDept();
	}

}
