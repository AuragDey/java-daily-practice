/*
Question 4: Find Common Elements in Three Sorted Arrays

Write a Java program that:
Reads three sorted arrays (non-decreasing order).
Prints all common elements present in all three arrays.
Output Rules:
Print elements separated by comma or space.
No extra message.

Example:

Input:
ar1 = {1, 5, 10, 20, 40, 80}
ar2 = {6, 7, 20, 80, 100}
ar3 = {3, 4, 15, 20, 30, 70, 80, 120}

Output: 20 80
 */

package day3;

import java.util.Scanner;

public class CommElementsInArray {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("enter 3 lengths of array:");
        int a=inp.nextInt();
        int b=inp.nextInt();
        int c= inp.nextInt();

        int[] ar1=new int[a];
        System.out.println("ar1:");
        for(int i=0;i<a;i++){
            ar1[i]=inp.nextInt();
        }

        int[] ar2 =new int[b];
        System.out.println("ar2:");
        for(int i=0;i<b;i++){
            ar2[i]=inp.nextInt();
        }

        int[] ar3=new int[c];
        System.out.println("ar3:");
        for(int i=0;i<c;i++){
            ar3[i]=inp.nextInt();
        }

        int i=0,j=0,k=0;
        while(i<a && j<b && k<c){
            if(ar1[i]==ar2[j] && ar2[j]==ar3[k]){
                System.out.print(ar1[i]+" ");
                i++;j++;k++;
            }
            else if (ar1[i]<ar2[j]){
                i++;
            }
            else if (ar2[j]<ar3[k]){
                j++;
            }
            else{
                k++;
            }
        }
    }
}
