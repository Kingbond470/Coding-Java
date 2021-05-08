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
        List<Integer> arr=new ArrayList<Integer>();
        
        while(n>0){
            int remainder=n%2;
            n=n/2;
            arr.add(remainder);
            
            
        }
        int count=0;
        int max_count=0;
        for(int i=0; i<arr.size(); i++){
           // System.out.print(arr.get(i)+" ");
            if(arr.get(i)==1){
            
                count=count+1;
                
            }
            else{
                count=0;
            }
            if(count>max_count){
                max_count=count;
            }
        }
        System.out.println(max_count);
        bufferedReader.close();
    }
}
