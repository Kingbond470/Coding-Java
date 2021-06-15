/*
Array of Zeroes

Description

You have an array of non-negative integers. You can perform one operation on it in which you can choose i-th index with 0 <= i < n and subtract 1 from both i-th and (i+1) th index of array.

Your task is to write a program that can comment if it is possible to get an array of all zeros after several operations.

Input

Input Format

The first line of test case is a number N. (0 < N <= 10000) The next line is N non-negative integers, 0 <= a_i <= 109

Constraints

0 < N <= 10000

Output

Output Format

If it can be modified into all zeros with several operations output “YES” in a single line, otherwise output “NO” instead.

Sample Input 1

2
1 2

Sample Output 1

NO

Sample Input 2

2
2 2

Sample Output 2

YES

*/
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    //user input
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }
    
    //logic 
    for(int i=0; i<n-1; i++){
      	  int temp=arr[i];
          arr[i]=arr[i]-temp;
          arr[i+1]=arr[i+1]-temp;
      
      
    }
    
    // value to check all arr value  is zero or not
    boolean value=true;
    for(int i=0; i<n; i++){
      if(arr[i]!=0){
        value=false;
        break;
      }
    }
    //priting statement
    if(value){
      System.out.println("YES");
    }
    else{
      System.out.println("NO");
    }

  }
}
    
