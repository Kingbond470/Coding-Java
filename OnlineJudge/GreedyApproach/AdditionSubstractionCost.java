// https://oj.masaischool.com/contest/1979/problem/2

import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int a=0; a<t; a++){
      int n=sc.nextInt(); 
      int k=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0; i<n; i++) arr[i]=sc.nextInt();
      int min_cost=Integer.MAX_VALUE;
      for(int i=0; i<n; i++){
        int cost=solve(arr, k, arr[i]);
       // System.out.println(cost);
        if(min_cost>cost) min_cost=cost;
      }
      System.out.println(min_cost);
    }
  }
  
  public static int solve(int[] arr, int k, int val){
    int sum=0;
    int[] cost=new int[arr.length];
    for(int i=0; i<arr.length; i++){
      int temp=0;
      if(arr[i]>val) temp=5*(arr[i]-val);
      else temp=3*(val-arr[i]);
      cost[i]=temp;
    }
    Arrays.sort(cost);
    for(int i=0; i<k; i++) sum=sum+cost[i];
    return sum;
  }
}
