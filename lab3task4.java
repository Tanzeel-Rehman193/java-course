import java.util.Scanner;
public class lab3task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of minutes passed since midnight: ");
        int N = scanner.nextInt();
        int hours = N / 60;
        int minutes = N % 60;
        System.out.println(hours + " " + minutes);
    }
}
