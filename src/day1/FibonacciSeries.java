/*
Question 3: Modified Fibonacci Series

Consider the following series:
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987…

The series is defined as:
term(1) = 1
term(2) = 2
term(N) = term(N-1) + term(N-2), for N > 2

Write a Java program that:
Reads a positive integer N from standard input.
Prints the Nth term.
Do not print any extra text.

Example:

Input:15
Output:987
*/

package day1;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("input: ");
        int n=inp.nextInt();
        if(n==1 || n==2){
            System.out.println("output:"+n);
        }
        else {
            int res = 0,f=1,s=2;
            for (int i = 0; i < n - 2; i++) {
                res = f + s;
                f = s;
                s = res;
            }
            System.out.println(res);
        }
    }
}
