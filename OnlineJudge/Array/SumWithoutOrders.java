/*
https://oj.masaischool.com/contest/1085/problem/11

Sum without borders

Description

You are given a matrix of size n x m. Find the sum of all the elements of the matrix which do not lie at the border.

Input

The first line contains T, the number of test cases. The first line of each test case contains n and m, the matrix dimensions.

Each of the next n lines contain m space separated integers, denoting the values of the matrix.

Constraints

1 <= T <= 10

1 <= n,m <= 1000

1 <= a[i][j] <= 1000

Output

Print a single integer, denoting the sum of all the elements of the matrix, which do not lie on the border, on a new line.

Sample Input 1

1
3 3 
1 2 3
4 5 6
7 8 9

Sample Output 1

5

Hint

In the sample test case, except for 5 all the elements lie on the border. Therefore, the required sum is 5.

*/

import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0; i<t; i++){
      int n=sc.nextInt();
      int m=sc.nextInt();
      int sum=0;
      int[][] arr=new int[n][m];
      for(int j=0; j<n; j++){
        for(int k=0; k<m; k++){
          arr[j][k]=sc.nextInt();
          if(j==0 || j==n-1 || k==0 || k==m-1){
          //  System.out.println("value");
          }
          else {
            sum=sum+arr[j][k];
          
          }
        }
      }
        System.out.println(sum);
    }
  }
}
            
            
