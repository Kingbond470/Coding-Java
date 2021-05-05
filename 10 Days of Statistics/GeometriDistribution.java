/*
https://www.hackerrank.com/challenges/s10-geometric-distribution-1/problem
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // the product of defect is 1/3 so p =1/3 and q=1-p and use the formula g(n,p)=q^(n-1)*p
        
        double p=0.33333333333  ;    // (double)1/3 using type casting
        //System.out.println(p);
        double q=1-p;
        int n=5;
        double result=0;
        result=Math.pow(q,n-1) * p;
        System.out.printf("%.3f",result);
    }
}
