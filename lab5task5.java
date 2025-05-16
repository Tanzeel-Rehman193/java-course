import java.util.Scanner;
public class lab5task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maximum = Integer.MIN_VALUE;
        int number;
        do {
            number = scanner.nextInt();
            if (number != 0 && number > maximum) {
                maximum = number;
            }
        } while (number != 0);
        System.out.println("Maximum of the sequence: " + maximum);
    }
}
