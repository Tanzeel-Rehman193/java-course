import java.util.Scanner;

public class lab5task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        System.out.print("Enter the first day of the year 1 for Sunday, 2 for Monday, ..., 7 for Saturday): ");
        int firstDay = scanner.nextInt();
        String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }
        for (int month = 1; month <= 12; month++) {
            System.out.println("\n" + daysOfWeek[firstDay - 1] + "  " + month + " " + year);
            System.out.println("Su Mo Tu We Th Fr Sa");

            int spaceCount = firstDay - 1;
            for (int i = 1; i <= spaceCount; i++) {
                System.out.print("   ");
            }
            for (int day = 1; day <= daysInMonth[month - 1]; day++) {
                System.out.printf("%2d ", day);
                if ((day + spaceCount) % 7 == 0) {
                    System.out.println();
                }
            }
            firstDay = (firstDay + daysInMonth[month - 1]) % 7;
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
