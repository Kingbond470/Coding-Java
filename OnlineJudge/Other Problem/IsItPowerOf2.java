/*
https://oj.masaischool.com/contest/1048/problem/8

is it a power of 2

Description

Given a number n, print YES if it is a power of 2 else print NO.

Input

1<=T<=10

1<=N<=100000000

Output

output a single integer, the answer to the question.

Sample Input 1

3
1
2
100

Sample Output 1

YES
YES
NO
*/
//Enter code here
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0; i<t; i++){
      int n=sc.nextInt();
      boolean value=false;
      if((n&n-1)==0){
        value=true;
      }
      
      if(value){
        System.out.println("YES");
      }
      else{
        System.out.println("NO");
      }
    }
  }
}
