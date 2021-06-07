/*
https://oj.masaischool.com/contest/991/problem/1

Tickets Booking

Description

You are provided price of three different types of ticket: 1st Class, 2nd class and 3rd class.

Also, you know the number of tickets of each type you need to book. Find total cost you need to pay.

Input

Input Format:

First line contains 3 space separated positive integers which represents prices of 1st class, 2nd class and 3rd class respectively.

Second line contains 3 space separated integers which is the number of tickets you need to buy of 1st class, 2nd class and 3rd class respectively.

Constraints:

All provided numbers <10000

Output

Output one number which is the price of all tickets to be booked.

Sample Input 1

1200 1400 2000
5 6 2

Sample Output 1

18400


*/
//Enter code here
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int first_class=sc.nextInt();
    int second_class=sc.nextInt();
    int third_class=sc.nextInt();
    sc.nextLine();
    int no_first=sc.nextInt();
    int no_second=sc.nextInt();
    int no_third=sc.nextInt();
    
    long totalcost=0;		//should use L/l
    totalcost=first_class*no_first+second_class*no_second+third_class*no_third;
    System.out.print(totalcost);
  }
}
    
    
