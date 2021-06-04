/*
https://oj.masaischool.com/contest/1048/problem/9

Make array even

Description

Given an array, you are allowed to do a single kind operation as many times as you want, choose 2 coordinates i, j

and reassign , ai = aj . Can you make the Sum of the array even. print YES or NO

Input

1<=T<=10

1<=N<=100000

0<=Ai<=100000

Output

output YES or NO as the question states

Sample Input 1

2
1
2
3
1 2 3

Sample Output 1

YES
YES


*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int i=0; i<testCase; i++) {
            int len = sc.nextInt();
            int[] ar = new int[len];
            boolean b = false;
            for(int j=0; j<len; j++) {
                ar[j] = sc.nextInt();
            }
            int sum = Arraysum(ar);
            if(sum%2==0) {
                b = true;
            }
            else {
              for(int j=0; j<len; j++) {
                if(ar[j]%2==0) {
                  b=true;
                }
              }
            }
            if(b) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
    public static int Arraysum(int[] ar) {
        int sum = 0;
        for(int i=0; i<ar.length; i++) {
            sum+=ar[i];
        }
        return sum;
    }
   
}
