/*
Question 1: Mixed Arithmetic Series – Find Nth Term

Consider the series:0, 0, 7, 6, 14, 12, 21, 18, 28, 24, ...

Observe that:
All odd-positioned terms form a series: 0, 7, 14, 21, 28, ...
All even-positioned terms form a series: 0, 6, 12, 18, 24, ...
Write a Java program that:
Reads a positive integer n from standard input.
Prints the nth term of the series.
Do not print any extra message or text.

Example:
Input:10
Output:24
 */

package day2;

import java.util.Scanner;

public class ArithmeticSeries {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("Input:");
        int n=inp.nextInt();
        int res;
        if(n%2!=0){
            res=7*(n-1)/2;
        }
        else{
            res=6*(n/2-1);
        }
        System.out.println("output: "+res);
    }
}
