import java.util.Scanner;
public class lab4task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        // Get dimensions of the first rectangle
        System.out.print("Enter the length of the first rectangle: ");
        double length1 = scanner.nextDouble();
        System.out.print("Enter the width of the first rectangle: ");
        double width1 = scanner.nextDouble();

        // Get dimensions of the second rectangle
        System.out.print("Enter the length of the second rectangle: ");
        double length2 = scanner.nextDouble();
        System.out.print("Enter the width of the second rectangle: ");
        double width2 = scanner.nextDouble();

        // Calculate areas of both rectangles
        double area1 = length1 * width1;
        double area2 = length2 * width2;
        // Compare the areas
        if (area1 > area2) {
            System.out.println("The first rectangle has a greater area.");
        } else if (area1 < area2) {
            System.out.println("The second rectangle has a greater area.");
        } else {
            System.out.println("The areas of both rectangles are the same.");
        }
        scanner.close();
    }
}
