STRING
  
public class Main {
    public static void main(String[] args) {
        String original = "Hello, World!";
        StringBuilder sb = new StringBuilder(original);
        String reversed = sb.reverse().toString();
        System.out.println(reversed);
    }
}
------------------------------------------------------------------------------
public class Main {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.println(reversed);
    }
  
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
--------------------------------------------------------------------------------
String str = "MyJava";
char[] strArray = str.toCharArray();
for (int i = strArray.length - 1; i >= 0; i--)
{
    System.out.print(strArray[i]);     //Output : avaJyM
}


NUMBER

public class Main {
    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed Number: " + reversedNumber);
    }

    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append it to the reversed number
            num = num / 10; // Remove the last digit from num
        }
        return reversed;
    }
}
-----------------------------------------------------------------------------------------------------
public class Main {
    public static void main(String[] args) {
        int number = 12345;
        String reversedString = new StringBuilder(String.valueOf(number)).reverse().toString();
        int reversedNumber = Integer.parseInt(reversedString);
        System.out.println("Reversed Number: " + reversedNumber);
    }
}
Convert the integer to a string using String.valueOf().
Reverse the string with StringBuilder.reverse().
Convert the reversed string back to an integer with Integer.parseInt().
