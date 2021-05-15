/*
https://www.hackerrank.com/challenges/sparse-arrays/problem
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
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    // Write your code here
    List<Integer> arr_count=new ArrayList<Integer>();
    int length_strings=strings.size();
    int length_queries=queries.size();
    
    // for(String value : queries){
    //     System.out.print(value+" ");
    // }
    
    for(int i=0; i<queries.size(); i++){
        //System.out.println(queries.get(i));
        int count=0;
        for(int j=0; j<strings.size(); j++){
           // System.out.println(strings.get(j));
            if(queries.get(i).equals(strings.get(j))){
                count=count+1;
            }
        }
        arr_count.add(count);
    }
    // System.out.println(length_strings);
    // System.out.println(length_queries);
    // int count=0;
    // for(int i=0; i<length_strings; i++){
    //     System.out.println(queries.get(i));
    //     for(int j=0; j<length_queries; j++){
    //         String i_string=strings.get(j);
    //         String j_queries=queries.get(i);
    //         System.out.println(i_string+" "+j_queries+" ");
    //         if(i_string.equals(j_queries)){
    //             count=count+1;
    //             System.out.println(count);
    //         }
    //         else{
    //             System.out.println("not equal");
    //         }
    //        // System.out.println(count);
    //     }
    //     arr_count.add(count);
    //     }
    
    return arr_count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> strings = IntStream.range(0, stringsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> res = Result.matchingStrings(strings, queries);

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
