
import java.util.*;

public class takeinputsinglecharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().trim().toLowerCase().charAt(0); // trim() is a function which remove all the spaces in given string
                                                    //    and charAt(index) function is use to get the character a given index fron string.
                                                    // toLowerCase() is use to lower all the character in given string .
        System.out.println(a);
        
    }
    
}
