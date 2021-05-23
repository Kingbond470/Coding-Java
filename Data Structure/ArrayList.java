/*
https://www.hackerrank.com/challenges/java-arraylist/problem
*/
import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
         ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int a=sc.nextInt();
            ArrayList<Integer> value=new ArrayList<Integer>();
            for(int j=0; j<a; j++){
            int next_row_value=sc.nextInt();
            value.add(next_row_value);  
            }
            arr.add(value);
            sc.nextLine();
        }
        int element_find=sc.nextInt();
        for(int a=0; a<element_find; a++){
            int yth=sc.nextInt();
            int xth=sc.nextInt();
           try{
               int find_value=arr.get(yth-1).get(xth-1);
               System.out.println(find_value);
           }
           catch(IndexOutOfBoundsException e){
               System.out.println("ERROR!");
           }
            sc.nextLine();
        } 
    }
}
