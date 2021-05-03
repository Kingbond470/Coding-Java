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
    Collections.sort();
    if n%2 !=0 {
        int middle=n//2;
        int q2=arr.get(middle);
        System.out.println(q2);
        int new_left_middle=middle/2;
        int q1=(arr.get(new_left_middle)+arr.get(new_left_middle-1))//2;
        int new_right_middle=middle+new_left_middle;
        int q3=(arr.get(new_right_middle)+arr.get(new_right_middle+1))//2;
    }
    else{
        
    }
    return arr;
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
