/*
https://www.hackerrank.com/challenges/30-arrays/tutorial
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
        

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
        
        int length=arr.size();
      // System.out.println(length);
      // System.out.println(arr.get(0));
        // for(int i=0; i<length;i++){
        //     System.out.println(arr.get(i));
            
        // }
        for(int i=length-1; i>=0;i--){
            System.out.print(arr.get(i)+" ");
        }
        
        bufferedReader.close();
    }
}
