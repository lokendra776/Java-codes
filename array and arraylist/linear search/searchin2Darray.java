import java.util.*;
public class searchin2Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. to search");
        int target = sc.nextInt();
        int[][] a= {
            {1,2,3},
            {4,5,6},
            {7,8,9}

        };
        int[] b= search( a, target);
        System.out.println("This no. is at index "+Arrays.toString(b));

        

        
    }
    static int[] search(int[][] a, int target){
        if(a.length==0){
            return new int[]{-1,-1};
        }

        for(int row=0;row<a.length;row++){
            for(int col:a[row]){
                if (col==target) {
                    
                    return new int[]{row,col};
                    
                }
            }
        }
        return new int[]{-1,-1};
    }
    
}
