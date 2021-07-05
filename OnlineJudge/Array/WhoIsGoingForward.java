//https://oj.masaischool.com/contest/1269/problem/2 
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }
    
    //logic
    int count=0;
    for(int i=0; i<n; i++){
      if(arr[i]>=arr[k-1] && arr[i]>0){
        count++;
      }
    }
    System.out.print(count);
  }
}
