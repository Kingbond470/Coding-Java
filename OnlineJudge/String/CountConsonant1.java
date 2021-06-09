/*
https://oj.masaischool.com/contest/991/problem/9

Count Consonant

Description

You are provided a string S. Your task is to write a program that counts the number of consonants (non-vowels characters) present in the string.

Input

Input Format:

First-line contains a string S

Constraints:

Length of String is always lesser than 1000

Output

Output one number which is the count of number of consonants present in the string.

Sample Input 1

masaischool

Sample Output 1

6


*/
//You are provided a string S. Your task is to write a program that counts the number of consonants (non-vowels characters) present in the string.
import java.util.Scanner;
public class Main{ 
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int count=0;
    for(int i=0; i<str.length(); i++){
      if(str.charAt(i)!='a' && str.charAt(i)!='e' && str.charAt(i)!='i' && str.charAt(i)!='o' && str.charAt(i)!='u' && str.charAt(i)!='A' && str.charAt(i)!='E' && str.charAt(i)!='I' && str.charAt(i)!='O' && str.charAt(i)!='U'){
count++;
      }
    }
    System.out.println(count);
  }
}
