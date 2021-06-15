/*
https://oj.masaischool.com/contest/1026/problem/301

Decode the message

Description

Your friend sent you an encrypted message consisting of characters A, C, G and T only .You know the decoded message is the longest repetition in the sequence. That is a maximum-length substring containing only one kind of character. Can you decode it?

Input

Input Format

The only input line contains a string of n characters.

Constraints

1 <= n <= 10^6

Output

Print one integer: the length of the longest repetition.

Sample Input 1

ATTCGGGA

Sample Output 1

3

Hint

Sample Input 1 Explanation

In the given string , substring GGG of length 3 is the longest.
*/
import java.util.Scanner; 
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int count=1, max_count=0;
    for(int i=0; i<str.length()-1; i++){
      if(str.charAt(i)==str.charAt(i+1)) {
        count++;
        if(count>max_count) max_count=count;
      }else count=1;
    }
    System.out.println(max_count);
  }
}

//Another Approach
import java.util.Scanner;
public class Main{
  public static int subStringCount(String str){
    int count=1;
    for(int i=0; i<str.length()-1; i++){
      if(str.charAt(i)==str.charAt(i+1)) count++;
      else count=1;
      }
    return count;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int count=1; 
    int max_count=0;
    
    //finding substring
    for(int i=0 ; i<str.length(); i++){
      for(int j=i; j<str.length(); j++){
        String sub_str=str.substring(i,j+1);
        count=subStringCount(sub_str);
         if(count>max_count) max_count=count;
      }
    }
      System.out.println(max_count);
    }
}
      
