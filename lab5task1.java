import java.util.Scanner;
public class lab5task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer A: ");
        int A = scanner.nextInt();
        System.out.print("Enter integer B: ");
        int B = scanner.nextInt();
        System.out.println("Numbers from A to B:");
        for (int i = A; i <= B; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        if (A < B) {
            System.out.println("Ascending order:");
            for (int i = A; i <= B; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Descending order:");
            for (int i = A; i >= B; i--) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("Enter the number of integers (N): ");
        int N = scanner.nextInt();
        int sum = 0;
        System.out.println("Enter " + N + " integers:");
        for (int i = 0; i < N; i++) {
            sum += scanner.nextInt();
        }
        System.out.println("Sum of " + N + " numbers: " + sum);
        System.out.print("Enter integer N: ");
        N = scanner.nextInt();
        sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += Math.pow(i, 3);
        }
        System.out.println("Sum of Cubes: " + sum);
    }
}
