
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        // fibonacciseries = 0 1 1 2 3 5 8.....

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;
        while(count<=n){
            int temp = b;
            b= b+a;
            a=temp;
            count++;
        }
        System.out.println(b);
        

        

        


        



    }
    
}
