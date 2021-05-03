/*
https://www.hackerrank.com/challenges/s10-quartiles/problem
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
     * Complete the 'quartiles' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> quartiles(List<Integer> arr) {
    // Write your code here
// retrive the list and sort it. then find the length and for odd ... divide the length and find the integer value form it, middle quartile is middle value and for left .... make find the lenght and add the value near to suppose, 4 element then (1+2)/2 ..... divide the length by 2 and store in variable and subtract one index and add them and divide by 2.........asame goes for right array
// if lenght is even then do the same for left and right array and for middle quartile simple find the middle -1 and middle .. add them and divide by 2 and you got it.... now return all the values.
    int n=arr.size();
    Collections.sort(arr);
    int q1=0,q2=0,q3=0;
    if (n%2 !=0) {
        int middle=n/2;
        q2=arr.get(middle);
        
        int new_left_middle=middle/2;
        q1=(arr.get(new_left_middle)+arr.get(new_left_middle-1))/2;
        //System.out.println(q1);
        //System.out.println(q2);
        int new_right_middle=middle+new_left_middle;
        q3=(arr.get(new_right_middle)+arr.get(new_right_middle+1))/2;
        //System.out.println(q3);
    }
    else{
        int middle=n/2;
        System.out.println(middle);
        q2=(arr.get(middle)+arr.get(middle-1))/2;
        if (middle%2==1){
           int new_left_middle=middle/2;
           System.out.println(new_left_middle);
            q1=arr.get(new_left_middle);
            q3=arr.get(middle+new_left_middle);
        }
        else{
            int new_right_middle=middle/2;
            q1=(arr.get(new_right_middle)+arr.get(new_right_middle-1))/2;
            q3=(arr.get(middle+new_right_middle)+arr.get(middle+new_right_middle-1))/2;
            }
        //System.out.println(q2);
        /*
        int new_left_middle=middle/2;
        q1=(arr.get(new_left_middle))+arr.get(new_left_middle-1)/2;
        int new_right_middle=middle+new_left_middle;
        q3=(arr.get(new_right_middle)+arr.get(new_right_middle+1))/2;
        */
        /*
        int left_middle=middle/2;
        q1=(arr.get(left_middle)+arr.get(left_middle-1))/2;
        int right_middle=middle+left_middle;
        q3=(arr.get(right_middle)+arr.get(right_middle-1))/2;
        */
    }
    return Arrays.asList(q1,q2,q3);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> data = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> res = Result.quartiles(data);

        bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
