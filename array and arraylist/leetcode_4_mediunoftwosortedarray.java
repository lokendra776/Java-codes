

// public class leetcode_4_mediunoftwosortedarray {
//     public static void main(String[] args) {
//         int[] num1= {1,2};
//         int[] num2= {3,4};
//         double mediun= findMedianSortedArrays(num1, num2);
//         System.out.println(mediun);

        
//     }
//     static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int[] nums3 = new int[nums1.length+nums2.length];
//         System.arraycopy(nums1, 0, nums3, 0, nums1.length);
//         System.arraycopy(nums2, 0, nums3, nums1.length, nums2.length);
//         Arrays.sort(nums3);
//         int half = (nums3.length)/2;
//         if(!iseven(nums3.length)){
//             return nums3[half - 1];
//         }
//         else{
//             return (double)(nums3[half] + nums3[half - 1])/2;
//         }


        
//     }
//     static boolean iseven(int n){
//         return n%2==0;
//     }
// }


public class leetcode_4_mediunoftwosortedarray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is smaller
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int low = 0, high = m;

        while (low <= high) {
            int cut1 = (low + high) / 2;
            int cut2 = (m + n + 1) / 2 - cut1;

            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int right1 = (cut1 == m) ? Integer.MAX_VALUE : nums1[cut1];

            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int right2 = (cut2 == n) ? Integer.MAX_VALUE : nums2[cut2];

            if (left1 <= right2 && left2 <= right1) {
                // Correct partition
                if ((m + n) % 2 == 0) {
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                } else {
                    return Math.max(left1, left2);
                }
            }
            else if (left1 > right2) {
                high = cut1 - 1;
            }
            else {
                low = cut1 + 1;
            }
        }
        return 0.0; // unreachable
    }
}

