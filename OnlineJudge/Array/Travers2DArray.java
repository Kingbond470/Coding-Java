/*
https://oj.masaischool.com/contest/1085/problem/1

Traverse a 2D Array

Description

You are given a 2D array(a matrix).

You need to print elements of array in as shown in diagram, on a single line.

Image

Input

First line contains two integers N and M, no of rows and columns of matrix.

Next N lines contains M space separated integers which are elements of matrix.

Constraints

1 <= N*M <= 10^6

1 <= A[i][j] <= 100

Output

Print all elements of matrix on single line, in the order shown in diagram.

Sample Input 1

4 3
1 8 9
2 7 10
3 6 11
4 5 12

Sample Output 1

4 3 2 1 5 6 7 8 12 11 10 9
*/

  //Enter code here
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    int col=sc.nextInt();
    int[][] arr=new int[row][col];
    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
        arr[i][j]=sc.nextInt();
      }
    }
  //  System.out.println(arr[0][0]);
    //for printing the elements
    for(int i=0; i<col; i++){
      for(int j=row-1; j>=0; j--){
        if(i==col-1 && j==0){
          System.out.print(arr[j][i]);
        }
        else{
        System.out.print(arr[j][i]+" ");
        }
      }
    }
    
  }
}
