/*
Question 2: Modify and Concatenate Three Words

Write a Java program that:

Reads three English words from standard input (each word in a separate line).
Performs the following operations:
Replace all vowels in the first word with $.
Replace all consonants in the second word with #.
Convert all characters in the third word to uppercase.
Concatenate the three modified words.
Print only the final concatenated string.

Constraints: Each word will contain at most 5 characters.

Example:

Input:
how
are
you
Output: h$wa#eYOU
 */

package day1;

import java.util.Scanner;

public class ConcatThreeWords {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("input:");
        String s1=inp.nextLine();
        String s2=inp.nextLine();
        String s3=inp.nextLine().toUpperCase();
        s1=s1.replaceAll("[aeiouAEIOU]","\\$");
        s2=s2.replaceAll("[^aeiouAEIOU]","#");
        String s4=s1+s2+s3;
        System.out.println("output: "+s4);
    }

}
