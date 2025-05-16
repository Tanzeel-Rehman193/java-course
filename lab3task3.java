import java.util.Scanner;
public class lab3task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students in class A: ");
        int a = scanner.nextInt();
        System.out.print("Enter the number of students in class B: ");
        int b = scanner.nextInt();
        System.out.print("Enter the number of students in class C: ");
        int c = scanner.nextInt();
        int totalStudents = a + b + c;
        int desksNeeded = (totalStudents + 1) / 2;
        System.out.println("The smallest possible number of desks needed is " + desksNeeded);
    }
}
