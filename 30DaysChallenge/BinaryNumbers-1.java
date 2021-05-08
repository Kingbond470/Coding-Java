/*
https://www.hackerrank.com/challenges/30-binary-numbers/problem
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



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        // take the intger input, then divide the integer and store the quoteint and remainder in differnt variable, initialize the count, of continous 1's and if next value is o then reset the count to o and do it again, until the last 1's. and return the value
        int count =0;
        int max = 0;
        
        while(n>0){
            if(n%2==1) {
                count++;
                if(count>max){
                    max = count;
                }
            }
            else {
                count = 0;
            }
            n=n/2;
            
            
        }
        System.out.println(max);
        bufferedReader.close();
    }
}
