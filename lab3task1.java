import java.util.Scanner;
public class lab3task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount as a decimal number: ");
        double amount = scanner.nextDouble();
        int cents = (int) (amount * 100);
        int dollars = cents / 100;
        cents %= 100;
        int quarters = cents / 25;
        cents %= 25;
        int dimes = cents / 10;
        cents %= 10;
        int nickels = cents/ 5;
        cents %= 5;
        int pennies = cents;
        System.out.println("Dollars:" + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies:" + pennies);

    }
}
