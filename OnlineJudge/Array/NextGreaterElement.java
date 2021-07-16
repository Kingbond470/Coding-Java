// https://oj.masaischool.com/contest/1429/problem/3
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int a=0; a<t; a++){
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0; i<n; i++) arr[i]=sc.nextInt();
      
      int[] res=new int[n];
      //logic
      for(int i=0; i<n; i++){
        
        if(i==n-1) res[i]=-1;
        boolean b=false;
        for(int j=i; j<n; j++){
            if(arr[j]>arr[i]){
              res[i]=arr[j];
              b=true;
              break;
            }
          }
        if(!b) res[i]=-1;
        }
      
      for(int i=0; i<n; i++) System.out.print(res[i]+" ");
      System.out.println();

      
      
    }// end of test case
  }
}
