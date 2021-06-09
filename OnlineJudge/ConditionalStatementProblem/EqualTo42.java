/*
https://oj.masaischool.com/contest/991/problem/5

Equal to 42 or not!

Description

You are given an array of N integers. Output "Yes" if 42 is present in array, else print "No".

Input

Input Format :

First line contains number of integers N present in the array.

Second line contains  N  space separated integers.

Constraints :

N<100

Output

Output Yes/No based on condition mentioned above.

Sample Input 1

5
3 7 0 9 8

Sample Output 1

No


*/
//Enter code here
//You are given an array of N integers. Output "Yes" if 42 is present in array, else print "No".
import java.util.Scanner;
public  class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int[] arr=new int[size];
    
    for(int i=0 ; i<size; i++){
      arr[i]=sc.nextInt();
    }
    boolean value=false;
    for(int i=0; i<size; i++){
      if(arr[i]==42){
        value=true;
      }
    }
    String result= value ? "Yes" : "No";
    System.out.println(result);
    
  }
}
