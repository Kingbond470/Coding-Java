/*
https://oj.masaischool.com/contest/1048/problem/10
Count Possible Pairs

Description

You are given a system of equations:

x^2 + y = n

y^2 + x = m

You have to count, how many there are pairs of integers (x, y) (0 ≤ x, y) which satisfy the system.

Input

Input Format :

A single line contains two integers n, m

Constraints :

1 ≤ n, m ≤ 1000

Output

On a single line print the count

Sample Input 1

9 3

Sample Output 1

1

Hint

Output Explanation :

In the first sample the suitable pair is integers (3, 0)
*/
//Enter code here
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n = sc.nextInt();
    int count=0;
    for(int i=0; i<=m; i++){
      for(int j=0; j<=n; j++){
        int eq1=i*i+j;
        int eq2=i+j*j;
        if(eq1==m && eq2==n){
         // System.out.println(i+" " +j);
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
    
