import java.util.Scanner;
public class lab5task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int increasingCount = 0;
        int previousNumber = Integer.MIN_VALUE;
        int number;
        do {
            number = scanner.nextInt();
            if (number != 0 && number > previousNumber) {
                increasingCount++;
            }
            previousNumber = number;
        } while (number != 0);
        System.out.println("Number of elements greater than their neighbors: " + increasingCount);
    }
}
