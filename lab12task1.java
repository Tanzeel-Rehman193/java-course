import java.util.Scanner;

public class lab12task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxMarks = 0;
        String maxMarksStudent = "";

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

            if (marks > maxMarks) {
                maxMarks = marks;
                maxMarksStudent = name;
            }
        }

        if (!maxMarksStudent.isEmpty()) {
            System.out.println("Student with maximum marks: " + maxMarksStudent);
        } else {
            System.out.println("No students were entered.");
        }

        scanner.close();
    }
}