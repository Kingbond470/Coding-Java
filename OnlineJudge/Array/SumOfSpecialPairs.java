/*
https://oj.masaischool.com/contest/1048/problem/1

Sum of Special Pairs

Description

You are given an array A of N integers. Write a program to find the sum of the absolute difference between all such pairs (A[i], A[j]) such that i < j and ( j-i ) is prime.

Input

Input Format :

First line contains N

Second line contains N space separated integers which are elements of A

Constraints :

N<1000

Output

Output one number as per condition mentioned above

Sample Input 1

6
1 2 3 5 7 12

Sample Output 1

45


*/
import java.util.Scanner;
class Main{
  public static boolean prime(int num){
   if(num<=1){
     return false;
   }
    for(int i=2; i<num; i++){
      if(num%i==0){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] ar=new int[n];
    for(int i=0;i<n;i++){
      ar[i]=s.nextInt();
    }
    int sum=0;
    for(int i=0;i<n-1;i++){
      
      for(int j=i+1;j<n;j++){
        if(prime(j-i)){
          int str = ar[i] - ar[j];
           str = Math.abs(str);
          sum=sum+str;
        }
      }
    }
    System.out.print(sum);
  }
}
