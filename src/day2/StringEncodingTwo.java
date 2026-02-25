/*
Question 3: String Encoding (Modified Rule)

Write a Java program to encode a string using the following rule:
Convert each alphabet to its opposite case.
Append the number of consecutive occurrences.
If the character appears only once, do NOT append the number.

Example:
Input: aaaabbBccdee
Output: A4B2bC2DE2

Explanation:
aaaa → A4
bb → B2
B → b
cc → C2
d → D
ee → E2
 */

package day2;

import java.util.Scanner;

public class StringEncodingTwo {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Input:");
        String s=inp.nextLine();
        StringBuilder res=new StringBuilder();
        int count=1;
        for (int i = 0; i < s.length(); i++) {
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
                if(count>1){
                    res.append(c).append(count);
                }
                else{
                    res.append(c);
                }
                count=1;
            }
        }
        System.out.println("output: "+res);
    }
}
