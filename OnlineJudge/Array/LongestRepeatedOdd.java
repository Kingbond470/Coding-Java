/*
https://oj.masaischool.com/contest/1048/problem/4

Longest Repeated Odd

Description

You are given an array A of N integers. Your task is to find the maximum number of times an odd number is continuously repeated in the array.

Input

Input Format

First line contains N which is the number of element present in the array.

Second line contains N integers which are the values of array.

Constraints

N<100

Output

Output Format

Output one integer which the maximum number of times an odd number is repeated in array.

Sample Input 1

12
1 1 1 1 2 2 2 2 2 1 1 1

Sample Output 1

4

Hint

Sample 1 Explanation

1 is repeated 4 times from index 0 to index 3 => 4 times

2 is repeated 5 times from index 4 to index 8 => 5 times

1 is repeated 3 times from index 9 to index 11 => 3 times

So, the output is 4 since 1 is odd.

*/

// issue is number should be same
import java.util.Scanner;
public class Main{
  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }
   int count=0; 
    int max_count=0;
    for(int i=0; i<arr.length; i++){
      if(arr[i]%2==1){
              if(i==0){
                count++;
              }
              else if(arr[i]==arr[i-1]){
                if(count==0){
                  count=1;
                }
              count++;
            }
            else{
                        count=0;
                      }   
      }
      else{
        count=0;
      }
      if(count>max_count){
        max_count=count;
      }
    }
    System.out.println(max_count);
    
  }
}
