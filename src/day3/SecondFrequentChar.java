/*
Question 3: Second Most Frequent Character in String

Write a Java program that:
Reads a string from standard input.
Finds the second most frequent character.
Output Rules:
Print exactly in format:
Second most frequent character is 'character'

Example:
Input:aabababa
Output:Second most frequent character is 'b'
 */

package day3;

import java.util.HashMap;
import java.util.Scanner;

public class SecondFrequentChar {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Input:");
        String s=inp.nextLine();
        HashMap<Character,Integer> freqMap=new HashMap<>();

        for(char c:s.toCharArray()){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }

        int maxFreq=0,secondMaxFreq=0;
        char maxFreqChar='\0',secondMaxFreqChar='\0';

        for(char c: freqMap.keySet()){
            int freq=freqMap.get(c);
            if(freq>maxFreq){
                secondMaxFreq=maxFreq;
                secondMaxFreqChar=maxFreqChar;

                maxFreq=freq;
                maxFreqChar=c;
            }
            else if(freq<maxFreq && freq>secondMaxFreq){
                secondMaxFreq=freq;
                secondMaxFreqChar=c;
            }
        }

        System.out.println("Second most frequent character is '" + secondMaxFreqChar + "'");

    }
}
