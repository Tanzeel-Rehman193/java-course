import java.util.Scanner;
public class book {
    private String name;
    private int pages;
    private String author;
    public void display(){
        System.out.println(name+""+pages+""+author+"");
    }
    public class Innerbook extends book{
    String programme , batch;
       public Innerbook(){
        name = "Tommy";
        pages = 34;
        author = "Tanzeel";
        programme = "CS";
        batch = "24";
       }
       public void display(){
        System.out.println(name+""+pages+""+author+""+programme+""+batch+"");
       }
    }
    public static void main(String[] args) {
        
    }
}
