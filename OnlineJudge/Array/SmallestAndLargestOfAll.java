/*
https://oj.masaischool.com/contest/991/problem/4

Smallest and Largest of all

Description

Given an array, A, of N integers, print the smallest and largest element present in the array

YOU MUST NOT USE ANY BUILT-IN FUNCTION

Input

Input Format

The first line contains an integer, N (the number of integers in A). The second line contains N space separated integers describing A.

Constraints

N<100

Output

Output Format

Print 2 integers in different lines where first integer represents the minimum of all elements and second integer represents the maximum of all

Sample Input 1

4
-2 0 8 4

Sample Output 1

-2
8


*/
//Enter code here
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int[] a=new int[size];
    for(int i=0; i<size; i++){
      a[i]=sc.nextInt();
    }
    
    int max=a[0];
    int min=a[0];
    
    for(int i=0; i<size; i++){
      if(a[i]>max){
        max=a[i];
      }
      if(a[i]<min){
        min=a[i];
      }
    }
    System.out.println(min);
    System.out.println(max);
  }
}
