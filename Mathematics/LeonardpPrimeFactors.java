/*
https://www.hackerrank.com/challenges/leonardo-and-prime/problem
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
     * Complete the 'primeCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static int primeCount(long n) {
    // Write your code here

            
            // for(int i=1; i<=n; i++){ 
            //     boolean value=prime(i);
            //     if(value) {
            //         if(n%i==0) count++;
            //     }
            // }
            int[] arr={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59};
            long sum=2;
            int count=0;
            for(int i=1; i<arr.length && n!=1; i++){
                sum=sum*arr[i];
                if(sum<=n)count++;
            }
            return count;
    }
    // public static boolean prime(int n){
    //     if(n<=1) return false;
    //     for(int j=2; j<n; j++){
    //         if(n%j==0) return false;
    //     }
    //     return true;
    // }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                long n = Long.parseLong(bufferedReader.readLine().trim());

                int result = Result.primeCount(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
