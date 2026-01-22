import java.util.*;

public class fibo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No. : ");
        int n = sc.nextInt();

        int ans= fibo(n);
        System.out.println(ans);

        
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    
    }
}