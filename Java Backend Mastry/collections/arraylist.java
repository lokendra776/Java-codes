
import java.util.ArrayList;


public class arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(24);
        list.add(23);
        list.add(27);
        list.add(30);
        list.remove(1);
        System.out.println(list);
        
    }
}