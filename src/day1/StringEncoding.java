/*
Question 4: String Encoding

Write a Java program to encode a given string using the following rule:
Each alphabet character should be converted to its opposite case.
After conversion, append the number of times it appears consecutively.

Example:

Input:aaaabbBccdee
Output:A4B2b1C2D1E2

Explanation:
aaaa → A4
bb → B2
B → b1
cc → C2
d → D1
ee → E2
 */

package day1;

import java.util.Scanner;

public class StringEncoding {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Input:");
        String s=inp.nextLine();
        StringBuilder res= new StringBuilder();
        int count=1;
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                char c=s.charAt(i);
                if(Character.isUpperCase(c)){
                    c=Character.toLowerCase(c);
                }
                else{
                    c=Character.toUpperCase(c);
                }
                res.append(c).append(count);
                count=1;
            }
        }
        System.out.println("output: "+res);
    }
}
