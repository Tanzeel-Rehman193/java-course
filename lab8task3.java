public class lab8task3 {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] reversedArray = new int[originalArray.length];

        // Copy elements in reverse order
        for (int i = 0, j = originalArray.length - 1; i < originalArray.length; i++, j--) {
            reversedArray[i] = originalArray[j];
        }

        // Print the reversed array
        System.out.println("Reversed array:");
        for (int number : reversedArray) {
            System.out.print(number + " ");
        }
    }
}
