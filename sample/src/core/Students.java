package core;

import java.util.ArrayList;
import java.util.List;

public record Students(int regno, String stdname) {
    public static void main(String[] args) {
        List<Students> studentList = new ArrayList<>();

        studentList.add(new Students(20, "A"));
        studentList.add(new Students(22, "B"));
        studentList.add(new Students(19, "A"));

        for (Students student : studentList) {
            System.out.println(student);
        }
    }
}

        // Print the st
	/*}
	public int regno() {
		return regno;
	}
public String stdname() {
	return stdname;
}
}
import java.util.ArrayList;
import java.util.List;

// Define the Student record
record Student(String name, int age, String grade) {}

public class StudentListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Student records
        List<Student> students = new ArrayList<>();

        // Add three students to the list
        students.add(new Student("Alice", 20, "A"));
        students.add(new Student("Bob", 22, "B"));
        students.add(new Student("Charlie", 19, "A+"));

        // Print the student list
        for (Student student : students) {
            System.out.println(student);
        }
    }
}*/