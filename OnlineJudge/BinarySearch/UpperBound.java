// https://oj.masaischool.com/contest/1802/problem/2
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0; i<n; i++) arr[i]=sc.nextInt();
    System.out.println(findLowerBound(arr,k));
   
  }
  
  public static int findLowerBound(int[] arr, int target){
    int start=0, end=arr.length-1;
    int idx=-1;
    
    int mid=0;
    
    while(start<=end){
      mid=start+(end-start)/2;
      if(arr[mid]>target) end=mid-1;
      else start=mid+1;
      
      if(arr[mid]>target) idx=mid;
      
    }
    return idx;
  }
}
