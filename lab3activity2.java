import java.util.Scanner;
public class lab3activity2 {
    public static void main(String[]args){
        double regularwages;
        double basepay = 25;
        double regularHours = 40;
        double overtimeWages;
        double overtimePay = 37.5;
        double overtimehours = 10;
        double totalwages;
        regularwages  = basepay * regularHours;
        overtimeWages = overtimePay * overtimehours;
        totalwages = regularwages + overtimeWages;
        System.out.println("Wages for this weeks are $ " + totalwages);
    }
}
