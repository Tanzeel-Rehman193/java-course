// import java.util.Scanner;
// public class lab6activity1 {
//     public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter three points");
//        double x1 = s.nextDouble();
//        double y1 = s.nextDouble();
//        double x2 = s.nextDouble();
//        double y2 = s.nextDouble();
//        double x3 = s.nextDouble();
//        double y3 = s.nextDouble();
//        double a = Math.sqrt(x2-x3) * (x2-x3) + (y2-y3) * (y2-y3);
//        double b = Math.sqrt(x1-x3) * (x1-x3) + (y1-y3) * (y1-y3);
//        double c = Math.sqrt(x1-x2) * (x1-x2) + (y1-y2) * (y1-y2);
//        double A = Math.toDegrees(Math.acos((a*a-b*b-c*c)/(-2*b*c)));
//        double B = Math.toDegrees(Math.acos((b*b-a*a-c*c)/(-2*a*c)));
//        double C = Math.toDegrees(Math.acos((c*c-b*b-a*a)/(-2*a*b)));
//        System.out.println("The three angles are :"+Math.round(A*100)/100.0 + "" + Math.round(B*100)/100.0 +""+Math.round(C*100)/100.0);
// }
// }
import java.util.Scanner;

public class lab6activity1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three points (x1, y1), (x2, y2), (x3, y3):");

        double x1 = s.nextDouble();
        double y1 = s.nextDouble();
        double x2 = s.nextDouble();
        double y2 = s.nextDouble();
        double x3 = s.nextDouble();
        double y3 = s.nextDouble();
        double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        if (a == 0 || b == 0 || c == 0) {
            System.out.println("Degenerate triangle: One or more sides have zero length.");
            return;
        }
        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));
        System.out.println("The three angles are (rounded to two decimal places):");
        System.out.println(Math.round(A * 100) / 100.0 + " degrees");
        System.out.println(Math.round(B * 100) / 100.0 + " degrees");
        System.out.println(Math.round(C * 100) / 100.0 + " degrees");
    }
    }