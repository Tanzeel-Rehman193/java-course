import java.util.Scanner;

public class lab3task10 {
    public static void main(String[] args) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s%n","Degrees", "Radians", "Sine", "Cosine", "Tangent");

        // Display the data for 30 degrees
        int degrees = 30;
        double radians = Math.toRadians(degrees);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        System.out.printf("%-10d %-10.4f %-10.4f %-10.4f %-10.4f%n", degrees, radians, sin, cos, tan);
        
        // Display the data for 60 degrees
        degrees = 60;
        radians = Math.toRadians(degrees);
        sin = Math.sin(radians);
        cos = Math.cos(radians);
        tan = Math.tan(radians);
        System.out.printf("%-10d %-10.4f %-10.4f %-10.4f %-10.4f%n", degrees, radians, sin, cos, tan);
    }
}
