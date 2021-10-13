/*
https://oj.masaischool.com/contest/1134/problem/304

Find Pairs 2

Description

You are given an array A of size N, and a integer M.

You need to count total pairs in array whose sum is divisible by M.

Input

First line contains T, no of test cases.

First line of each test case contains N and M, size of array and integer.

Second line of each test case contains N spaced integers of array A.

Constraints

1 <= T <= 10

1 <= M <= 100

3 <= N <= 100

1 <= A[i] <= 1000

Output

Output count of such pairs on new line for each test case.

Sample Input 1

2
3 2
1 3 2
5 4
3 2 2 1 5

Sample Output 1

1
3

Hint

For test case 2. pairs are :- 3 1 , 2 2, 3 5

*/
//Enter code here
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int a=0; a<t; a++){
      int n=sc.nextInt();
      int[] arr=new int[n];
      int m=sc.nextInt();
      for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
      }
      int count=0;
      for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
          if((arr[i]+arr[j])%m==0) count++;
        }
      }
      System.out.println(count);
      
    }// end of test
  }
}
