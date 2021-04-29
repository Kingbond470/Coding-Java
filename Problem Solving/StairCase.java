/*
Staircase detail (https://www.hackerrank.com/challenges/staircase/problem)

This is a staircase of size

:

   #
  ##
 ###
####

Its base and height are both equal to

. It is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size

.

Function Description

Complete the staircase function in the editor below.

staircase has the following parameter(s):

    int n: an integer

Print

Print a staircase as described above.

Input Format

A single integer,

, denoting the size of the staircase.

Constraints

.

Output Format

Print a staircase of size

using # symbols and spaces.

Note: The last line must have

spaces in it.

Sample Input

6 

Sample Output

     #
    ##
   ###
  ####
 #####
######

Explanation

The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of
.
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
  /*  String in="#";
    for(int i=1; i<=n;i++){
      // String add="#";
       // System.out.print(add+ "#");
      // System.out.println(i);
       if(i==1){
           System.out.println("     #");
       }
       if(i==2){
           System.out.println("    ##");
       }
       if (i==3){
           System.out.println("   ###");
           
       }
       if (i==4){
           System.out.println("  ####");
       }
       if (i==5){
           System.out.println(" #####");
       }
       if (i==6){
           System.out.println("######");
       }
        
    }
    }
    */
    for(int i=0; i<n;i++){
        for (int j=1;j<=n;j++){
            if ((i+j)<n){
                System.out.print(" ");
            }
            else{
                System.out.print("#");
            }
        }
        System.out.println("");
    }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
