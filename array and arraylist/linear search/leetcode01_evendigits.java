// page no. 1 explained solution in copy. with a brute force approach.




public class leetcode01_evendigits {
    public static void main(String[] args) {
        int[] arr= {12,345,2,6,7896};
        System.out.println(findNumbers(arr));

        
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums){
            if(even(num)){

                count++;
            }


        }


        return count;

        

        
    }
    static Boolean even(int num){
        int a = digits(num);
        return a%2==0;

    }

    static int digits(int num){
        int b = (int)Math.log10(num)+1;
        return b;

    }
    

    
}
