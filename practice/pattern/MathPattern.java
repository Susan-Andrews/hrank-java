// Floyd’s Triangle 

class MathPattern{
    public static void main(String args[]){
        int rows=5;
        int number=1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

    }
}


1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15


// Pascal’s Triangle - Method 1

class MathPattern{
    public static void main(String args[]){
        int rows=5;

        // array to store the values
        int[][] val = new int[rows][rows];

        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                // first and last value is one for constant- need to set it in array
                if(j==0 || j==i){
                    val[i][j]=1;
                }
                else{
                    val[i][j]=val[i-1][j-1] + val[i-1][j];
                }
                System.out.print(val[i][j]+" ");

            }
             System.out.println();
        }


    }
}


// Method 2

class MathPattern{
    public static void main(String args[]){
        int rows=5;
        for (int i = 0; i < rows; i++) {
        int number = 1;
        for (int j = 0; j <= i; j++) {
            System.out.print(number + " ");
            number = number * (i - j) / (j + 1);
        }
        System.out.println();
    }
        


    }
}



1 
1 1
1 2 1
1 3 3 1
1 4 6 4 1