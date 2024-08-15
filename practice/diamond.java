class diamond{
    public static void main(String args[]){
        int rows=5;
        for(int i=1;i<=rows;i++){
            //spaces
            for(int j=rows;j>i;j--){
                System.out.print(" ");
            }
            //stars
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=rows-1;i>=1;i--){
            //spaces
            for(int j=rows;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }

            System.out.println();
        }
        
    }
    
}

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *