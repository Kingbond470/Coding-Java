/*
https://www.hackerrank.com/challenges/between-two-sets/problem
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
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     
     */
     /*
 retrive the value of list a, b and find the mulitple of a and b and do like loop and muliply the value of list element of first list from n=1 to n=n till it becomes less than or equal to first element of second array..... then use two loop find lenght and first loop will be second input array and second loop will be new list from no=1 to n=n and divide the value first loop[j]%loop[k] and retrun the value which divide all the value of j.
    int size_a=a.size();
    int size_b=b.size();
    int last_a=a.get(size_a-1);
    System.out.println(last_a);
    int n=b.get(0);
    // int[] new_factor;
    List<Integer> new_factor = new ArrayList<Integer>();
    int count=0;
    for(int i=1; i<=n; i++){
        System.out.println("");
        int new_factor_value=last_a*i;
        new_factor.add(new_factor_value);
    }
    int size_new_factor=new_factor.size();
    for (int j=0; j<size_new_factor; j++){          // new facor list
        for (int k=0; k<size_b; k++){               // old second array
            int remainder=b.get(k)%new_factor.get(j);       // if j divide to all values of second loop then increase the count;
            if(remainder==0){
                count=count+1;
                new_factor.add(j);
            }
            else{
                    System.out.println("dont' be smart");
                    new_factor.remove(j);
                break;
            }
            System.out.println(new_factor.get(j));
        }
    }
    
    return count;
    */
    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
    // sort the list find lenght and find max, min from first array... use min to initialize the loop and divide the value with a and b list check///// if it is then b.get(i divided by i) increase the count and reutrn it
    Collections.sort(a);
    Collections.sort(b);
    int count=0;
    int a1=0;
    int b1=0;

        for(int j=a.get(a.size()-1);j<=b.get(0);j++){

            for(int i=0;i<a.size();i++){
              a1=j%a.get(i);
              if(a1!=0){
                  break;
              }

            }
            for(int k=0;k<b.size();k++){
                b1=b.get(k)%j;
                if(b1!=0){
                    break;
                }
            }
            if(a1==0 && b1==0){   
                count+=1;
                System.out.println(count);
            }
            }
    return count;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
