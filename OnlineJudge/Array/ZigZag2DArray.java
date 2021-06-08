/*
https://oj.masaischool.com/contest/1085/problem/3

Go in Zig-Zag

Description

Given a matrix with n rows and m columns. Print the matrix elements starting from the top right corner and follow a zig-zag pattern.

Look at the image for better understanding

Image

Input

Input Format

First line contains n and m

Next n line contains m space separated integers which describe each row of the 2d array

Constraints

n,m <=50

Output

Print all matrix elements in a single line separated by spaces.

Sample Input 1

5 5
4 7 1 1 7
8 9 9 6 1
6 4 9 5 1
7 7 4 7 7
8 6 2 5 5

Sample Output 1

7 1 1 7 4 8 9 9 6 1 1 5 9 4 6 7 7 4 7 7 5 5 2 6 8


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
    for(int i=0; i<row; i++){
      if(i%2==0){	//if row is even then col starts from last and goes to first
        for(int j=col-1; j>=0; j--){
          System.out.print(arr[i][j]+" ");
        }
      }
      else{			//if row is odd then col starts from first and goes to last
        for(int j=0; j<col; j++){
          System.out.print(arr[i][j]+" ");
        }
      }
    }
    // i need to check for whitespace it's printing extra there
  }
}
      
