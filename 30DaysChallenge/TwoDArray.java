/*
https://www.hackerrank.com/challenges/30-2d-arrays/problem
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
       // System.out.print(arr.get(0));
       int sum=0;
       int max_sum=-10000;
       for(int i=0; i<arr.size()-2; i++ ){      // row length which is i
           for(int j=0; j<arr.size()-2; j++){       // column length which is j
               sum=arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)+arr.get(i+1).get(j+1)+arr.get(i+2).get(j)+arr.get(i+2).get(j+2)+arr.get(i+2).get(j+1);
               //System.out.print(sum+" ");
               if(sum>max_sum){
                   max_sum=sum;
                  // System.out.println();  
               }
               
           }  
       }
       System.out.println(max_sum);
       
bufferedReader.close();
    }
}
