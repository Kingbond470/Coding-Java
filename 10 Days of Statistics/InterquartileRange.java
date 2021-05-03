/*
https://www.hackerrank.com/challenges/s10-interquartile-range/problem
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
     * Complete the 'interQuartile' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY values
     *  2. INTEGER_ARRAY freqs
     */

    public static void interQuartile(List<Integer> values, List<Integer> freqs) {
    // Print your answer to 1 decimal place within this function
//find q1 and q3 using quartile concept and subtract the value to get range
    List<Integer> arr=new ArrayList<Integer>();
    int val_length=values.size();
        // important , sort the all values with frequencey
    //int freq_length=freqs.size();
    int sum_len=0;
    
    float q1=0, q3=0;
    float range_q=0;
    /*
    for (int i=0; i< freq_length; i++){
        sum_len=sum_len+freqs.get(i);
    }
    */
    for(int i=0; i<val_length; i++){
        for(int j=0; j<freqs.get(i); j++){      // it will take the freq length w.r.t to element
            arr.add(values.get(i));
        }
    }
    Collections.sort(arr);
    sum_len=arr.size();
  //  System.out.println(arr);
  // System.out.println(sum_len);
    if( sum_len%2!=0){
        int middle=sum_len/2;
        int left_middle=middle/2;
      //  q1=(arr.get(left_middle)+arr.get(left_middle-1))/2;
       // int right_middle=middle+left_middle;
       // q3=(arr.get(right_middle)+arr.get(right_middle+1))/2;       // check right again
       q1=arr.get(left_middle);
       int right_middle=middle+left_middle;
       q3=arr.get(right_middle+1);
        range_q=q3-q1;
        System.out.println(range_q);    
    }
    else{
        int middle=sum_len/2;
        if(middle%2==0){
            int left_middle=middle/2;
            q1=(arr.get(left_middle)+arr.get(left_middle-1))/2;
            int right_middle=middle+left_middle;
            q3=(arr.get(right_middle)+arr.get(right_middle-1))/2;
            range_q=q3-q1;
            System.out.println(range_q);
        }
        else{
            int left_middle=middle/2;
            q1=arr.get(left_middle);
            q3=arr.get(middle+left_middle);
            range_q=q3-q1;
            System.out.println(range_q);
        }
    }
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> val = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> freq = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.interQuartile(val, freq);

        bufferedReader.close();
    }
}
