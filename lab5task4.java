import java.util.Scanner;
public class lab5task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 0;
        int number;

        do {
            number = scanner.nextInt();
            if (number != 0) {
                length++;
            }
        } while (number != 0);

        System.out.println("Length of the sequence: " + length);  
    }
}
