import java.util.Scanner;
public class lab4task6 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a  number between 1 and 10: ");
        int number = scanner.nextInt();

        if (number < 1 || number > 10) {
            System.out.println("Error:Number must be between 1 and 10.");
        } else {
            String romanNumeral = convertToRoman(number);
            System.out.println("The Roman numeral equivalent of " + number + " is: " + romanNumeral);
        }
    }

    private static String convertToRoman(int number) {
        String[] romanNumerals = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        return romanNumerals[number  
 - 1];
    }
}

