import java.util.Scanner;
public class lab5task7 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        int evenCount = 0;
        int number;
        do {
            number = scanner.nextInt();
            if (number != 0 && number % 2 == 0) {
                evenCount++;
            }
        } while (number != 0);
        System.out.println("Number of even elements: " + evenCount);   
    }
}
