/*
https://oj.masaischool.com/contest/977/problem/1

Sum Related Problem

Description

You are given a number N, find sum of all even numbers which occur before N (inclusive of N if N is even)

Input

Input Format

First and the only line contains one number N.

Constraints

N<10000

Output

Output Format

Output one number which is sum (under above condition)

Sample Input 1

8

Sample Output 1

20


*/

//Enter code here
// find the sum of all number exclusive to n... now check n is even if yes then add otherwise print the sum
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    for(int i=1; i<n; i++){
      if(i%2==0){
        sum=sum+i;
      }
    }
    if(n%2==0){
      sum=sum+n;
    }
   System.out.print(sum);
  }
}
