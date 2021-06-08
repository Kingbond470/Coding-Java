/*

Traverse a 2d array - 3

Description

Given a 2D Array, Traverse the 2D array from right to left, and from up to down.

Refer the following image given below for better understanding.

Screenshot (93).png

Input

First line contains two integers N and M, no of rows and columns of matrix.

Next N lines contains M space separated integers which are elements of matrix.

Constraints

1 <= N*M <= 10^6

1 <= A[i][j] <= 100

Output

Print all elements of matrix on single line, in the order as given in the problem statement.

Sample Input 1

4 3
1 8 9
2 7 10
3 6 11
4 5 12

Sample Output 1

9 10 11 12 8 7 6 5 1 2 3 4


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
  
  //printing the element
  for(int i=col-1; i>=0; i--){
    for(int j=0; j<row; j++){
      if(i==0 && j==row-1){
        System.out.print(arr[j][i]);
      }
      else{
        System.out.print(arr[j][i]+" ");
      }
    }
  }
  
}
}
