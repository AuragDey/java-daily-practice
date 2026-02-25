/*
Question 5: Fibonacci & Prime Mixed Series

Consider the series: 1, 2, 1, 3, 2, 5, 3, 7, 5, 11, 8, 13, 13, 17, ...

Pattern:
All odd-positioned terms form a Fibonacci series: 1, 1, 2, 3, 5, 8, 13, ...

All even-positioned terms are prime numbers in ascending order: 2, 3, 5, 7, 11, 13, 17, ...

Write a Java program that:
Reads a positive integer n from standard input.
Prints the nth term.
Do not print extra text.

Example:
Input:10
Output:11
 */


package day2;

import java.util.Scanner;

public class MixedSeriesTwo {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("input: ");
        int n=inp.nextInt();
        int res;

        if (n % 2 != 0) {
            res = fibonacci((n + 1) / 2);
        } else {
            res = prime(n / 2);
        }

        System.out.println("output: "+res);
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2)
            return 1;

        int a = 1, b = 1, c;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static int prime(int n) {
        int count = 0, num = 1;

        while (count < n) {
            num++;
            if (isPrime(num)) {
                count++;
            }
        }
        return num;
    }

    public static boolean isPrime(int num) {
        if (num < 2)
            return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
