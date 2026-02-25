/*
Question 4: Remove Duplicates, Reverse & Change Case

Write a Java program that:
Replaces multiple consecutive occurrences of characters with a single character.
Reverses the resulting string.
Changes the case of each character (upper ↔ lower).

Example:
Input:aaaaEEeeecccCCCGEExffe
Output:EFXegcCEeA
 */

package day2;

import java.util.Scanner;

public class StringOperation {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("input:");
        String s=inp.nextLine();
        StringBuilder res=new StringBuilder();
        for (int i=0; i<s.length(); i++){
            if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                continue;
            }
            else{
                char c= s.charAt(i);
                if(Character.isLowerCase(c)){
                    c=Character.toUpperCase(c);
                }
                else{
                    c=Character.toLowerCase(c);
                }
                res.append(c);
            }
        }
        res.reverse();
        System.out.println("output: "+res);
    }
}
