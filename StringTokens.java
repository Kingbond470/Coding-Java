/*
Given a string, s

, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this challenge.

Input Format

A single string, s

.

Constraints

 s   is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).

Output Format

On the first line, print an integer,
, denoting the number of tokens in string (they do not need to be unique). Next, print each of the tokens on a new line in the same order as they appear in input string

.

Sample Input

He is a very very good boy, isn't he?

Sample Output

10
He
is
a
very
very
good
boy
isn
t
he

Explanation

We consider a token to be a contiguous segment of alphabetic characters. There are a total of
such tokens in string , and each token is printed in the same order in which it appears in string .

*/
import java.io.*;
import java.util.*;
import java.lang.Object.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        /*Write your code here.
        Provide the regular expression and split the string with it
        Find the length of total split string and print them
        String regex ="A-Za-z !,?._'@";
        System.out.pritnln(s.split(regex));
        trim()is a built-in function that eliminates leading and trailing spaces
        
 
        */
        if (s.trim().length()==0 || s.trim().length()>=400000){
            System.out.println(0);
            return;
        }
        String regex="[ !,?._'@]+";
        String split_string[]=s.trim().split(regex);
        System.out.println(split_string.length);
       
        for(String w:split_string){
            System.out.println(w);
           /* int count=split_string.size();
           System.out.println(count);
           */
        }
       
      //  System.out.println(a);
        scan.close();
    }
}

