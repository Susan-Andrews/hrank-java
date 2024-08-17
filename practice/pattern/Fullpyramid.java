// Full Pyramid Pattern    

class Fullpyramid{
    public static void main(String args[]){
        int rows=5;
        for(int i=1;i<=rows;i++){
            // to print the leading spaces
            for(int j=i;j<rows;j++){
                System.out.print(" ");
            }
            //to print stars
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


// Inverted Full Pyramid Pattern   

class Fullpyramid{
    public static void main(String args[]){
        int rows=5;
        for(int i=rows;i>=1;i--){
            // to print the leading spaces
            for(int j=i;j<rows;j++){
                System.out.print(" ");
            }
            //to print stars
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

*********
 *******
  *****
   ***
    *