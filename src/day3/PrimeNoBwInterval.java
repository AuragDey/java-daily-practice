/*
Question 2: Prime Numbers Between Two Intervals

Write a Java program that:
Reads two integers n1 and n2 from standard input.
Prints all prime numbers between n1 and n2.
Output Rules:
Print numbers separated by space.
No extra text.

Example:
Input:2 10
Output:2 3 5 7
 */

package day3;

import java.util.Scanner;

public class PrimeNoBwInterval {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Input:");
        int a=inp.nextInt();
        int b=inp.nextInt();
        for(int i=a;i<=b;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
