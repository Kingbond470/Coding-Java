// https://oj.masaischool.com/contest/1629/problem/2
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int a=0; a<t; a++){
      //user input
      int n=sc.nextInt();
      int[] arr=new int[n];
      int[] sumAbs=new int[n-1];
      for(int i=0; i<n; i++) arr[i]=sc.nextInt();
      System.out.println(absoluteSum(arr, 0, 1, n));
    //  System.out.println(absoluteSum(arr, n));
      
    }
  }
  
  public static int absoluteSum(int[] arr, int start, int end, int n){
    int sum=0;
    if(end==n) return sum;
    sum=Math.abs(arr[start]-arr[end]);
    return sum+absoluteSum(arr, start+1, end+1, n);
  }
}
