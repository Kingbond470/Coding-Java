/*
https://oj.masaischool.com/contest/991/problem/6

Detect Palindrome

Description

Given an integer, print "Yes" (without quotes) if that integer is aPalindrome, else print "No" (without quotes)

You must not use the reverse() function. Using that would lead to disqualification

Input

Input Format

You are provided with one integer.

Constraints

The provided integer is always lesser than 1000000

Output

Print Yes or No depending upon the integer.

Sample Input 1

1221

Sample Output 1

Yes

Hint

Sample 1 Explanation

Reading 1221 from either side is same, so Yes, it is a palindrome.
*/
//Given an integer, print "Yes" (without quotes) if that integer is aPalindrome, else print "No" (without quotes)
//You must write a recursive function to achieve this
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   int value=Integer.parseInt(palindrome(n));
    String result= value==n ? "Yes" : "No";
    System.out.println(result);
  }
  public static String palindrome(int n){
    int remainder=0;
    String result="";
    while(n>0){
      remainder=n%10;
     result=result+remainder;
      n=n/10;
    }
    return result;
   // System.out.println(result);
      
}
}
