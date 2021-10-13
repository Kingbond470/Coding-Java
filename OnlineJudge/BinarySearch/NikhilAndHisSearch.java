// https://oj.masaischool.com/contest/1850/problem/1
import java.util.Scanner;
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int  n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0; i<n; i++) arr[i]=sc.nextInt();
    Arrays.sort(arr);
    int q=sc.nextInt();
    for(int a=0; a<q; a++){
      int type=sc.nextInt();
      int k=sc.nextInt();
      
      int low=0, high=n-1;
      int idx=-1, count=0;
      while(low<=high){
        int mid=low+(high-low)/2;
        //if(arr[mid]==k){
       //   idx=mid;
       //   break;
      //  }
        if(arr[mid]>=k){
          high=mid-1;
          idx=mid;
          break;
        }
        if(arr[mid]<k) low=mid+1;
      }
      
      if(idx==-1) count=0;
        //System.out.println(count); count
      else{
        if(type==0) count=n-idx;
        if(type==1) count=n-idx-1;
     }
      System.out.println(count);
     
    }	// end of query
  }	// end of main function
}	
