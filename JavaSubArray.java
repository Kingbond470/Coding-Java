/*
https://www.hackerrank.com/challenges/java-negative-subarray/problem
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        //make a sub array and add them and check if it is <0 then increase count
        for(int i=0; i<size; i++){
            int sum=0;
            for(int j=i;  j<size; j++){
                // if(arr[j]<0){
                //     //System.out.print(arr[j]+" ");  // it will give total no of negative number present in sub array
                //     // count=count+1;
                // }
                sum=sum+arr[j];
                if(sum<0){
                    count++;
                }
            }
        }
        System.out.println(count);
        
    }
}
