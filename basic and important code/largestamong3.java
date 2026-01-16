
import java.util.*;


public class largestamong3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 3 approach to solve same problem and have many more too
        
        // if(a>b){
        //     if(a>c){
        //         System.out.println("Gretest among these three is " + a);
        //     }
        //     else{

        //         System.out.println("Gretest among these three is " + c);
        //     }

        // }
        // else if (b>c) {
        //     if (b>a){
        //         System.out.println("Gretest among these three is " + b);
        //     }
        //     else{

        //         System.out.println("Gretest among these three is " + a);
        //     }
        // }
        // else{

        //     System.out.println("Gretest among these three is " + c);
        // }



        // int max = a;
        // if(b>max){
        //     max= b;
        // }
        // if(c>max){
        //     max = c;
        // }
        // System.out.println("Gretest among these three is " + max);
    

    int max = Math.max(c,Math.max(a,b));
    System.out.println("Gretest among these three is " + max);


















    }
    
}
