/*
https://oj.masaischool.com/contest/1041/problem/1

Odds of Odds

Description

Given an array A with n integers, find out whether the count of odd elements is odd.

If exists, then print "Yes" else "No".

Input

The first line of the input contains one integer t (1 ≤ t ≤ 1000) — the number of test cases. Then t test cases follow.

The first line of each test case contains a single integer n (1 ≤ n ≤ 1000) — the number of elements in the array A.

The second line of each test case contains n integers (1 ≤ Ai ≤1000).

Output

For each test case, print the answer.

Sample Input 1

3
1
1
2
1 101
2
1 200

Sample Output 1

Yes
No
Yes


*/
//Enter code here
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt(); 
    for(int i=0; i<t; i++){
      int n=sc.nextInt();
      int[] arr=new int[n];
      int count=0;
      for(int j=0; j<n; j++){
        arr[j]=sc.nextInt();
      
      
      for(int j=0; j<n;j++){
        if(arr[j]%2==1){
          count=count+1;
        }
      }
      String result = count%2==1 ? "Yes" :"No";
      System.out.println(result);
    }
    }
  }
