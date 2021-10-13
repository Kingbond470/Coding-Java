//https://oj.masaischool.com/contest/1204/problem/2
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int a=0; a<t; a++){
      int n=sc.nextInt();
      int[][] arr=new int[n][n];
      for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
          arr[i][j]=sc.nextInt();
        }
      }
      
      //pattern printing 
      for(int i=0; i<n; i++){
        System.out.print(arr[i][0]+" ");
      }
      
      for(int i=n-2; i>=0; i--){
        System.out.print(arr[i][n-i-1]+" ");
      }
      for(int i=1; i<n; i++){
        System.out.print(arr[i][n-1]+" ");
      }
      System.out.println();
    }
  }
}
