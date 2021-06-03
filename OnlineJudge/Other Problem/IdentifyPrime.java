/*

https://oj.masaischool.com/contest/1041/problem/3

Identify Prime

Description

You are provided an integer N, print "Yes" (without quotes) if the given integer is prime, else print "No" (without quotes).

Input

Input Format

First and the only integer contains N.

Constraints

N<100000

Output

Output Format

Output Yes or No depending on the conditions mentioned above.

Please note that the case of each character matters.


Sample Input 1

13

Sample Output 1

Yes

Hint

Sample 1 Explanation

Since 13 is a prime number, the output is Yes.

*/
//Enter code here
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean value=true;
    for(int i=2; i<n; i++){
      if(n%i==0){
        value=false;
      }
    }
   String result= value? "Yes" :"No";
    System.out.println(result);
    
  }
}
