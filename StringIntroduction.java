/*


    "A string is traditionally a sequence of characters, either as a literal constant or as some kind of variable." — Wikipedia: String (computer science)

This exercise is to test your understanding of Java Strings. A sample String declaration:

String myString = "Hello World!"

The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters,A
and B

, perform the following operations:

    Sum the lengths of A

and B
.
Determine if A
is lexicographically larger than B (i.e.: does come before
in the dictionary?).
Capitalize the first letter in A
and B

    and print them on a single line, separated by a space.

Input Format

The first line contains a string A
. The second line contains another string

. The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output:
For the first line, sum the lengths of A
and B .
For the second line, write Yes if A is lexicographically greater than  B otherwise print No instead.
For the third line, capitalize the first letter in both A and B

and print them on a single line, separated by a space.

Sample Input 0

hello
java

Sample Output 0

9
No
Hello Java

Explanation 0

String
is "hello" and

is "java".

has a length of , and has a length of ; the sum of their lengths is .
When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore, is not greater than

and the answer is No.

When you capitalize the first letter of both
and and then print them separated by a space, you get "Hello Java".
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println((A.length()+B.length()));
       /* if(A.charAt(0)>=B.charAt(0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        */
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        char aFirst=A.charAt(0);
        char bFirst=B.charAt(0);
       //System.out.println(aFirst+A+" "+bFirst+B);
        // System.out.println(A.charAt(0).toUppercase()+A.charAt(1)+" "+B.charAt(0).toUppercase());
       String avalue= A.substring(0,1).toUpperCase()+A.substring(1,A.length());
       String bvalue=B.substring(0,1).toUpperCase()+B.substring(1,B.length());
       System.out.println(avalue+" "+bvalue);
    }
}



