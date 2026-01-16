import java.util.*;

public class primewithfunction {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        Boolean result = isPrime(n);
        System.out.println(result);

    }
    static Boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        
        int c=2;
        while (c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}


    


        
      
        
    


            
                
                
            
        
