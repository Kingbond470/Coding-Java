/*
https://oj.masaischool.com/contest/1134/problem/205
Verify Pal or Not

Description

Given 2 strings of N length (equal length), when we concatenate these 2 strings check whether the final string so formed is a palindrome or not. Output "yes" if the final string so formed is a palindrome else "no"


Note: String contains lowercase English alphabet

e.g.:

abc

cba

Upon concatenation the final string will be "abccba" , it is a palindrome , so output will be "yes"

Input

Input Format:

First line of input contains the number N , denoting the length of each string

Second line of input contains the string S1

Third line contains another string S2

Constraints:

1<=N<=500

Output

Output "yes" or "no"

Sample Input 1

3
abc
def

Sample Output 1

no

Sample Input 2

4
abba
abba

Sample Output 2

yes

*/
//Enter code here, check for space and length null string
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.nextLine();
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    
    s1=s1.replace(" ","");
      s2=s2.replace(" ", "");
   // System.out.println(s1+s2);
  
    String str="";
    str=str+s1+s2;
   // System.out.println(str);
    String new_str="";
    for(int i=str.length()-1; i>=0; i--)
    {
      new_str=new_str+str.charAt(i);
    }
  //  System.out.println(new_str);
    System.out.println(new_str.equals(str)? "yes":"no");
  }
}
