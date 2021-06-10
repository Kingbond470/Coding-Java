/*
2D Array and Phrase

Description

You are given an array of n rows and m columns which contains lower case English letters. How many times does the phrase "saba" appear horizontally, vertically, and diagonally in the grid?

OJ2.png

Input

Input Format

First line: Two integer n and m, where n denotes the number of rows and m denotes the number of columns in the grid

Next n lines: Each line contains m characters which contains lower-case English letters only

Constraints

1 <= n,m <= 100

Output

Output Format

Print the number of times the word “saba” appears in the grid.

Sample Input 1

5 5
safer
amjad
babol
aaron
songs

Sample Output 1

2


*/
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();			//row
    int m=sc.nextInt();			//col
    String s="saba"; 		//sum
    char[][] arr=new char[n][m];
	sc.nextLine();
    for(int i=0; i<n; i++){
    String value=sc.nextLine();
    // char[] new_ar=value.toCharArray();
    for(int j=0; j<m; j++){
       arr[i][j]=value.charAt(j);
      // System.out.print(arr[i][j]);
     }
   }

     int count=0;
    String add="";
    for(int i=0; i<n; i++){
      for(int j=0; j<m-3; j++){
        add=add+arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i][j+3];
        if(add.equals(s)){
          count++;
          add="";
        }
        else {
          add="";
        }
      }
    }
    
      for(int i=0; i<m; i++){
      for(int j=0; j<n-3; j++){
        add=add+arr[j][i]+arr[j+1][i]+arr[j+2][i]+arr[j+3][i];
        if(add.equals(s)){
          count++;
          add="";
        }
        else {
          add="";
        }
      }
      }
        
    for(int i=0; i<n; i++){
      for(int j=0; j<m-3; j++){
        if(i<n-3){
          add=add+arr[i][j]+arr[i+1][j+1]+arr[i+2][j+2]+arr[i+3][j+3];
          if(add.equals(s)){
            count++;
            add="";
            }
          else{
            add="";
          } 
        }
      }
    }
        
    for(int i=0; i<n; i++){
      for(int j=0; j<m-3; j++){
       	if(i>2){
          add=add+arr[i][j]+arr[i-1][j+1]+arr[i-2][j+2]+arr[i-3][j+3];
          if(add.equals(s)){
            count++;
            add="";
          }
          else{
            add="";
          }
        }
      }
    }
        
     
    
   System.out.println(count);
  }
}
