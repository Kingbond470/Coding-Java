/*
Masai Palindromic Substring-Editorial

Difficulty: Low
Prerequisite: Strings,Implementation, Brute-ForceProblem Statement:

You are provided a string S. Write a program that returns length of the longest palindromic substring of that string.

Hint:
A palindromic string is same read forwards or backwards, that is, the reverse string is equal to the original string.

Short Explaination
In this question, we have to find out the longest possible palindromic substring. 
The most obvious way will be to generate all possible substrings, and check for the palindromic substring with the longest length. 
Finally, the length of the longest substring is printed. To generate all possible substrings, we can use a brute force approach.

Detailed Explanation:
A palindrome is a string that is the same read forward or backward.
A substring is a contiguous sequence of characters within a string. In this question, we have to find the palindromic substring which has the largest length. 
An intuitive approach to do this would be to use a brute force approach, and find all possible substrings, and check for the palindromic substring with the highest length.
A brute force approach refers to finding all the possible solutions and checking if they satisfy, the required condition or not.
A single character can also be considered a substring, and the complete string can also be considered as a substring of itself. 
A string can be checked to be a palindrome or not, by checking if the original string, and the string formed by reversing the characters of the original string are same. 
If they are same, the string can be considered as palindromic otherwise not.

Pseudo Code

	* function checkPalindrome(String a,int strlen)
	* String reverse //
	* for (int i = strlen - 1;i>=0;i--)
		* reverse = revese + character in a at position i
	* if reverse is equal to a return true
	* else return false
	* function findLongestPalindromicSubstring(String a)
	* String a //input string
	* int len //length of the input string
	* int max = 0 //keeps track of the maximum length of palindromic substring obtained so far
	* for (int i = 0;i<len;i++)
		* String temp //stores the substring
		* for (int j = i;j<len;j++)
			* temp = temp + j
			* if (checkPalindrome(temp) is equal to true && length of temp is greater than max)
				* max = length of temp  	* print max
            
 */
 //Enter code here
import java.util.Scanner;
public class Main{
  public static int palindrome(String str){
   String new_str="";
    int count=0;
    for(int i=str.length()-1; i>=0; i--){
      new_str=new_str+str.charAt(i);
    }
    if(str.equals(new_str)){
      count=str.length();
    }
   // System.out.println(count+"palind");
    return count;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int count=0;
    int max=0;
    for(int i=0; i<str.length(); i++){
      for(int j=i; j<str.length(); j++){
        if(str.charAt(i)==str.charAt(j)){
          String st=str.substring(i,j+1);
          count=palindrome(st);
          if (count>max){
            max=count;
          }
        }
      }
    }
    System.out.println(max);
    
  }
}
