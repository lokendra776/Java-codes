
public class min_in_array {
    public static void main(String[] args) {
        int[] a={1,-2,4,62,2,0};
        System.out.println(min(a));
    }
    static int min(int[] a){
        int ans = a[0];
        for(int i=0;i<a.length;i++){

            if(a[i]<ans){
                ans = a[i];
            }

        }
        return ans;
    }
}
