import java.util.*;

public class leetcode_1929 {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
        

        
    }
    static int[] getConcatenation(int[] nums){  //this is the fastest way to concatinate two arrays
        int[] ans = new int[2*nums.length];
        System.arraycopy(nums, 0, ans, 0, nums.length);
        System.arraycopy(nums, 0, ans, nums.length, nums.length);
        return ans;
    }
    // static int[] getConcatenation2(int[] nums){  // slow approach
    //     int[] ans = new int[2*nums.length];
    //     int index=0;
        

    //     // copying 1st time the nums to ans
    //     for(int i=0; i<nums.length;i++){
            
    //         ans[index++] = nums[i];


    //     }

    //     // copying 2nd time the nums to ans
    //     for(int i=0; i<nums.length;i++){
            
    //         ans[index++] = nums[i];


    //     }
    //     return ans;
    // }
}
