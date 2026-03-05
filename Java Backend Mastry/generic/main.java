public class main {
    public static void main(String[] args) {

        Pairproduct<String,Integer> pen = new Pairproduct<>("pen",20);
        

        boxwithgeneric<String> box = new boxwithgeneric<>("RECTANGLE");
        

        
        
        
        System.out.println("The shape of the box is "+ box.getShape());
        System.out.println("The item I bought is "+ pen.getItem());
        System.out.println("The price of item is "+ pen.getPrice());
    }
    
}
