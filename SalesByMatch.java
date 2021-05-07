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
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
    // i will find the element and compare with next element and when  i found first value then count=1 and add it to new list and count will be reassign to 0 and length of list is pair of shoes
    Collections.sort(ar);
        int length=ar.size();
        int count=1;
        System.out.println(length);
        List<Integer> new_arr=new ArrayList<Integer>();
        for(int i=0; i<length; i++){
            for(int j=i+1;  j<length; j++){
                
            if(ar.get(i)==ar.get(j)){
                count=count+1;
               // System.out.println("ini count"+count);
                if(count%2==0){
                   // ar.remove(i);
                   // ar.remove(j);
                   // System.out.println(ar.get(j));
                        new_arr.add(ar.get(i));
                       // System.out.println(new_arr.get(0));
               
                }
                break;
            }
            else{
              //  System.out.println("hello world");
            }
                
            }
            count=1;
           // System.out.println("after count"+count);
        }
        Collections.sort(new_arr);
        int length_new_arr=new_arr.size();
        int new_length=length_new_arr/2;
        int new_count=0;
    for(int j=0; j<length_new_arr; j++){
        //System.out.print(new_arr.get(j)+" ");
        if(j%2==0){
      //    // duplicate values should be one
        new_count=new_count+1;
    }
    }
       // System.out.println(length_new_arr);
        return new_count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
