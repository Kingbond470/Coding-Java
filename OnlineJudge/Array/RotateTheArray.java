//Time Complexity -O(n) and Space Complexity - O(1) 
// https://oj.masaischool.com/contest/1301/problem/1
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int a=0; a<t; a++){
      //user input
      int n=sc.nextInt();
      int k=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
      }
      k=k%n;
      for(int i=n-k; i<n; i++) System.out.print(arr[i]+ " ");
      for(int i=0; i<n-k; i++) System.out.print(arr[i]+" ");
      System.out.println();
    }//end of test case
  }// end of main
}
