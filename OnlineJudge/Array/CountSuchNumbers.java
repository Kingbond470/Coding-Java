/*
https://oj.masaischool.com/contest/1134/problem/504

Count such numbers

Description

You are given an array of N integers.

You need to find total number of prime numbers in array.

Input

First line contains T, no of test cases.

First line of each test case contains N, size of array

Second line of each test case contains N spaced integers, of array.

Constraints

1 <= T <= 10

1 <= N <= 100

1 <= A[i] <= 1000

Output

For each test case,print total number of prime numbers in array.

Sample Input 1

2
3
1 2 3
5
2 2 2 2 1

Sample Output 1

2
4

*/
//Enter code here
import java.util.Scanner; 
public class Main{
  public static boolean checkPrime(int n){
    boolean value =true;
    if(n<=1) value=false;
    else{
      for(int i=2; i<n; i++){
        if(n%i==0) value=false;
      }
    }
    return value;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int a=0; a<t; a++){
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
      }
      
      int count=0;
      for(int i=0; i<n; i++){
        if(checkPrime(arr[i])) count++;
           }
          System.out.println(count);
           }
           
           }
           
           }
      
