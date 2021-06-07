/*
https://oj.masaischool.com/contest/991/problem/2

Pay for Phones!

Description

You are given prices of 4 different mobile phones and also provided with the number of each of the phones that you need to buy.

You have with you 150000 units of money. Comment if it is possible to buy those phones or not.

Input

Input Format :

First line contains 4 space separated positive values which are prices of the 4 mobile phones respectively.

Second line contains the quantity/count of each mobile phones that you need to buy


Constraints :

price of each phone < 100000

Output

Output "Possible" (without quotes) if it is possible to buy desired numbers of mobile phones.

Else in all other case, print "Not Possible" (without quotes)

Sample Input 1

10000 20000 15000 5000
2 3 4 3

Sample Output 1

Not Possible


*/
//Enter code here
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int m1=sc.nextInt();
    int m2=sc.nextInt();
    int m3=sc.nextInt();
    int m4=sc.nextInt();
    sc.nextLine();
    int m1_no=sc.nextInt();
    int m2_no=sc.nextInt();
    int m3_no=sc.nextInt();
    int m4_no=sc.nextInt();
    
    long totalCost=0;
    totalCost=m1*m1_no+m2*m2_no+m3*m3_no+m4*m4_no;
    if(totalCost<=150000){
      System.out.print("Possible");
    }
    else{
      System.out.print("Not Possible");
    }
  }
}
