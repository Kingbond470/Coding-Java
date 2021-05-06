/*
https://www.hackerrank.com/challenges/s10-poisson-distribution-1/problem
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        double lambda=2.5;
        int k=5;
        double E=2.71828;
        double result;
        
        double mutliply=Math.pow(lambda,k) * Math.pow(E, -lambda);
        int fact=1;
        for(int i=1;i<=k;i++){
            fact=fact*i;
            
        }
        result=mutliply/fact;
        System.out.printf("%.3f",result);
        
    }
}
