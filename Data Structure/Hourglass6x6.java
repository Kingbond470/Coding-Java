/*
https://www.hackerrank.com/challenges/java-2d-array/problem
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

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

    // print the input to check the value, now length should be length-2 bcoz of no glass foramtion 4(if index start from 0) in rows/cols. retrive the value at i, i+1, i+2 rows and j,j+1,j+2 at i,i+2 but in i+1 it will be center which is j+2....now compare the values and print the max sum(compare with each sum and replace the sum if new max found)
   // System.out.println(arr.get(0).get(0));
    int length=arr.size();
    int sum=0;
    int max_sum=-1000;
    
    for(int i=0; i<length-2; i++){
        for(int j=0; j<length-2;j++){
            sum=arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)+arr.get(i+1).get(j+1)+arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);
            
            if(sum>max_sum){
                max_sum=sum;
            }
           
        }
        
    }
     System.out.print(max_sum);
        bufferedReader.close();
    }
}
