/*
Question 2: Maximum Difference Between Two Elements in Array

Write a Java program that:
Reads an array from standard input.
Finds the maximum difference between two elements such that the larger element appears after the smaller element.

Example 1:
Input:2 3 10 6 4 8 1
Output:8
Explanation: Difference between 10 and 2

Example 2:
Input:7 9 5 6 3 2
Output:2
Explanation: Difference between 9 and 7
 */

package day4;

import java.util.Scanner;

public class LargestDiffBwElements {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("enter length:");
        int n=inp.nextInt();
        System.out.println("enter array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=inp.nextInt();
        }

        int max=Integer.MIN_VALUE,min=arr[0],index=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
            for(int j=0;j<index;j++){
                if (arr[j]<min){
                    min=arr[j];
                }
            }
        }
        System.out.println("output: "+(max-min));
    }
}
