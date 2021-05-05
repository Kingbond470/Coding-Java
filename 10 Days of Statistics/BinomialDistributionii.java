/*
https://www.hackerrank.com/challenges/s10-binomial-distribution-2/problem
*/
import java.io.*;
import java.util.*;

public class Solution {
    private static double factorial(int n ){
        int fact=1;
        for(int i=1; i<=n;i++){
            fact=fact*i;
            
        }
        return fact;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // n is euqal to 10,x is atleast 2 and atmost 2
        // find the factorial to do it
        //int failure_percentage=12;
       // int success_percentage=100-failure_percentage;
       // int size=10;
        //double q=failure_percentage/100;
        //double p=success_percentage/100;
        
        double p=0.12;
        double q=1-p;
        int n=10;
        
        double result_nomore=0;
        for(int r=0; r<=2;r++){
           result_nomore=result_nomore+(factorial(n)/(factorial(r)*factorial(n-r))) * Math.pow(p,r) * Math.pow(q,10-r);
        }
        System.out.printf("%.3f",result_nomore);
        System.out.println(" ");
        
        double result_atleast=0;
        for(int r=2; r<=n;r++){
            result_atleast=result_atleast+(factorial(10)/(factorial(r)*factorial(n-r))) * Math.pow(p,r) * Math.pow(q,n-r);
        }
        
        System.out.printf("%.3f",result_atleast);  
    }
}
