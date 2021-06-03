/*
https://oj.masaischool.com/contest/1008/problem/1

Masai Sentence Reversal

Description

You are provided with a sentence S, your task is to write a program that reverses the order/sequence in which words are present in the sentence keeping the case of each character preserved (upper case character should remain upper and lower case character is lower case). (Refer to the sample test case for better understanding)

Try using the stack data structure

DO NOT ANY BUILT-IN FUNCTION FOR REVERSING A STRING

Input

Input Format

You are provided with a sentence having one or more than one word.

Constraints

At least one word is present in the string


Output

Output the sentence by reversing the sequence of words

Sample Input 1

A Transformation in education

Sample Output 1

education in Transformation A

Hint

Sample 1 Explanation

The sentence has been reversed in the sense that the sequence in which the words were present in the initial sentence is reversed.

Also, there is no change in the case of characters present in the sentence.



*/
//Enter code here
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String[] new_str=str.split(" ");
    
    for(int i=new_str.length-1; i>=0; i--){
      System.out.print(new_str[i]+" ");
    }
   
  }
}
