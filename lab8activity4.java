import java.util.Scanner;

public class lab8activity4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Input elements in array");
            System.out.println("2. Search element and its location");
            System.out.println("3. Find largest & smallest value in the array");
            System.out.println("4. Copy data");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inputArray(array);
                    displayArray(array);
                    break;
                case 2:
                    System.out.print("Enter element to search: ");
                    int searchKey = scanner.nextInt();
                    int index = search(searchKey, array);
                    if (index != -1) {
                        System.out.println("Element found at index: " + index);
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;
                case 3:
                    int largest = largest(array);
                    int smallest = smallest(array);
                    System.out.println("Largest element: " + largest);
                    System.out.println("Smallest element: " + smallest);
                    array[0] = largest;
                    array[9] = smallest;
                    System.out.println("Array after swapping:");
                    displayArray(array);
                    break;
                case 4:
                    int[] copiedArray = new int[10];
                    copyData(array, copiedArray);
                    System.out.println("Copied array:");
                    displayArray(copiedArray);
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        scanner.close();
    }

    public static void inputArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    public static void displayArray(int[] array) {
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int search(int searchKey, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchKey) {
                return i;
            }
        }
        return -1;
    }

    public static int largest(int[] array) {
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static void copyData(int[] sourceArray, int[] destinationArray) {
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }
    }
}
