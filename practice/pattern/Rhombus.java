class Rhombus{
    public static void main(String args[]){
        int rows=5;
        for(int i=1;i<=rows;i++){
            //spaces
            for(int j=rows;j>i;j--){
                System.out.print(" ");
            }
            //stars
            for(int k=1;k<=rows;k++){
                System.out.print("*");
            }
                System.out.println();

        }
    }
}
    *****
   *****
  *****
 *****
*****