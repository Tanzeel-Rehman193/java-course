import java.util.Scanner;
public class labtask3 {
    public static void main(String[]args){
        Scanner s  = new Scanner(System.in);
        int payrate,salary;
        int workhours;
        String name;
        System.out.println("Enter your name:");
        name = s.next();
        System.out.println("Enter your salary:");
        salary = s.nextInt();
        System.out.println("Enter your workhours:");
        workhours = s.nextInt();
        payrate = salary * workhours;
        System.out.println("The pay rate will be:"+payrate);
    }
}
