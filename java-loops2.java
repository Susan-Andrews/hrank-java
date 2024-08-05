just declare a variable and add it togerther to print the series. 
while taking the power using Math.pow , it need to be double value so , the variable to which pow value is assingning must be a double value.

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double   {BSNL}

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte

  int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

  double myDouble = 9.78d;
    int myInt = (int) myDouble; // Manual casting: double to int
