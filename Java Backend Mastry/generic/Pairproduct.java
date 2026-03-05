public class Pairproduct<T,U> {
    T item;
    U price;

    public Pairproduct(T item,U price) {
        this.item=item;
        this.price=price;

    }

    public T getItem(){
        return this.item;
    }

    public U getPrice(){
        return this.price;
        
    }
    
    
    
}
