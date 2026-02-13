public class hcfoftwonynumbers {
    public static void main(String[] args) {
        int hcf = hcf(9221000,922100);
        System.out.println(hcf);
        
    }
    static int hcf(int a, int b){
        if(a==0){
            return b;

        }
        return hcf(b%a,a);
    }

    
}
