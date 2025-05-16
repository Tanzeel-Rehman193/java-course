import java.util.Scanner;
public class lab4task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of pennies: ");
        int pennies = scanner.nextInt();
        System.out.print("Enter the number of nickels: ");
        int nickels = scanner.nextInt();
        System.out.print("Enter the number of dimes: ");
        int dimes = scanner.nextInt();
        System.out.print("Enter the number of quarters: ");
        int quarters = scanner.nextInt();  
        double totalValue = (pennies * 0.01) + (nickels * 0.05) + (dimes * 0.10) + (quarters * 0.25);
        if (totalValue == 1.0) {
            System.out.println("Congratulations! You've won the change-counting game.");
        } else if (totalValue > 1.0) {
            System.out.println("You entered more than one dollar.");
        } else {
            System.out.println("You entered less than one dollar.");
        }
    }
}
