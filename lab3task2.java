import java.util.Scanner;
public class lab3task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students (N): ");
        int N = scanner.nextInt(); 
        System.out.print("Enter the number of apples (K): ");
        int K = scanner.nextInt();
        int applesPerStudent = K / N;
        int remainingApples = K % N;
        System.out.println("Each student will get " + applesPerStudent + " apples.");
        System.out.println("There will be " + remainingApples + " apples remaining in the basket.");
    }
}
