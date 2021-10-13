// https://oj.masaischool.com/contest/1555/problem/2
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int a=0; a<t; a++){
      //user input
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0; i<n; i++) arr[i]=sc.nextInt();
      
      int[] res=new int[n];
      int max=0;
      for(int i=0; i<n; i++){
        int min=Integer.MIN_VALUE;
        boolean value=false;
        for(int j=i-1; j>=0; j--){
          if(i==0) res[i]=0;
          else{
            if(arr[j]>min && arr[j]<0){
              min=arr[j];
              value=true;
            }
          }
          
        }
        if(value) res[i]=min;
        else res[i]=0;
      }
      
      //print result
      for(int i=0; i<n; i++) System.out.print(res[i]+" ");
      System.out.println();
    }
  }
}
