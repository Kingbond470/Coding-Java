/*
https://www.hackerrank.com/challenges/array-left-rotation/problem
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
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
    // go through the each element and put the first value at the end of list in each iteration unitl d becomes false.

//    List<Integer> arr1=new ArrayList<Integer>();
 
//     for(int i=0; i<arr.size(); i++){
//         if(i==4){
//            // System.out.print(arr.get(0)+" ");
//            arr1.add(arr.get(0));
//         }
//         else{
//        // System.out.print(arr.get(i+1)+" ");
//        arr1.add(arr.get(i+1));
//         }
        
//     }
   
    
//     for( int value : arr1){
//         System.out.print(value+" ");
//     }
    
//      List<Integer> arr2=new ArrayList<Integer>();
//     for(int k=0; k<arr1.size(); k++){
//         if(k==4){
//             arr2.add(arr1.get(0));
//         }
//         else{
//             arr2.add(arr1.get(k+1));
//         }
//     }
    
//     for (int value: arr2){
//         System.out.print(value+ " ");
//     }
    
//     List<Integer> arr3=new ArrayList<Integer>();
//     for(int k=0; k<arr2.size(); k++){
//         if(k==4){
//             arr3.add(arr2.get(0));
//         }
//         else{
//             arr3.add(arr2.get(k+1));
//         }
//     }
    
//     for (int value: arr3){
//         System.out.print(value+ " ");
//     }
    
//     List<Integer> arr4=new ArrayList<Integer>();
//     for(int k=0; k<arr3.size(); k++){
//         if(k==4){
//             arr4.add(arr3.get(0));
//         }
//         else{
//             arr4.add(arr3.get(k+1));
//         }
//     }
    
//     for (int value: arr4){
//         System.out.print(value+ " ");
//     }
    
//     return arr4;
while (d != 0) {
            arr.add(arr.remove(0));
            --d;
        }
        return arr;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.rotateLeft(d, arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
