
import java.util.*;
public class searching_char_instring {
    public static void main(String[] args) {
        String name = "lokendra";
        char target = 'e';

        Boolean ans = search(name,target);
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(ans);

    }

    static Boolean search(String name, char target){
        if (name.length()==0) {
            return false;

            
        }
        for(char ch : name.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }
    
}
