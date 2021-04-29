/*
[Plus Minus](https://www.hackerrank.com/challenges/plus-minus/problem?h_r=profile)
Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with

places after the decimal.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to

are acceptable.

Example
There are elements, two positive, two negative and one zero. Their ratios are , and

. Results are printed as:

0.400000
0.400000
0.200000

Function Description

Complete the plusMinus function in the editor below.

plusMinus has the following parameter(s):

    int arr[n]: an array of integers

Print
Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate line with

digits after the decimal. The function should not return a value.

Input Format

The first line contains an integer,
, the size of the array.
The second line contains space-separated integers that describe

.

Constraints


Output Format

Print the following
lines, each to

decimals:

    proportion of positive values
    proportion of negative values
    proportion of zeros

Sample Input

STDIN           Function
-----           --------
6               arr[] size n = 6
-4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]

Sample Output

0.500000
0.333333
0.166667

Explanation

There are
positive numbers, negative numbers, and zero in the array.
The proportions of occurrence are positive: , negative: and zeros: . 
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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
// take the array and find the positive, negative and zero value and add them and divide by length of list..size
    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int size_list=arr.size();
    float positive_sum=0;
    float negative_sum=0;
    float zero_sum=0;
    for(int i=0; i<size_list; i++){
        if (arr.get(i)>0)
        {
            positive_sum=positive_sum+1;
        }
        else if(arr.get(i)<0){
            negative_sum=negative_sum+1;
            
        }
        else{
            zero_sum=zero_sum+1;
        }
    }
    float prop_positive=positive_sum/size_list;
    float prop_negative=negative_sum/size_list;
    float prop_zero=zero_sum/size_list;
    System.out.println(prop_positive);
    System.out.println(prop_negative);
    System.out.println(prop_zero);
        }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
