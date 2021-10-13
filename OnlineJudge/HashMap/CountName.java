//https://oj.masaischool.com/contest/1204/problem/3

import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Arrays;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    String[] arr=new String[t];
    for(int i=0; i<t; i++){
      arr[i]=sc.next();
    }
    Arrays.sort(arr);
    LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
    for(int i=0; i<t; i++){
      if(map.containsKey(arr[i])){
        int count=map.get(arr[i]);
        map.put(arr[i],count+1);
      }
         else{
           map.put(arr[i],1);
         }
         }
         
         //printing the element
         for(Map.Entry<String,Integer> set: map.entrySet()){
           System.out.println(set.getKey()+ " "+set.getValue());
         }
         
         }
         }
