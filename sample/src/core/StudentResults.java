package core;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentResults {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(101,"heena",  90, 50,70 ));
		studentList.add(new Student(102, "mina",  50, 60, 80));
		
		
	}
	public void acceptStudentData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students:");
		int n = sc.nextInt();
		for(int i =0; i<n; i++) {
			System.out.println("enter dtails of student");
			int regNo = sc.nextInt();
			String name = sc.nextLine();
			int sub1 = sc.nextInt();
			int sub2 = sc.nextInt();
			int sub3 = sc.nextInt();
			Student s = new Student(regNo, name, sub1, sub2 , sub3);
			studentList.add(s);
		}
	}

}	
