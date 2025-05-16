import java.util.Scanner;
public class lab3activity5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.print("Enter purchase amount: ");
double purchaseAmount;
 purchaseAmount= input.nextDouble();
double tax;
tax= purchaseAmount * 0.06;
System.out.println("Sales tax is $" + (int)(tax * 100) / 
100.0);
    }
}
