public class lab8task2 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        modify(numbers);

        System.out.println("Modified array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void modify(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 3;
        }
    }
}
