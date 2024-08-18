public class ReverseArray {
    
    // Function that reverses array and stores it in another array
    static void reverse(int a[], int n) {
        int[] b = new int[n];  // Create a new array to store the reversed elements
        int j = n;  // Initialize j to the length of the array
        
        // Iterate through the original array
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];  // Assign the current element of a to the reversed position in b
            j = j - 1;  // Move to the next position in b
        }
        
        // Print the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);  // Print each element of the reversed array
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};  // Define the original array

        System.out.println("Original array is: \n");
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);  // Print each element of the original array
        }

        reverse(arr, arr.length);  // Call the reverse method with the array and its length
    }
}
