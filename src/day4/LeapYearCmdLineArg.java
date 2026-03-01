/*
Question 4: Leap Year Check using Command Line Argument

Write a Java program to check whether a given year is a leap year.
Input should be taken from command line argument.
Valid Input:
Only one integer argument.
Invalid Input:
Print ERROR if:
No argument or multiple arguments.
Negative number.
Fraction number.
String input.
Number out of unsigned integer range.
Output Rules:
Print Yes if leap year.
Print No if not leap year.
Print ERROR if invalid input.

Example:
Input:java LeapYear 2020
Output:Yes
 */

package day4;

public class LeapYearCmdLineArg {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("error");
            return;
        }

        int n;
        try{
            n=Integer.parseInt(args[0]);
            if(n<1){
                System.out.println("error");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("error");
            return;
        }

        if((n%4==0 && n%100!=0) || n%400==0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}

