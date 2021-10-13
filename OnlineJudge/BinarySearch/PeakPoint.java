// https://oj.masaischool.com/contest/1818/problem/3
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int a=0; a<t; a++){
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
      }
      
      int idx=-1;
      int max=Integer.MIN_VALUE;
      for(int i=0; i<n; i++){
        if(i!=0 && i!=n-1){
        //  System.out.print(" index "+ i);
          if(arr[i]>max){
            idx=i;
            max=arr[i];
          }
        }
      }
      
      System.out.println(idx);
    }// end of test case
  }	// end of main
}
