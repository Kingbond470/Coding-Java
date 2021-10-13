// https://oj.masaischool.com/contest/1134/problem/106
/*

X smallest even frequency

Description

You are given a 2D array with N rows and N columns, having positive integers. X is defined as the collection elements of the left diagonal and right diagonal of the array. Check if the frequency of the smallest element of X is even or not.

Input

    First line: Single integer denoting the value of T - the number of test cases.

    For each test case:

    First line: Single integer denoting the value of N.

    N lines follow:

    Each of the lines consists of N single space-separated integers, denoting a row of a matrix.

        Constraints:

    1 <= T <= 10
    1 <= N <= 50
    The value any of array element doesn't exceed 100.

Output

For each test case, print in a new line, "yes" (without quotes) if the frequency of the smallest element of X is even. Else print "no"(without quotes).

Sample Input 1

1
2
1 4
4 1

Sample Output 1

yes

Hint

Given the test case,

Test 1:

N = 2, and given 2D array:

1  4

4  1

The left diagonal contains 1 1.

The right diagonal contains 4 4.

Hence the smallest element in X is 1. Since 1 appears twice in X, which is even, hence the answer is yes.
*/
import java.util.ArrayList;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int a=0; a<t; a++){
      //taking input
      int n=sc.nextInt();
	  int[][] arr=new int[n][n];
      for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
          arr[i][j]=sc.nextInt();
        }
      }
      //logic 
      //left diagonal i==j and right is i+j=length-1
      ArrayList<Integer> list=new ArrayList<>();
      for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
          if(i==j) list.add(arr[i][j]);
          else if(i+j==n-1) list.add(arr[i][j]);
        }
      }
    //  System.out.println(list);
      int small_value=list.get(0);
      for(int i=0; i<list.size(); i++){
        if(list.get(i)<small_value) small_value=list.get(i);
      }
      int max_count=0;
      for(int i=0; i<list.size(); i++){
        if(list.get(i)==small_value) max_count++;
      }
      System.out.println(max_count%2==0? "yes":"no");
    }//end of test case
  }
}
            
