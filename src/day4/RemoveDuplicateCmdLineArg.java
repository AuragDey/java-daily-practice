/*
Question 5: Remove Duplicate Characters from String (Command Line)

Write a Java program to remove duplicate characters from a string.
Input should be taken from command line argument.
Valid Input:
Only one string argument.
Invalid Input:
Print ERROR if:
No argument.
More than one argument.
Integer input.
Fraction input.
Output Rules:
Print only the resulting string.
No extra text.

Example:
Input:java RemoveDuplicates engineering
Output:engir

Explanation:
Original: engineering
Result: engir (first occurrence of each character)
 */

package day4;

import java.util.HashSet;

public class RemoveDuplicateCmdLineArg {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("ERROR");
            return;
        }

        String input = args[0];

        try {
            Double.parseDouble(input);     // tries to convert string to number
            System.out.println("ERROR");   // if succeed thn error
            return;
        } catch (NumberFormatException e){
            // if fail exception is caught and continue
        }

        HashSet<Character> set=new HashSet<>();
        String s="";

        for(Character c : args[0].toCharArray()){
            if(!set.contains(c)){
                s+=c;
            }
            set.add(c);
        }
        System.out.println("output: "+s);
    }
}
