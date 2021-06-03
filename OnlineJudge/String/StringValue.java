/*
https://oj.masaischool.com/contest/1041/problem/2

String value!

Description

Given a  string S of all lowercase letters and each letter has a value of its own. The value of the alphabet 'a' is 1, and the value of all other alphabets is the value of its previous alphabet + 1.

Now you have to find the total value of the given string.

Input

Input Format

The first and only line of input contains the String S.

Constraints

1 <= Length of S <= 1000

Output

Print the string value

Sample Input 1

aba

Sample Output 1

4

Hint

Sample 1 Explanation

For example, Consider the String  aba

Here, the first character a has a weight of 1, the second character b has 2 and the third character a again has a weight of 1. So the summation here is equal to : 1+2+1 = 4
Language:

*/

//Enter code here
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int count=0;
    for(int i=0; i<str.length(); i++){
      //int n=(int)str.charAt(i);
      int value=(int)str.charAt(i)-96;
     count=count+value;
    }
    System.out.println(count);
  }
}
