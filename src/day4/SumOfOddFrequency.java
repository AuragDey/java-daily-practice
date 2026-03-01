/*
Question 3: Sum of Odd Frequency Elements

Write a Java program that:

Reads an array from standard input.
Finds elements with odd frequency.
Calculates and prints the sum of those elements (including repeated occurrences).

Example 1:
Input:1 1 2 2 3 3 3

Output:9
Explanation: 3 occurs 3 times → sum = 3+3+3 = 9

Example 2:
Input:10 20 30 40 40
Output:60
Explanation: 10, 20, 30 occur odd times → sum = 60
 */

package day4;

import java.util.HashMap;
import java.util.Scanner;

public class SumOfOddFrequency {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter array Length:");
        int n=inp.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array:");
        for(int i=0;i<n;i++){
            arr[i]=inp.nextInt();
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int sum=0;
        for(int x:map.keySet()){
            int freq=map.get(x);
            if (freq%2!=0){
                sum=sum+freq*x;
            }
        }

        System.out.println("output:"+sum
        );
    }
}
