import java.util.Scanner;

public class lab10task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] array = new int[3][4];

        System.out.println("Enter 12 integers for a 3x4 array:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        // Find row with maximum sum
        int maxRowSum = Integer.MIN_VALUE;
        int maxRowIndex = -1;

        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 4; j++) {
                rowSum += array[i][j];
            }
            if (rowSum > maxRowSum) {
                maxRowSum = rowSum;
                maxRowIndex = i;
            }
        }

        // Find column with maximum sum
        int maxColSum = Integer.MIN_VALUE;
        int maxColIndex = -1;

        for (int j = 0; j < 4; j++) {
            int colSum = 0;
            for (int i = 0; i < 3; i++) {
                colSum += array[i][j];
            }
            if (colSum > maxColSum) {
                maxColSum = colSum;
                maxColIndex = j;
            }
        }

        System.out.println("Row with maximum sum: " + (maxRowIndex + 1));
        System.out.println("Column with maximum sum: " + (maxColIndex + 1));
    }
}
