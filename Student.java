package week3.day1assignmentstudent;

import week3.day1assignmentdept.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Print the student name");

	}

	public void studentDept() {
		System.out.println("Print the student dept");

	}

	public void studentId() {
		System.out.println("Print the student id");

	}

	public static void main(String[] args) {

		Student stu = new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
	}

}
