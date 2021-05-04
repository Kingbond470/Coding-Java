/*
https://www.hackerrank.com/challenges/s10-standard-deviation/problem
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
     * Complete the 'stdDev' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void stdDev(List<Integer> arr) {
    // Print your answers to 1 decimal place within this function
        // find the lenght of list and find the sum and divide it by length =mean, and from each value subtract the mean and square it and sum all followed by divide it by length and print till 1 decimal values using printf
        int length_arr=arr.size();
        //System.out.println();
        int sum_mean=0;
        double sum_total=0;
        for(int i=0; i<length_arr; i++){
            sum_mean=sum_mean+arr.get(i);
        }
        //System.out.println(sum_mean);
        float mean=sum_mean/length_arr;
        //System.out.println(mean);
        for(int i=0; i<length_arr;i++){
            sum_total=sum_total+(arr.get(i)-mean)*(arr.get(i)-mean);
           // System.out.println(sum_total);
            
        }
        //System.out.println(sum_total);
        double standard_dev_without_sqrt=sum_total/length_arr;
       // System.out.println(standard_dev_without_sqrt);
        double standard_dev=Math.sqrt(standard_dev_without_sqrt);
        System.out.printf("%.1f",standard_dev);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> vals = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.stdDev(vals);

        bufferedReader.close();
    }
}
