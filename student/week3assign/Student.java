package org.student.week3assign;

import org.department.week3assign.Department;

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("Student Name: Yuvarani Mahendran");
		}
	public void studentDept()
	{
		System.out.println("Student's Department: ECE");
	}
	public void studentID()
	{
		System.out.println("Student ID:11897");
	}	
	public static void main(String[] args) {
		
		Student student=new Student();
		student.studentName();
		student.studentID();
		student.studentDept();
		student.deptName();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
	}}
