

public class leetcode02_richestperson {
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};

        int ans = maximumWealth( accounts);
        System.out.println(ans);

        
    }

    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] person : accounts) {
            int rowsum=0;
            for (int account : person) {
                rowsum = account + rowsum;
            }
            max = Math.max(max, rowsum);
        }
        return max;



    }
        
    
}
