Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100 
cpp            065 
python         050 
================================

  just use the line : System.out.printf("%-15s%03d\n",s1,x); 
  - since the left justification of the word and right appending of space.
  15 since the following string (with the format specifier s) is added in 15 space  
  right justify the number in the space of 3 

#THEORY
                                                            //                https://www.geeksforgeeks.org/formatted-output-in-java/
Formatting Using Java Printf()
printf() uses format specifiers for formatting. There are certain data types are mentioned below:
For Number Formatting
Formatting Decimal Numbers
For Boolean Formatting
For String Formatting
For Char Formatting
For Date and Time Formatting
  just capitalise the format specifier to make capital letter of the char/bool/string
    
