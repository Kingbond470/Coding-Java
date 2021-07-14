// https://oj.masaischool.com/contest/1403/problem/1
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
    
    int temp=0;
    for(int i=0; i<n-1; i++){
      for(int j=0; j<n-i-1; j++){
        if(arr[j]%k >arr[j+1]%k){
          temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
   
    for(int i=0; i<n; i++){
      System.out.print(arr[i]+" ");
    }
  }
}
