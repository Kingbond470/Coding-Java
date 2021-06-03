/*
https://oj.masaischool.com/contest/1008/problem/3

Substring under condition

Description

Given a string S, you need to find the count of all contiguous substrings starting and ending with same character.

Input

Input Format :

First and the only line contains a string S

Constraints:

Length of S <= 1000

Output

Output the count

Sample Input 1

abcab

Sample Output 1

7


*/
//Enter code here
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int count=0;
    for(int i=0; i<str.length(); i++){
      for(int j=i; j<str.length(); j++){
        System.out.println(str.substring(i,j+1)); //print all substring(initial value, final value)
        if(str.charAt(i)==str.charAt(j)){
         // System.out.println(str.charAt(i)+" "+str.charAt(j));
         // System.out.println(str.substring(i,j+1));
          count=count+1;
        }
      }
    }
    System.out.println(count);
  }
}
         
