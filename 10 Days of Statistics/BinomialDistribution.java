/*
https://www.hackerrank.com/challenges/s10-binomial-distribution-1/problem
*/
import java.io.*;
import java.util.*;

public class Solution {
    //int n=6;
    private static double factorial(double n){
           double fact=1;
           for(int x=1; x<=n; x++){
               fact=fact*x;
               
           }
         //  System.out.println(fact);
           return fact;
       }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // B:G= 1.09:1 and n=6 and x>=3 p for boys 0.5 and for girl 0.5
        double b=1.09;
        double g=1;
       double p_boys=b/(b+g);
       double p_g=g/(b+g);
       int x=3;
       int n=6;
        //double p_boys=0.522;
      // double  p_g=0.478;
      double result = 0;
       for(int r=x; r<=n; r++){
           // use formula (x,n,p), find the n combin x... n=6 n_sub_x=6-3=3;
           //
          // double m=factorial(n); 
          // System.out.println(m);
         result = result + (factorial(n)/(factorial(r)*factorial(n-r))) * Math.pow(p_boys,r) * Math.pow(p_g,n-r);
        // System.out.format("%.3f",result);
         
       }
       System.out.format("%.3f",result);
       // factorial, create method so that i can use it again and agian
       /* int fact=1;
       for(int x=1; x<=n; x++){
           fact=fact*n;
       } */
       
    }
}
