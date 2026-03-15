import java.util.HashMap;

public class hashmap{
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>(); //hashmaps are unordered set in java.

        // insertion - O(1).
        hm.put("Banana",12);
        hm.put("Mango",10);
        hm.put("Kiwi",15);

        System.out.println(hm);

        System.out.println("the size of hashmap is " +hm.size());

        // get - O(1).

        int quantity = hm.get("Kiwi");
        // if we try to get a key which not present in map it returns null. 

        System.out.println(quantity);

        // contains key - O(1);
        System.out.println(hm.containsKey("Orange"));
        System.out.println(hm.containsKey("Banana"));

        // remove - O(1)

        System.out.println(hm.remove("Banana")); // it remove the key value pair and returns value
        System.out.println(hm);
        System.out.println("the size of hashmap after banana remove is " + hm.size());

        // hm.clear(); - empty the hashmap



        
    }
}