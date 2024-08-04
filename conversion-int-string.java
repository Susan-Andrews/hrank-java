   int n = in .nextInt();

                  String s=String.valueOf(n);
                  String s= String.format("%d",n);
                  String s=Integer.toString(n);

if (n == Integer.parseInt(s)) {
    System.out.println("Good job");
   } else {
    System.out.println("Wrong answer.");
   }


String s="200";  

                  int i=Integer.parseInt(s);  
                  Integer i=Integer.valueOf(s);  
System.out.println(s+100);//200100, because "200"+100, here + is a string concatenation operator  
System.out.println(i+100);//300, because 200+100, here + is a binary plus operator  

int (Primitive Data Type)
Type: Primitive data type.
Memory Size: Typically 4 bytes (32 bits).
Default Value: 0.
Performance: Faster and more memory-efficient compared to Integer because it doesn't involve object overhead.
Usage: Used for simple numeric operations where object features are not needed. Examples include arithmetic operations, array indexing, and scenarios requiring high performance.  

Integer (Wrapper Class)
Type: Wrapper class for the primitive type int.
Memory Size: Typically more than 4 bytes due to object overhead (including metadata and references).
Default Value: null (since it’s an object).
Features: Provides methods for converting between types, parsing strings, and working with collections (e.g., ArrayList<Integer>). Supports null values, which can be useful in certain contexts.
Usage: Used when you need to store int values in collections, use methods from the Integer class, or work with APIs that require objects. Also useful in scenarios where nullability is needed.
