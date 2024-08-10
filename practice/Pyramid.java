// Right Half Pyramid Pattern  

// class pyramid{
//     public static void main(String args[]){
//         int rows=5;
//         for(int i=1;i<=rows;i++){
//             for (int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// * 
// **
// ***
// ****
// *****

// Left Half Pyramid Pattern 

class pyramid{
    public static void main(String args[]){
        int rows=5;
        //to print rows
        for(int i=1;i<=rows;i++){
            //to print leading spaces - spaces decreases
            for(int j=rows;j>i;j--){
                System.out.print(" ");
            }
        //to print stars
        for(int k=1;k<=i;k++){
            System.out.print("*");

             }
            System.out.println();

        }
    }
}

//     *
//    **
//   ***
//  ****
// *****