import java.util.Scanner;

public class lab5task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maximum = Integer.MIN_VALUE;
        int maximumIndex = -1;
        int index = 0;
        int number;
        do {
            number = scanner.nextInt();
            if (number != 0 && number >= maximum) {
                maximum = number;
                maximumIndex = index;
            }
            index++;
        } while (number != 0);

        System.out.println("Index of the maximum: " + maximumIndex);
    }
}
