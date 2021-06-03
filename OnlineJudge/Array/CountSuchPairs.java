/*
https://oj.masaischool.com/contest/1041/problem/4

Count such pairs

Description

You are given an array A of N integers along with a target integer. Your task is to find out the number of pairs of integers present in the array whose sum is equal to the target value.

Input

Input Format :

First line contains 2 integers: N and the target respectively.

Second line contains N integers which are the elements of the array.

Constraints :

N<100

Output

Print one number which is number of such pairs.

Sample Input 1

5 9
3 0 6 2 7

Sample Output 1

2


*/
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int sum=sc.nextInt();
    
    int[] arr=new int[size];
    for(int i=0; i<size; i++){
      arr[i]=sc.nextInt();
    }
    int count=0;
    for(int i=0; i<size; i++){
     for(int j=i; j<size; j++){
      if(arr[i]+arr[j]==sum && i!=j){
        count=count+1;
      }
     }
    }
    System.out.println(count);
  }
}
