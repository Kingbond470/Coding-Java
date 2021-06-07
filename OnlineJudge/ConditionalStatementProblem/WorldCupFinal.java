/*
https://oj.masaischool.com/contest/991/problem/3

World Cup Final

Description

You are given 3 parameters of two different cricket teams in World Cup Final.

First parameter  :  Score

Second parameter :  Score in super over

Third parameter  :  Total number of fours scored in the inning.

If first parameter of any one team is greater than other then that team wins.

If first parameter of both the teams are same, then the team whose second parameter is greater wins the match.

In case the second parameter is also same, then the team that has higher value of third parameter wins the game.

Input

Input Format

First line contains the three discussed parameter for New Zealand

Second line contains three discussed parameters for England

Constraints

All parameters < 10000

Output

Output Format

Output "England" (without quotes) if England wins the game, else print "New Zealand" if New Zealand wins the game.

Sample Input 1

241 15 21
241 15 26

Sample Output 1

England


*/

import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       int[] nz = new int[3];
        int[] en = new int[3];
        for(int i=0; i<3; i++) {
             nz[i] = sc.nextInt();
         }
         for(int i=0; i<3; i++) {
             en[i] = sc.nextInt();
         }
         for(int i=0; i<3; i++) {
             if(nz[i]>en[i]) {
                 System.out.println("New Zealand");
               break;
             }
             if(nz[i]<en[i]) {
                 System.out.println("England");
                 break;
             }
             if(i==nz.length-1) {
                 System.out.println("Match tie");
             }
         }
     }
 }
