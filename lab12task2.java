import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int marks;

    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

public class lab12task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.print("Enter roll number (0 to stop): ");
            int rollNo = scanner.nextInt();

            if (rollNo == 0) {
                break;
            }

            System.out.print("Enter name: ");
            String name = scanner.next();

            System.out.print("Enter marks: ");
            int marks = scanner.nextInt();

            students.add(new Student(rollNo, name, marks));
        }

        // Sort students by marks in descending order
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.marks - s1.marks;
            }
        });

        // Display students in descending order of marks
        for (Student student : students) {
            System.out.println("Roll No: " + student.rollNo + ", Name: " + student.name + ", Marks: " + student.marks);
        }

        scanner.close();
    }
}