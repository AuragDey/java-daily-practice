/*
Question 5: Multiple String Transformation

Write a Java program that:
Reads three strings (each in a separate line).
Performs the following operations:
In the first string, replace all vowels with " (double quote).
In the second string, replace all consonants with *.
In the third string, convert all uppercase letters to lowercase.
Print the modified strings (each on a new line).

Example:
Input:
Hello
Hi
Good Morning

Output:
H"ll"
*I
good morning
 */
package day1;

import java.util.Scanner;

public class MultipleStringModification {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Input:");
        String s1=inp.nextLine();
        String s2=inp.nextLine();
        String s3=inp.nextLine().toLowerCase();
        s1=s1.replaceAll("[aeiouAEIOU]","\"");
        s2=s2.replaceAll("[^aeiouAEIOU]","*");
        System.out.println(s1+"\n"+s2+"\n"+s3);
    }
}
