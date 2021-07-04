import java.io.*;
import java.util.*;

public class Solution {
      /* Code to caluclate errror is copied from java in-built library 
      * Class  : ErrorFunction
      * Method : public static double err(double z)
      */
  public static double erf(double z) {
        double t = 1.0 / (1.0 + 0.5 * Math.abs(z));
        double ans = 1 - t * Math.exp( -z*z   -   1.26551223 +
                                            t * ( 1.00002368 +
                                            t * ( 0.37409196 + 
                                            t * ( 0.09678418 + 
                                            t * (-0.18628806 + 
                                            t * ( 0.27886807 + 
                                            t * (-1.13520398 + 
                                            t * ( 1.48851587 + 
                                            t * (-0.82215223 + 
                                            t * ( 0.17087277))))))))));
        if (z >= 0) return  ans;
        else        return -ans;
    }
    static double normalDis(double x, double mean, double stdDev){
        return 0.5*(1+erf((x-mean)/(stdDev*Math.sqrt(2))));
    }
    static double CLT(int x,int n, int mean, int stdDev){
        return normalDis(x,n * mean,Math.sqrt(n) * stdDev);
    }
    static double digitScale(double d, int scale ){
        double factor = Math.pow(10,scale);
        return Math.round(d * factor) / factor; 
    }
    public static void main(String[] args) {
        System.out.println(digitScale(CLT(9800,49, 205, 15),4));
    }
}
