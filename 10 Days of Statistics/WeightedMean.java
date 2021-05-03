/*
https://www.hackerrank.com/challenges/s10-weighted-mean/problem
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
     * Complete the 'weightedMean' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY X
     *  2. INTEGER_ARRAY W
     */

    public static void weightedMean(List<Integer> X, List<Integer> W) {
    // Write your code here
    // take list x and w find the length and use loop to calculate the sum of w and multiply the each value of x to respective value of w and add them ... divide the total sum to sum of w and print the value using printf
    int length_x=X.size();
    //System.out.println(length_x);
    int length_W=W.size();
    //System.out.println(length_W);
    
    float total_sum=0;
    float w_sum=0;
    
    for (int i=0; i< length_x; i++){
        for (int j=0; j<length_W; j++){
            if(i==0){                           // just to take addition one time
                w_sum=w_sum+W.get(j);
                }
            
           
            if(i==j){
                
                int multiply_value=X.get(i)*W.get(j);
               // System.out.println(multiply_value);
                total_sum=total_sum+multiply_value;
            
                // System.out.println(total_sum);
            }
            
               
        }
         
    }
  //  System.out.println(w_sum);
  //  System.out.println(total_sum);
    float w_mean=0;
    w_mean=total_sum/w_sum;
   // w_mean=Math.round(w_mean); it gives the integer value
    System.out.printf("%.1f",w_mean);
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> vals = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> weights = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.weightedMean(vals, weights);

        bufferedReader.close();
    }
}
