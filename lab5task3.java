import java.util.Scanner;
public class lab5task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the number of integers (N): ");
        int N = scanner.nextInt();
        int zeroCount = 0;
        System.out.println("Enter " + N + " integers:");
        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            if (number == 0) {
                zeroCount++;
            }
        }
        System.out.println("Number of zeros: " + zeroCount); 
    }
}
