/*
https://oj.masaischool.com/contest/977/problem/2

Breaking a record

Description

You are provided current highest score ever scored in a cricket match. You are also given runs made by Sachin(Tendulkar) in a match. Print "Broken" (without quotes)if Sachin breaks current record in that match, else print "Not Yet" (without quotes) if he could not break that record. In all other cases, print "Wao" (without quotes)

Input

Input Format:

First line contains 2 space separated positive integers where first integer represents the current highest score and second integer represents score made by Sachin in that match.

Constraints:

Both scores < 10000

Output

Output one string based on the conditions mentioned

Sample Input 1

264 200

Sample Output 1

Not Yet


*/
//Enter code here
// take user input, highest and current score, compare using conditional statement and print it
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int high_score=sc.nextInt();
    int current_score=sc.nextInt();
    if(current_score> high_score){
      System.out.print("Broken");
    }
    else if(current_score<high_score){
      System.out.print("Not Yet");
    }
    else{
      System.out.print("Wao");
    }
  }
}
