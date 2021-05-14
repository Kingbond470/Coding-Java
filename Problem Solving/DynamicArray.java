/*
https://www.hackerrank.com/challenges/dynamic-array/problem
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

class Solution {
    List<Integer> arr=new ArrayList<Integer>();
    List<List<Integer>> arr1=new ArrayList<List<Integer>>();
    int lastAnswer=0;
    
    public Solution(int n){
        for(int i=0; i <n; i++){
            arr=new ArrayList<Integer>();
            arr1.add(arr);
        }
        
    }
    
    public void queryOne(int x, int y, int n){
        int idx=(x^lastAnswer)%n;
        List<Integer> arr=arr1.get(idx);
        arr.add(y);
    }

    public void queryTwo(int x, int y, int n){
        int new_idx=0;
        int idx=(x^lastAnswer)%n;
        List<Integer> arr=arr1.get(idx);
        new_idx= y%arr.size();
        lastAnswer=arr.get(new_idx);
        System.out.println(lastAnswer);
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        Solution sol=new Solution(n);    // creating constructor
        for(int i=0; i<q; i++){
            int queryType=sc.nextInt();     
            int x=sc.nextInt();
            int y=sc.nextInt();
            // for queries 1 and 2
            if(queryType==1){
                sol.queryOne(x,y,n);
            }
            else{
                sol.queryTwo(x,y,n);
            }
        }
        
    }
}
