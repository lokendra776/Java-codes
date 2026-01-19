public class leetcode_744 {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'}; 
        char ans = nextGreatestLetter(letters, 'a');
        System.out.println(ans);
        
    }

    
    static char nextGreatestLetter(char[] letters, char target) {
        
        
        if(target>letters[letters.length-1]){
            return letters[0];
        }
        int start = 0;
        int end = letters.length -1;

    
        while(end>=start){
            
            int mid = start + (end-start)/2;
            if(letters[mid]>target){
                end = mid-1;


            }
            else {
                start =mid +1;

            }
            

        }
        return letters[start%letters.length]; // according to all edge cases
        
    }
    
}
