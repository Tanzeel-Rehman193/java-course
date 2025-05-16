import java.util.Scanner;
public class labtask2 {
    public static void main(String[]args){
        Scanner tanzil = new Scanner(System.in);
        float width,length,area,perimeter; 
        System.out.println("Enter the width:");
        width = tanzil.nextInt();
        System.out.println("Enter the length");
        length = tanzil.nextInt();
        area = length * width;
        System.out.println("the area will be:"+area);
        perimeter = 2*area;
        System.out.println("the perimeter will be:"+perimeter);
    }
}
