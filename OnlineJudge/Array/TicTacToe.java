/*

https://oj.masaischool.com/contest/1085/problem/5

Result or Tie - Tic Tac Toe

Description

You are given a 3*3 matrix (2-dimensional array) that represents the final situation of a Tic Tac Toe.

Your task is to write a program that finds out the winner in case the match ended in a win. If the winner is 'x', print 'x'(without quotes).

If the winner is 'o', print 'o' (without quotes)

In case the match ended in a tie, print "Tie" (without quotes)

Input

InputFormat

The input contains 3 lines where each line has 3 space separated characters which represent the final status of tic tac toe

Constraints

The input contains either of the 2 alphabets: 'x' and 'o'

Output

Print Tie/x/o depending on the end result of the game.

Sample Input 1

x o x
o x x
o o o

Sample Output 1

o`


*/
//Enter code here
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String[][] str=new String[3][3];
    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        str[i][j]=sc.next();
      }
    }
        if(str[0][0].equals(str[0][1]) && str[0][1].equals(str[0][2])){
				System.out.print(str[0][0]);
        }
           else if(str[1][0].equals(str[1][1]) && str[1][1].equals(str[1][2])){
				System.out.print(str[1][0]);
        }
         else if(str[2][0].equals(str[2][1]) && str[2][1].equals(str[2][2])){
				System.out.print(str[2][0]);
        }  
   		 else if(str[0][0].equals(str[1][0]) && str[1][0].equals(str[2][0])){
				System.out.print(str[0][0]);
        }
        else if(str[0][1].equals(str[1][1]) && str[1][1].equals(str[2][1])){
				System.out.print(str[0][1]);
        }
         else if(str[0][2].equals(str[1][2]) && str[1][2].equals(str[2][2])){
				System.out.print(str[1][0]);
        }
         else if(str[0][0].equals(str[1][1]) && str[1][1].equals(str[2][2])){
				System.out.print(str[0][0]);
        }
          else if(str[0][2].equals(str[1][1]) && str[1][1].equals(str[2][0])){
				System.out.print(str[0][2]);
        }
        else{
          System.out.print("Tie");
        }
               
                
                }
                }
          
        
