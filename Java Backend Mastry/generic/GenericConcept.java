import java.util.*;
public class GenericConcept{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // here <String> iis generic
        list.add("hello");
        // list.add(34); not allowed


        List list2 = new ArrayList();
        list2.add("hello");

        list2.add(34); // allowed

        System.out.println(list + "," +list2);

    }
}