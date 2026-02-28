/*
Question 5: Find Pairs with Given Sum

Write a Java program that:
Reads an array of integers.
Reads a value K.
Finds and prints all pairs whose sum equals K.
Output Rules:
Print each pair in format:
(a, b)
Each pair in new line.

Example:
Input:
Array: 1 4 15 6 10 2
K = 16
Output:
(1, 15)
(6, 10)
 */

package day3;

import java.util.HashSet;
import java.util.Scanner;

public class SumPairs {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("array length:");
        int n=inp.nextInt();

        int[] arr=new int[n];
        System.out.println("Array:");
        for(int i=0;i<n;i++){
            arr[i]=inp.nextInt();
        }

        System.out.println("enter key=");
        int k=inp.nextInt();

        HashSet<Integer> sum=new HashSet<>();

        System.out.println("output:");
        for(int x: arr){
            if (sum.contains(k - x)) {
                System.out.println("("+x+", "+(k-x)+")");
            }
            sum.add(x);
        }
    }
}
