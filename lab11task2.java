import java.util.InputMismatchException;
import java.util.Scanner;

public class lab11task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Enter 10 integer values:");

        for (int i = 0; i < 10; i++) {
            while (true) {
                try {
                    System.out.print("Enter value " + (i + 1) + ": ");
                    array[i] = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next(); // Consume the invalid input
                }
            }
        }

        System.out.print("Enter the index to display: ");
        int index;
        while (true) {
            try {
                index = scanner.nextInt();
                if (index >= 0 && index < 10) {
                    break;
                } else {
                    System.out.println("Invalid index. Please enter an index between 0 and 9.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer index.");
                scanner.next(); // Consume the invalid input
            }
        }

        try {
            int value = array[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        }

        scanner.close();
    }
}
