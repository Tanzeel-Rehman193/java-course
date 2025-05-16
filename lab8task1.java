import java.util.Scanner;

public class lab8task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ratings = new int[40];

        System.out.println("Enter 40 ratings (1-10):");
        for (int i = 0; i < 40; i++) {
            ratings[i] = scanner.nextInt();
            while (ratings[i] < 1 || ratings[i] > 10) {
                System.out.println("Invalid rating. Please enter a number between 1 and 10.");
                ratings[i] = scanner.nextInt();
            }
        }

        // Calculate the average rating
        int sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }
        double average = (double) sum / ratings.length;

        // Count the number of ratings in each category
        int[] count = new int[10];
        for (int rating : ratings) {
            count[rating - 1]++;
        }

        // Display the results
        System.out.println("\nRating Summary:");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ": " + count[i]);
        }
        System.out.println("Average Rating: " + average);
    }
}
