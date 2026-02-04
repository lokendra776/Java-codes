import java.util.*;
public class armstrongno {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a= sc.nextInt();
        

        Boolean ans = armstrong(a);
        System.out.println(ans);
    }

    static Boolean armstrong(int a){
        String s = Integer.toString(a);
        int digit = s.length();
        
        int sum=0;
        int original = a;
        while(a>0){
            int rem = a%10;
            a/=10;
             
            sum+=Math.pow(rem,digit);
        }
        if(sum == original){
            return true;
        }
        return false;

    }
    
}
