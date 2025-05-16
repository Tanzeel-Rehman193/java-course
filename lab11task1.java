import java.util.Scanner;

public class lab11task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        do {
            System.out.print("Enter the first integer: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Consume the invalid input
            }
            num1 = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Consume the invalid input
            }
            num2 = scanner.nextInt();

            if (num1 != 0 && num2 != 0) {
                int sum = num1 + num2;
                System.out.println("Sum: " + sum);
            } else {
                System.out.println("You have entered an invalid input, type integers only.");
            }
        } while (num1 == 0 || num2 == 0);

        scanner.close();
    }
}
