import java.util.*;
public class leetcode_367_isperfectsquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Boolean ans = isPerfectSquare(num);
        System.out.println(ans);
        sc.close();

        

    }
    static boolean isPerfectSquare(int num){
    
        int c = (int)(Math.pow(num,0.5));
        return c*c==num;
        
        

        

    }
}