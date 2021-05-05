/*
https://www.hackerrank.com/challenges/s10-geometric-distribution-2/problem
*/
import java.io.*;
import java.util.*;

public class Solution {
    /*
    private static double factorial(int n){
    int fact=1;
    for(int i=0; i<=n;i++){
        fact=fact*i;
        
    }
    return fact;
    }
*/
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // use the same concept as previous one
        double p=(double)1/3;
        //System.out.println(p);
        double q=1-p;
        int n=5;
        double result=0;
       
       for(int i=1; i<=n; i++){
           result=result+Math.pow(q,i-1)*p;
        // System.out.println(result);
       }
        System.out.printf("%.3f",result);
       /*
        for(int i=0; i<=5; i++){
              result=result+Math.pow(q,n-1) * p;
              
        } // 0.066
         
        */
        
    }
}
