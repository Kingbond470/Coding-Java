/*
https://oj.masaischool.com/contest/1085/problem/6

Transpose the Matrix

Description

The transpose of a matrix is an operator which flips a matrix over its diagonal, that is it switches the row and column of the matrix by producing another matrix.

See sample test case for better understanding

So, given an array of n rows and m columns, generate the transpose of the matrix.

Input

Input Format:

First line contains two integers n and m

Next n lines contain m integers which represents each row of 2d array

Constraints:

n,m <= 500

Output

Print the transposed array

Sample Input 1

5 4
0 0 0 0
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4

Sample Output 1

0 1 2 3 4 
0 1 2 3 4 
0 1 2 3 4 
0 1 2 3 4 


*/
//Enter code here
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    int col=sc.nextInt();
    int[][] arr=new int[row][col];
    for(int i=0; i <row; i++){
      for(int j=0; j<col; j++){
        arr[i][j]=sc.nextInt();
      }
    }
	
    int[][] new_arr=new int[col][row];
    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
        new_arr[j][i]=arr[i][j];
      }
    }
    
    for(int i=0; i<col; i++){
      for(int j=0; j<row; j++){
        System.out.print(new_arr[i][j]+" ");
      }
      System.out.println();
    }
 
  }
}
