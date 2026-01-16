public class starpattern {
    public static void main(String[] args) {
        

       
        int num = 5;

        for (int row = 1; row <= num; row++) {
             
            for(int x=num;x >row ;x--){
                    System.out.print(" ");


                }
            for(int j=1;j<=row;j++){

                    System.out.print(num-j+1);

            }
            System.out.println();
        }

        
    }
}