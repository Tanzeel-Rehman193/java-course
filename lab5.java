import java.util.Scanner;
public class lab5 {
    public static void main(String[]args){
         Double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius:");
        double radius = input.nextDouble();
        Double area = radius * radius *PI;
        System.out.println("The area for the circle of radius"+radius+"is"+area);
    }
}
