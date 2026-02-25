/*
Question 2: Mixed Series (Even Numbers & Derived Terms)

Consider the series: 0, 0, 2, 1, 4, 2, 6, 3, 8, 4, 10, 5, 12, 6, 14, 7, 16, 8, ...

Pattern:
All odd-positioned terms are even numbers in ascending order:
0, 2, 4, 6, 8, 10, ...

Every even-positioned term is derived from the previous term using:
term = previous_term / 2
Write a Java program that:
Reads a positive integer n from standard input.
Prints the nth term.
Do not print any extra output.
Constraints:
1 ≤ n ≤ 20000

Example:
Input:10
Output:4
 */

package day2;

import java.util.Scanner;

public class MixedSeries {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Input:");
        int n=inp.nextInt();
        int res;
        if (n%2!=0){
            res=n-1;
        }
        else{
            res=(n-2)/2;
        }
        System.out.println("output: "+res);
    }
}
