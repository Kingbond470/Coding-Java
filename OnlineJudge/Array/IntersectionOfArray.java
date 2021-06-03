/*
https://oj.masaischool.com/contest/1041/problem/5

Intersection of Array

Description

You are given 2 arrays of N integers. Your task is to write a program that finds the one integer which is common in both arrays.

Note: There is always one integer common in both arrays.

Input

Input Format

First line of input contains N

Second line contains N space separated integers making the first array

Third line contains N space separated integers making the second array


Constraints

N<1000

Output

Output Format

Output that one integer which is common in both arrays

Sample Input 1

3
4 5 7
9 2 5

Sample Output 1

5


*/
//Enter code here
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    int[] arr1=new int[n];
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0; i<n; i++){
      arr1[i]=sc.nextInt();
    }
    
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr1.length; j++){
        if(arr[i]==arr1[j]){
          System.out.println(arr[i]);
        }
      }
      }
      
    }
  }
