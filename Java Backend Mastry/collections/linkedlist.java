import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(23);
        list.add(24);
        list.add(25);
        list.add(26);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
    }
    
}
