import java.util.Scanner;
public class lab4activity1{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.println("Enter a year : ");
int year = input.nextInt();
boolean isleapYear = (year % 4 ==0 && year % 100 !=0) ||
(year % 400 == 0);
 System.out.println(year  + "Is last leep year?" + isleapYear);
    }
}