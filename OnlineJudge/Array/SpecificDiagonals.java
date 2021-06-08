/*
Specific Diagonals

Description

Given a matrix which contains distinct integers and you are given an integer and you need to print both the diagonals crossing through the given element , you can always assume that the given element always exist in the matrix.


image.png


In this 4*4 Matrix, suppose we need to print the diagonal of 11, So the output will be :
1 6 11 16

8 11 14

Note: You need to print the diagonal from top to bottom also make sure you print the diagonals going from left to right first then diagonal going right to left, and print both the diagonals in a new line.

Input

The first line of input will contain two integers R and C , denoting the Rows and Columns of the Matrix.

Next R (rows) lines contain C integers each denoting the matrix elements.

The next line will contain an integer K, denoting the element for which we need to print the diagonals.


Constraints:
1<= R, C <= 100

1<= Matrix[i][j] <= 10^4

1<= K <= 10^4

Output

Output both the diagonals containing the given element , print both the diagonals in a new line and from top to bottom order.

Sample Input 1

3 3
1 2 3
4 5 6
7 8 9
6

Sample Output 1

2 6
6 8

Hint

In Sample 1:
R = 3, C = 3

we need to print the diagonals of 6, also we are printing diagonals from top to bottom and left to right first then right to left , So output will be

2 6 -> left to right diagonal and from top to bottom order

6 8 -> right to left diagonal and from top to bottom order

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
    
    int find=sc.nextInt();
   	int index_i=0;
    int index_j=0;
    boolean value=false;
    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
        if(find==arr[i][j]){			//to find the element exist or not
          index_i=i;
          index_j=j;
          value=true;
        }
      }
    }
	
    if(value){
      LeftToRightDiagonal(arr, index_i, index_j);
      System.out.println();
      RightToLeftDiagonal(arr, index_i, index_j);
    }
    else{
      System.out.println("element does not exist");
    }
    
  }//end of main
  public static void LeftToRightDiagonal(int[][] arr, int index_i, int index_j){
    if(index_i>=index_j){
      index_i=index_i-index_j;
      index_j=0;
    }
    else if(index_j>index_i){
      index_j=index_j-index_i;
      index_i=0;
    }
    
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[i].length; j++){
        if(i==index_i && j==index_j){
        System.out.print(arr[i][j]+" ");
        index_i++;
        index_j++;
      }
      }
    }
  }
  
  
  // right to left
  public static void RightToLeftDiagonal(int[][] arr, int index_i, int index_j){
    int sum=index_i+index_j;
  for(int i=0; i<arr.length; i++){
	for(int j=0; j<arr[i].length; j++){
      if(sum==i+j){
        System.out.print(arr[i][j]+" ");
      }
    }
  }
  }
  
}
