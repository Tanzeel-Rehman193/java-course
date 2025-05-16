import java.util.Scanner;

public class lab10task2 {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] array = new int[3][4];

        System.out.println("Enter 12 integers for a 3x4 array:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        // Find row with maximum prime numbers
        int maxRowPrimes = Integer.MIN_VALUE;
        int maxRowIndex = -1;

        for (int i = 0; i < 3; i++) {
            int rowPrimes = 0;
            for (int j = 0; j < 4; j++) {
                if (isPrime(array[i][j])) {
                    rowPrimes++;
                }
            }
            if (rowPrimes > maxRowPrimes) {
                maxRowPrimes = rowPrimes;
                maxRowIndex = i;
            }
        }

        // Find column with maximum prime numbers
        int maxColPrimes = Integer.MIN_VALUE;
        int maxColIndex = -1;

        for (int j = 0; j < 4; j++) {
            int colPrimes = 0;
            for (int i = 0; i < 3; i++) {
                if (isPrime(array[i][j])) {
                    colPrimes++;
                }
            }
            if (colPrimes > maxColPrimes) {
                maxColPrimes = colPrimes;
                maxColIndex = j;
            }
        }

        // Determine which has more prime numbers
        if (maxRowPrimes >= maxColPrimes) {
            System.out.println("Row " + (maxRowIndex + 1) + " has the maximum number of prime numbers.");
        } else {
            System.out.println("Column " + (maxColIndex + 1) + " has the maximum number of prime numbers.");
        }
    }
}
