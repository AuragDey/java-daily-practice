/*
Question 1: Display Odd Number Series using Command Line Argument

Write a Java program to display the series: 1, 3, 5, 7, 9, … up to the nth term.

The value n should be taken from the command line argument.
Valid Input:
Only one argument must be provided.
The argument must be an integer.
Range: 1 ≤ n ≤ 100
Invalid Input:
Print ERROR if:
No argument or more than one argument is given.
Negative number.
Fractional number.
String input.
Output Rules:
Print only the series values separated by space.
No extra text.

Example:
Input:
java OddSeries 5
Output:1 3 5 7 9
 */

package day4;

public class OddCmdLineArg {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("error");
            return;
        }
        int n;
        try{
            n=Integer.parseInt(args[0]);
            if(n<1 || n>100){
                System.out.println("error");
                return;
            }
        }
        catch (Exception e){
            System.out.println("error");
            return;
        }
        System.out.println("output");
        for(int i=1;i<2*n+1;i=i+2){
            System.out.print(i+" ");
        }
    }
}
