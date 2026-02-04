public class leetcode342_powerof4 {
    public static void main(String[] args) {
        int n = 64;
        System.out.println(isPowerOfFour(n));
        

        
    }
    static boolean isPowerOfFour(int n) {
        int x = (int)(Math.log(n) / Math.log(2)/2);

        if(Math.pow(4,x) == n){
            return true;
        }
        return false;
        
        
        
        
    }
}
