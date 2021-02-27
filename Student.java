package org.Student;

import org.department.Department;

public class Student extends Department {
	public void studentName(String name)
	{
		System.out.println("Student Name printed: " +name);
	}

	public void studentDept(int dept)
	{
		System.out.println("Student Dept printed: " +dept);
	}
	
	public void studentId(int id)
	{
		System.out.println("Student ID printed: " +id);
	}
	
	public static void main(String args[])
	{
		Student obj = new Student();
		obj.studentName("Nimmy");
		obj.studentDept(05);
		obj.studentId(999);
		obj.deptName("Computer Science");
		int code = obj.collegeCode(25);
		System.out.println("College code: " +code);
		obj.collegeName("ABC");
		obj.collegeRank(1);
		
		
	}
}
