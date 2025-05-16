import java.util.Scanner;
public class lab4task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for month, day, and year
        System.out.print("Enter the month (in numeric form): ");
        int month = scanner.nextInt();
        System.out.print("Enter the day: ");
        int day = scanner.nextInt();
        System.out.print("Enter the two-digit year: ");
        int year = scanner.nextInt();  


        // Check if month times day equals year
        if (month * day == year) {
            System.out.println("The date " + month + "/" + day + "/" + year + " is magic!");
        } else {
            System.out.println("The date " + month + "/" + day + "/" + year + " is not magic.");  

        }
        scanner.close();
    }
}
