Scanner sc=new Scanner(System.in);
        int i=1;
        while(sc.hasNext()){
            System.out.println(i+" "+sc.nextLine());
            i++;
        }

Scanner.hasNext() is used for:
-  to determine whether there is another token available to read. It returns true if there is another token, and false otherwise.
  
- Avoiding NoSuchElementException - If you try to read input using methods like next(), nextInt(), nextLine(), etc., without checking if a token exists,
  you may encounter a NoSuchElementException. Using hasNext() prevents this exception by ensuring that a token is present before trying to read it.
  
- Reading from Files or Streams - When reading data from files, streams, or even strings, hasNext() is useful to iterate over all tokens until the end of the input.
  
- Reading Entire Input - to read the entire input, especially when the input size is unknown or when reading from standard input in a loop.
  
- Loop Control - can be used as a condition in loops to process each token sequentially until no more tokens are left.
  
- Detecting End of Input - There are specialized variants like hasNextInt(), hasNextDouble(), etc., 
  which are used to check if the next token can be interpreted as a specific type. hasNext() works in tandem with these to provide robust input handling. 
  

  
