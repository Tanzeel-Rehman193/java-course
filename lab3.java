import java.util.Scanner;
public class lab3{
    public static void main(String[]args){
        double hours;
        hours  = 30;
        System.out.print(hours);
        double payrate;
        payrate = 4500;
        System.out.print(payrate);
        double total;
        total = hours*payrate;
        System.out.print(total);
        Scanner sc = new Scanner(System.in);
        System.out.print("what are your payhours?\n");
        int a = sc.nextInt();
        System.out.print("what is your payrate?\n");
        int b = sc.nextInt();
        System.out.print("The result is:\n"+total);
    }
}