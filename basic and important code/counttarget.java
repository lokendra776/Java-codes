
import java.util.*;

public class counttarget {
    public static void main(String[] args) {
        int n = 137857757;
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int count = 0;

        while(n>0){
            int rem = n%10;
            if(rem==target){
                count++;

            }
            n/=10;
        }
        System.out.println(count);
    }
    
}
