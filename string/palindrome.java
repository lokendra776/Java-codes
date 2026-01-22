public class palindrome{
    public static void main(String[] args) {
        String name = "Pop";
        Boolean ans = isPallindrome( name);
        System.out.println(ans);
        
    }
    static boolean isPallindrome(String name){

        int start = 0;
        int end = name.length()-1;
        while(end>=start){
            if(name.toLowerCase().charAt(start) == name.toLowerCase().charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}