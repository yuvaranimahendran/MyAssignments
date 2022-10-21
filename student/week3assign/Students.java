package org.student.week3assign;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("Student Id:" +id  );
	}
	

	public void getStudentInfo(int id, String name) {
		System.out.println("Student Id:" +id  );
		System.out.println("Student Name:"  +name);
		
	}
	

	public void getStudentInfo(String email, float phoneNumber) {
		System.out.println("Student email id:"  +email);
		System.out.println("Student Phone Number:" +phoneNumber);		
	}

	public static void main(String[] args) {
		Students stu=new Students();
		stu.getStudentInfo(2345, "Yuvarani");
		stu.getStudentInfo("yuvamahi30@gmail.com", 9876543210F);
		
	}
}
