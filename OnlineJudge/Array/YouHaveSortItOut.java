// https://oj.masaischool.com/contest/1453/problem/03
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0; i<n; i++) arr[i]=sc.nextInt();
    int[] idx=new int[n];
    for(int i=0; i<n;i++) idx[i]=i;
    
    int temp=0, temp_idx=0;
    for(int i=0; i<n; i++){
      for(int j=0; j<n-i-1; j++){
        if(arr[j]>arr[j+1]) {
          temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
          
          temp_idx=idx[j];
          idx[j]=idx[j+1];
          idx[j+1]=temp_idx;
        }
      }
    }
        // how to swap index
        for(int i=0; i<n; i++) System.out.print(idx[i]+ " ");
  }
}
