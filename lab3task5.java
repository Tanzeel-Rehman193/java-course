import java.util.Scanner;
public class lab3task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total amount of milk produced in the morning (in liters): ");
        double totalMilkProduced = scanner.nextDouble();

        int numCartonsNeeded = (int) Math.ceil(totalMilkProduced / 3.78);

        double costOfMilk = totalMilkProduced * 0.38;

        double profit = numCartonsNeeded * 0.27;
        // Output the results
        System.out.println("Number of milk cartons needed: " + numCartonsNeeded);
        System.out.println("Cost of producing milk: $" + costOfMilk);
        System.out.println("Profit for producing milk: $" + profit);
    }
}