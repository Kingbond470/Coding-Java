/*
https://oj.masaischool.com/contest/1048/problem/7

Rotate the array - easy version

Description

You are given an array of n elements and an integer k, you need to rotate the array by k units towards right direction ( => ).

Input

1<=T<=10

1<=N<=1000, 0<=K<=1000

1 <= Ai <= 1000000

Output

out put N elements, elements of the array , rotated by K units

Sample Input 1

3
3 1
1 2 3
2 2
1 2
2 3
1 2

Sample Output 1

3 1 2
1 2
2 1

*/

import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0; i<t; i++){
      int n=sc.nextInt();
      int rotate=sc.nextInt();
      int[] arr=new int[n];
      for(int j=0; j<n; j++){
        arr[j]=sc.nextInt();
      }
     
      for(int j=0; j<rotate; j++){
        int last=arr[arr.length-1];		// for last element value
        for(int k=arr.length-1; k>0; k--){
          int temp=arr[k];			//using swap concept
          arr[k]=arr[k-1];
          arr[k-1]=temp;
        }
        arr[0]=last;		// putting in first element value
      }
      for(int a:arr){
        System.out.print(a+" ");
      }
      System.out.println();
    
    }
  }
}
        
