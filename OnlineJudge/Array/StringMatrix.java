/*
String & Matrix

Description

You are given a matrix of characters. The matrix has N rows and M columns. Given a string s, you have to tell if it is possible to generate that string from the given matrix.

Rules for generating string from the matrix are:

1. You have to pick the first character of string from row 1, the second character from row 2 and so on. The (N+1)th character of the string is to be picked from row 1, that is, you can traverse the rows in a cyclic manner (row 1 comes after row N).

2. If an occurrence of a character is picked from a row, you cannot pick the same occurrence again from that row.

You have to print Yes if a given string can be generated from the matrix using the given rules, else print No.

Input

Input Format

First line consists of T, denoting the number of test cases.

Each test case consists of:

First line consists of two integers N and M, denoting the matrix dimensions.

Following N lines consist of M characters each.

The last line consists of a string s.

Constraints

T <= 5

N,M <= 500

Length of string < N*M

The matrix consists of lowercase English characters.

String s consists of lowercase English characters.

Output

For each test case, print "Yes" if the string can be generated else print "No". Answer for each test case should come in a new line.

Sample Input 1

1
3 3
aba
xyz
bdr
axbaydb

Sample Output 1

Yes

Hint

Sample 1 Explanation

We pick "a" from row 1. Now, we can only pick one more "a" from row 1 as one "a" is already used.

Similarly, "x" from row 2, "b" from row 3.

Now, we again go back to row 1.

We pick "a" from row 1, "y" from row 2 and so on.

*/
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int a=0; a<t; a++) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      char[][] ar = new char[n][m];
      sc.nextLine();
      for(int i=0; i<n; i++) {
        String s = sc.nextLine();
        char[] str = s.toCharArray();
        ar[i] = str;
      }
      String find = sc.nextLine();
      boolean b = true;
      for(int i=0; i<find.length(); i++) {
        boolean b2 = true;
        for(int j=0; j<m; j++) {
          if(find.charAt(i) == ar[i%n][j]) {
            ar[i%n][j] = '0';
            b2 = false;
            break;
          }
        }if(b2) {
          b = false;
          break;
        }
      }
      System.out.println(b?"Yes":"No");
    }
  }
}
            
