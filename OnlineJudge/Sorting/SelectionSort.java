// time complexity - O(n^2) and Space complexity - O(1)
// https://oj.masaischool.com/contest/1378/problem/2
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }
    //selection sort
    int temp=0, min=0;
    for(int i=0; i<n-1; i++){
      for(int j=i+1; j<n; j++){
        min=i;
        if(arr[min]<arr[j]) min=j;
         temp=arr[min];
      arr[min]=arr[j];
      arr[j]=temp;
      }   
    }
    for(int i=0; i<n; i++) System.out.print(arr[i]+" ");
  }
}
