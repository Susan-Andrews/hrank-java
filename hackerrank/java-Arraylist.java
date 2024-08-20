// https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true

algorithm
  1. we need to take the first input from the user, which is the size of main list
  2. create list of lists in java 
  3. upnext their will be 5 arrays, so we need to addd these arrays in the created large array. for that:
        3.1. initialize a for loop 
        3.2. accept the size, which is aaded first in input, followed by the array elements
        3.3. initialize a new array , so that at the repeating of the loop n number of array is created withinn the main array
        3.4. initialise another for loop :
                3.4.1. add the following elements to the subarray created above
                3.4.2. add the array to the main array/list
  4.end for 
  5. accept the total number of query value
  6. initialise a for loop , and perform all the quering for all the descending values
        5.1. accept the array index and the element index into two variables
        5.2. inside a try catch block, get the value using the indexes from the input values as queries and get function.
  7. end for


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
            ArrayList<ArrayList<Integer>> listofarrays = new ArrayList<>();
        
        for(int i = 0;i<n;i++){
            int size =sc.nextInt();
            ArrayList<Integer> array = new ArrayList<>();

            
            for(int j=0;j<size;j++){
                 array.add(sc.nextInt());
                }
                listofarrays.add(array);
                
        
        }
        // // Output each ArrayList stored in the listOfArrays (for demonstration)
        // for (int i = 0; i < listofarrays.size(); i++) {
        //     //from the arraylist group , get the list with index i and name it array
        //     ArrayList<Integer> array = listofarrays.get(i);
        //     System.out.print("Array " + (i + 1) + ": ");
        //     // for each of num,in arrray , print it 
        //     for (int num : array) {
        //         System.out.print(num + " ");
        //     }
        //     System.out.println();
        // }
        // returns 0:  41 77 74 22 44 
        // 1: 12 ...............
        
        // query part
        int q =sc.nextInt();
        for(int i = 0 ;i<q ;i++){
            int arrayindex=sc.nextInt();
            int elementindex=sc.nextInt();
            
             try{
                //  the -1 is used to adjust for 1-based indexing to 0-based indexing.
            int value = listofarrays.get(arrayindex-1).get(elementindex-1);
            System.out.println(value);
        }
        catch(IndexOutOfBoundsException e){
              System.out.println("ERROR!");
                 }
        
        }
       
    }
}
---------------------------------------------------------------------------------------------------

// other questions in practice, arraylist folder
