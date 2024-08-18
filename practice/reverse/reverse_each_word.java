public class reverse_each_word {
    public static String reverseEachWord(String str) {
        // Step 1: Split the input string into an array of words
        String[] words = str.split("\\s");
        
        // Step 2: Initialize an empty string to hold the final reversed string
        String reverseWord = "";
        
        // Step 3: Iterate through each word in the array
        for (String w : words) {
            // Step 4: Create a StringBuilder object for the current word
            StringBuilder sb = new StringBuilder(w);
            
            // Step 5: Reverse the characters of the word using StringBuilder's reverse() method
            sb.reverse();
            
            // Step 6: Append the reversed word and a space to the final string
            reverseWord += sb.toString() + " ";
        }
        
        // Step 7: Return the final string, trimmed to remove the trailing space
        return reverseWord.trim();
    }

    public static void main(String[] args) {
        // Step 8: Test the function with sample strings
        System.out.println(reverseEachWord("my name is khan"));      // Output: "ym eman si nahk"
        System.out.println(reverseEachWord("I am sonoo jaiswal"));   // Output: "I ma oonos lawsiaj"
    }
}


-------------------------------------------------------------------------------------------------

public class ReverseWithStringConcat {
    public static String reverseEachWord(String str) {
        // Step 1: Split the input string into words
        String[] words = str.split(" ");
        
        // Step 2: Initialize an empty string to hold the final reversed string
        String reverseString = "";
        
        // Step 3: Iterate through each word in the array
        for (String word : words) {
            // Initialize an empty string to hold the reversed word
            String reverseWord = "";
            
            // Step 4: Reverse the current word
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord += word.charAt(j);  // Concatenate characters in reverse order
            }
            
            // Step 5: Add the reversed word to the final string with a space
            reverseString += reverseWord + " ";
        }
        
        // Step 6: Return the final reversed string, trimming any extra space at the end
        return reverseString.trim();
    }

    public static void main(String[] args) {
        // Step 7: Test the function with sample strings
        System.out.println(reverseEachWord("my name is khan"));      // Output: "ym eman si nahk"
        System.out.println(reverseEachWord("I am sonoo jaiswal"));   // Output: "I ma oonos lawsiaj"
    }
}


-------------------------------------------------------------------------------------------------

import java.util.Stack;

public class ReverseWithStack {

    public static void reverseWords(String str) {
        // Step 1: Initialize a stack to hold characters
        Stack<Character> stack = new Stack<>();

        // Step 2: Iterate through each character in the string
        for (int i = 0; i < str.length(); ++i) {
            // Step 3: If the current character is not a space, push it to the stack
            if (str.charAt(i) != ' ') {
                stack.push(str.charAt(i));
            }
            // Step 4: If a space is encountered, pop and print characters until the stack is empty
            else {
                while (!stack.empty()) {
                    System.out.print(stack.pop());
                }
                System.out.print(" ");  // Print the space after the word is reversed
            }
        }

        // Step 5: After the loop, pop and print any remaining characters in the stack (for the last word)
        while (!stack.empty()) {
            System.out.print(stack.pop());
        }
    }

    public static void main(String[] args) {
        // Step 6: Test the function with a sample string
        reverseWords("Geeks for Geeks");  // Output: "skeeG rof skeeG"
    }
}


