import java.util.Scanner;
public class lab3task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Class A tickets sold: ");
        int classATickets = scanner.nextInt();
        System.out.print("Enter the number of Class B tickets sold: ");
        int classBTickets = scanner.nextInt();
        System.out.print("Enter the number of Class C tickets sold: ");
        int classCTickets = scanner.nextInt();
        System.out.print("Enter the number of Class D tickets sold: ");
        int classDTickets = scanner.nextInt();
        int classAIncome = classATickets * 20;
        int classBIncome = classBTickets * 15;
        int classCIncome = classCTickets * 10;
        int classDIncome = classDTickets * 5;
        int totalIncome = classAIncome + classBIncome + classCIncome + classDIncome;
        // Display the results
        System.out.println("Class A Income: $" + classAIncome);
        System.out.println("Class B Income: $" + classBIncome);
        System.out.println("Class C Income: $" + classCIncome);
        System.out.println("Class D Income: $" + classDIncome);
        System.out.println("Total Income: $" + totalIncome);
    }
}
