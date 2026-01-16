import java.util.Scanner;

public class marks_calculator {
 
    public static void main(String[] args) {
    Scanner sr = new Scanner(System.in);
    System.out.print("ENTER YOUR CLASS : ");
    float g = sr.nextFloat();
    System.out.println("Enter Your marks 1");
    float a = sr.nextFloat();
    System.out.println("Enter Your marks 2");
    float b = sr.nextFloat();
    System.out.println("Enter Your marks 3");
    float c = sr.nextFloat();
    System.out.println("Enter Your marks 4");
    float d = sr.nextFloat();
    System.out.println("Enter Your marks 5");
    float e = sr.nextFloat();

    float f = (a+b+c+d+e)/5f;
    System.out.print("Your percentage in class " + g+ "th is : ");
    System.out.println(f);















    }
}