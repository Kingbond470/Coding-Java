/*
Strange Pattern

Description

You need to print pattern as given in Sample Input.

Input

First line contains N and M . (1<= N,M <= 10)

Output

Print pattern for N and M.

Sample Input 1

1 2

Sample Output 1

+/\/\+
+\/\/+

Sample Input 2

3 4

Sample Output 2

+/\/\/\/\+
+\/\/\/\/+
+/\/\/\/\+
+\/\/\/\/+
+/\/\/\/\+
+\/\/\/\/+

Hint

For N, there would be 2*N lined pattern.
Lan
*/
import java.util.Scanner; 
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   int N=2*n;
    int m=sc.nextInt();
   int  M=2*m+2;
    String a="/";
   String b="\\";
    for(int i=0; i<N; i++){
      for(int j=0; j<M; j++){
        if(j==0 || j==M-1){
          System.out.print("+");
        }
        else{
          if(i%2==0){
                    if(j%2==1){
                    System.out.print("/");
                    }else{
                     System.out.print(b);
                                       }
          }else{
           if(j%2==1){
                    System.out.print(b);
                    }else{
                     System.out.print("/");
                                       }
          }
             }
                           }
      System.out.println();
                           }
                           }
                           }
