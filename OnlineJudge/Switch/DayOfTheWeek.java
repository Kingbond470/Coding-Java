/*
Day of the Week
https://oj.masaischool.com/contest/1048/problem/6

Description

Given the current day, and a number N, find what day will it be after N days.

Note:Current day will be from the set ->{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}

Input

The first line of the input contains the name of the current day.

The second line of the input contains N.

Constraints

1 <= N <= 1000

Output

Print the name of the day, which will occur after N days.

Sample Input 1

Wednesday
8

Sample Output 1

Thursday

Hint

In the sample test case, the current day is Wednesday. After N = 8 days, it will be Thursday.

*/

//Enter code here
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String day=sc.nextLine();
    int n=sc.nextInt();
    int day_no=0;
    switch(day){
      case "Monday":
        day_no=0;
        break;
      case "Tuesday":
        day_no=1;
        break;
      case "Wednesday":
        day_no=2;
        break;
      case "Thursday":
        day_no=3;
        break;
      case "Friday":
        day_no=4;
        break;
      case "Saturday":
        day_no=5;
        break;
      case "Sunday":
        day_no=6;
        break;
      default:
        break;
    }
    int value=day_no+n;
    int remainder=value%7;
    String new_day="";
    switch(remainder){
      case 0:
        new_day="Monday";
        break;
      case 1:
        new_day="Tuesday";
        break;
      case 2:
        new_day="Wednesday";
        break;
      case 3:
        new_day="Thursday";
        break;
      case 4:
        new_day="Friday";
        break;
      case 5:
        new_day="Saturday";
        break;
      case 6:
        new_day="Sunday";
        break;
      default:
        break;
    }
    System.out.println(new_day);
  }
}
