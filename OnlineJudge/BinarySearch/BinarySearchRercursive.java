// https://oj.masaischool.com/contest/1790/problem/1
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
  int low=0, high=n;
   System.out.println(numberPresent(arr, low, high, k)?"1":"-1");
  }
  
  public static boolean numberPresent(int[] arr, int low, int high, int k){
    int mid=low+(high-low)/2;
    if(arr[mid]==k) return true;
    if(low==high) return false;
    else if(arr[mid]>k){
      return numberPresent(arr, low, mid-1, k);
    }
    else return numberPresent(arr, mid+1, high, k);
    
  }
}
