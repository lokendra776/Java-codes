public class armstrongno {
    public static void main(String[] args) {
        int a= 153;
        Boolean ans = armstrong(a);
        System.out.println(ans);
    }

    static Boolean armstrong(int a){
        int sum=0;
        int original = a;
        while(a>0){
            int rem = a%10;
            a/=10;
             
            sum+=rem*rem*rem;
        }
        if(sum == original){
            return true;
        }
        return false;

    }
    
}
