// https://oj.masaischool.com/contest/1957/problem/2

import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long[] arr=new long[n];
    for(int i=0; i<n; i++) arr[i]=sc.nextLong();
    Arrays.sort(arr);
    long prev=arr[0], current=0;
    int prevCount=1, currentCount=0;
    int height=1;
    for(int i=0; i<n; i++){
      current+=arr[i];
      currentCount+=1;
      
      if(current>prev && currentCount>prevCount){
        prev=current;
        prevCount=currentCount;
        current=0;
        currentCount=0;
        height++;
      } 
    }
    System.out.println(height);
    
    
  }
}
