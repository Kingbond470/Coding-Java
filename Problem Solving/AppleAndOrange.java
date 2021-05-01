/*
https://www.hackerrank.com/challenges/apple-and-orange/problem
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
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
    // Retrive the s, t  and a, b value, ......find the lenght of apple and oranges list add the a+list of apple value =new list and b+ list of orange values=new list, if it is s<= and t>= then increase the count and return it

    int apples_length=apples.size();
    int oranges_length=oranges.size();
    //System.out.println(s+" "+t);
   // System.out.println(a+" "+b);
    int apple_count=0;
    int orange_count=0;
    for (int i=0; i<apples_length; i++){
        // System.out.println(apples.get(i));
        int apple_value=apples.get(i);
       // System.out.println(a+apple_value);
        int c=a+apple_value;
        if (c>=s && c<=t){
          //  System.out.println(c);
            apple_count=apple_count+1;
            
        }
        
    } 
    for (int j=0; j<oranges_length; j++){
       // System.out.println(oranges.get(j));
    int orange_value=oranges.get(j);
       int d=b+orange_value;
       if (d>=s && d<=t){
           // System.out.println(d);
            orange_count=orange_count+1;
        }
       // System.out.println(b+orange_value);
       // int add_new_orange_value=b+orange_value;
     
    } 
    System.out.println(apple_count);
    System.out.println(orange_count);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int s = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int a = Integer.parseInt(secondMultipleInput[0]);

        int b = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(thirdMultipleInput[0]);

        int n = Integer.parseInt(thirdMultipleInput[1]);

        List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.countApplesAndOranges(s, t, a, b, apples, oranges);

        bufferedReader.close();
    }
}
