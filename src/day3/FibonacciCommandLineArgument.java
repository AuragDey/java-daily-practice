/*
Question 1: Fibonacci Sequence using Command Line Argument

Write a Java program to display the Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, …

The value n should be taken from the command line argument.

Requirements:
Valid Input:
Only one command line argument should be provided.
The argument must be an integer.
Range: 1 ≤ n ≤ 20

Invalid Input:
Print ERROR if:
No argument OR more than one argument is given.
Negative number is given.
Fractional number is given.
String input is given (example: "ab", "t", "e2")

Output Rules:
Print only Fibonacci terms separated by space.
No extra text.
If invalid input → print only:
ERROR

Example:
Input (command line):java Fibonacci 8
Output:0 1 1 2 3 5 8 13
 */

package day3;

public class FibonacciCommandLineArgument {
    public static void main(String[] args) {
        if(args.length<1){
            System.out.println("Error");
            return;
        }
        int n=Integer.parseInt(args[0]);
        fibonacci(n);
    }
    public static void fibonacci(int n){
        int a=0,b=1,c;
        for(int i=1;i<n;i++){
            System.out.println(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}

/*
To compile and run this in cmd-
cd file location
javac day3/FibonacciCommandLineArgument.java  (to compile the file and create a .class file)
java day3.FibonacciCommandLineArgument 10
 */
