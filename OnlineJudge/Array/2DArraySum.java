/*
2D Array and Sum

Description

You are given an array of n rows and m columns which contains positive integers and sum s

You need to find occurrences of the sum of three consecutive numbers (i.e x,y, and z ) whose sum is equal to s appear horizontally, vertically and diagonally in the given matrix.

Image

Input

Input Format

First line: Three integers n, m and s, where n denotes the number of rows, m denotes the number of columns in the matrix and s is the sum.

Next n lines: Each line contains m characters which contain positive integers only.

Constraints

1 <= n,m < 10

1 <= s <= 50

Output

Print the number of times the sum s appear in the matrix.

Sample Input 1

3 3 6
3 2 1
2 2 2
1 5 1

Sample Output 1

4

Hint

Sample 1 Explanation

here s is 6 presents 4 times( 2 Horizontal + 1 Vertical + 1 Diagonal)
La
*/

import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();			//row
    int m=sc.nextInt();			//col
    int s=sc.nextInt(); 		//sum
    int[][] arr=new int[n][m];

    for(int i=0; i<n; i++){			//user input
      for(int j=0; j<m; j++){
        arr[i][j]=sc.nextInt();
      }
    }

    int count=0;

    //row-wise sum
    for(int i=0; i<n; i++){
      for(int j=0; j<m-2; j++){
      if(arr[i][j]+arr[i][j+1]+arr[i][j+2]==s){
        count++;
      //  System.out.println("yes-1");
      }
        //col-wise sum
        if(arr[j][i]+arr[j+1][i]+arr[j+2][i]==s){
          count++;
       //   System.out.println("yes-2");
        }
     }
    }

    //diagonal element sum
    for(int i=0; i<n-2; i++){
      for(int j=0; j<m-2; j++){
        if(arr[i][j]+arr[i+1][j+1]+arr[i+2][j+2]==s){
          count++;
       //   System.out.println("Yes-3");
        }
      }
      //col-wise
      for(int j=m-1; j>=2; j--){
        if(arr[i][j]+arr[i+1][j-1]+arr[i+2][j-2]==s){
          count++;
         // System.out.println("yes-4");
        }
      }
    }
    
    
    
    System.out.println(count);
  }
}
