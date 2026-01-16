
import java.util.Scanner;

public class reversethedigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // string n= myGreeting();
        
        int n= sc.nextInt();
        int rev = 0;
        while(n>0){
            int rem = n%10;
            n/=10;
            rev = (rev*10)+rem;
        }
        System.out.println("the reverse of this string is " + rev);
        
    }
    
}
