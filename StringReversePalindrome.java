/*

A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string A

, print Yes if it is a palindrome, print No otherwise.

Constraints

A will consist at most 50

    lower case english letters.

Sample Input

madam

Sample Output

Yes

*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
       /* char first=A.charAt(0);
        
        System.out.println(first);
        
        int value=A.length();
        char second=A.charAt(1);
        System.out.println(second);
        for(int i=0;i <3;i++){
            if(A.charAt(i)==A.charAt(value)){
                
            }
        
        String substring=indexOf(A);
        System.out.println(substring);
        */
        String B="";
        // System.out.println(A.length());
        for(int i=A.length()-1;i>=0;i--){
            char char_value=A.charAt(i);
            B=B+char_value;
           // System.out.println(B);
        }
       if (A.equals(B))
            System.out.println("Yes");
        else
            System.out.println("No");

}
}



