import java.util.*;
public class sumofadigitofno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = count(a);
        System.out.println(count);

    }
    static int count(int a){
        int n =0;
        while(a>0){

            n += a%10;
            a /= 10;
            
        }
        return n;

    }
    
}
