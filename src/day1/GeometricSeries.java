/*
Question 1: Find the Nth Term in a Mixed Geometric Series

Consider the series:
1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243, 64, 729, 128, 2187, …

This series is formed by mixing two geometric series:
All odd-positioned terms form one geometric series.
All even-positioned terms form another geometric series.
Write a Java program that:
Reads a positive integer N from standard in
put.
Calculates the Nth term of the series.
Prints only the value of the Nth term to standard output.
Does not print any extra text or messages.

Constraints: 1 ≤ N ≤ 30

Example:
Input:16
Output:2187
 */

package day1;

import java.util.Scanner;

public class GeometricSeries {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("Input:");
        int n=inp.nextInt();
        int res;
        if(n%2!=0){
            res=(int)Math.pow(2,n-1/2);
        }
        else{
            res=(int)Math.pow(3,n/2-1);
        }
        System.out.println("output:"+res);
    }
}
