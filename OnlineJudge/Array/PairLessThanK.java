// https://oj.masaischool.com/contest/1453/problem/01
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int a=0; a<t; a++){
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0; i<n; i++) arr[i]=sc.nextInt();
      int k=sc.nextInt();
      
    //  int max_sum=0, sum=0;
     // for(int i=0; i<n; i++){
      //  for(int j=i; j<n; j++){
       //   if(arr[i]+arr[j]<k){
        //   sum=arr[i]+arr[j];
        //    if(sum>max_sum) max_sum=sum;
        //  }
      //  }
     // }
		
     int sum=Integer.MIN_VALUE;
      for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
          if(arr[i]+arr[j]<k) sum=Math.max(sum,arr[i]+arr[j]);
        }
      }
     // System.out.println(max_sum !=0?max_sum:"-1");
      System.out.println(sum != Integer.MIN_VALUE? sum:"-1");
    }// end of test
  }
}
