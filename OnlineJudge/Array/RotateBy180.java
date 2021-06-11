/*
https://oj.masaischool.com/contest/1085/problem/12

Rotate by 180

Description

You are given a square matrix of size N x N. Rotate the matrix by 180 degrees.

Input

The first line of the input contains T, the number of test cases.

The next line contains N, the size of the square matrix.

The next N lines contain N space separated integers, denoting the values of the matrix.

Constraints

1 <= T <= 10

1 <= N <=50

1 <= A[i][j] <= 100

Output

For each test case, print the matrix after rotating 180 degrees, and print in the form as shown in the sample output.

Sample Input 1

2
3 
1 2 3
4 5 6
7 8 9
4
1 2 3 4
5 6 7 8
9 0 1 2
3 4 5 6

Sample Output 1

9 8 7 
6 5 4 
3 2 1 
6 5 4 3 
2 1 0 9 
8 7 6 5 
4 3 2 1 

Hint

In the sample test cases, the matrices have been rotated by 180 degrees.

*/

//Enter code here
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0; i<t; i++){
      int n=sc.nextInt();
      int[][] arr=new int[n][n];
      for(int j=0; j<n; j++){
        for(int k=0; k<n; k++){
          arr[j][k]=sc.nextInt();
        }
      }
      
  	for(int k=n-1; k>=0; k--){
      for(int j=n-1; j>=0; j--){
        System.out.print(arr[k][j]+" ");
      }
      System.out.println();
    }
    }
    
  }
}
