// https://oj.masaischool.com/contest/1790/problem/2
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    
    int[] arr=new int[n];
    for(int i=0; i<n; i++) arr[i]=sc.nextInt();
    
    for(int i=0; i<n; i++){
      for(int j=i+1; j<n; j++){
        if(arr[i]>arr[j]) {
          int temp=arr[j];
          arr[j]=arr[i];
          arr[i]=temp;
        }
      }
    }
    
   // for(int i=0; i<n; i++) System.out.println(arr[i]+" ");
    
    boolean value=false;
    int low=0, high=n;
    //int mid=low+(high-low)/2;
    while(low<=high){
     int mid=low+(high-low)/2;
      //ollllSystem.out.print(mid+" ");
      if(arr[mid]==k){
       // System.out.print("1");
        value=true;
        break;
      }
      else if(arr[mid]>k){
        high=mid-1;
      }
      else if(arr[mid]<k){
        low=mid+1;
      }    
    }
    
    System.out.println(value?"1":"-1");
    
  }
}
