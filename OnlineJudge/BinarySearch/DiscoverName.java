// https://oj.masaischool.com/contest/1838/problem/3
import java.util.Scanner;
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int q=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0; i<n; i++) arr[i]=sc.nextInt();
    Arrays.sort(arr);
    for(int a=0; a<q; a++){
    int key=sc.nextInt();
    int low=0, high=n-1;
      boolean value =false;
    while(low<=high){
     int mid=low+(high-low)/2;
      if(arr[mid]==key) {
        value=true;
        break;
      }
      else if(arr[mid]<=arr[high]){
        if(key>arr[mid] && key<=arr[high]) low=mid+1;
        else high=mid-1;
      }
      else{
        if(key>=arr[low] && key<arr[mid]) high=mid-1;
        else low=mid+1;
      }
    }
    
    System.out.println(value?"YES":"NO");
  }
  }
}
