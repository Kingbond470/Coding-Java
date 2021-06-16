/*
https://oj.masaischool.com/contest/1085/problem/17
*/
import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    System.out.println(k>arr[0]?k-arr[0]:0);
  }
}
