/*
https://oj.masaischool.com/contest/1085/problem/7

Rotate By 90

Description

Given a square matrix, turn it by 90 degrees in an anti-clockwise direction

Input

Input Format

First line will contain the number of rows n (same as the number of columns)

After that next n lines will n rows of the matrix.

Constraints

n<=1000

Elements Of the Matrix <= 10000


Output

You have to display the rotated matrix.

Sample Input 1

4
1 2 3 4
5 6 7 8
1 2 3 4
5 6 7 8

Sample Output 1

4 8 4 8
3 7 3 7
2 6 2 6
1 5 1 5


*/
//Enter code here
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    int col=row;
    int[][] arr=new int[row][col];
    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
        arr[i][j]=sc.nextInt();
      }
    }
    
   // int[][] new_arr=new int[row][col];
    for(int i=col-1; i>=0; i--){
      for(int j=0; j<row; j++){
        System.out.print(arr[j][i]+" ");
      }
      System.out.println();
    }
    
  }
}
        
