public class lower_trianglestarpattern {
    public static void main(String[] args) {

        int n = 5; // number of rows

        for (int i = 1; i <= n; i++) {          // rows
            for (int j = 1; j <= n; j++) { 
                if(i>=j){
                    System.out.print("* ");
                }
                else{
                    
                    System.out.print(" ");     
                }
                
            }
            System.out.println();               // new line after each row
        }
    }
}





// *
// * *
// * * *
// * * * *
// * * * * *
