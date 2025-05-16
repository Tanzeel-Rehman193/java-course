import java.util.Scanner;

public class lab5task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        while (repeat) {
            System.out.print("Enter the pattern number (1-5): ");
            int patternNumber = scanner.nextInt();
            switch (patternNumber) {
                case 1:
                    // Pattern 1
                    System.out.println("Pattern 1:");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    // Pattern 2
                    System.out.println("Pattern 2:");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    // Pattern 3
                    System.out.println("Pattern 3:");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    // Pattern 4
                    System.out.println("Pattern 4:");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= 5 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    // Pattern 5
                    System.out.println("Pattern 5:");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Invalid pattern number.");
                    break;
            }
            System.out.print("Do you want to repeat (y/n)? ");
            String repeatChoice = scanner.next().toLowerCase();
            repeat = (repeatChoice.equals("y"));
        }
    }
}
