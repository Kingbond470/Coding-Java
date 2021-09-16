// https://oj.masaischool.com/contest/1913/problem/3
import java.util.*;
public class Main{
  public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0; i<n; i++) arr[i]=sc.nextInt();
    
    int sum=0;
    int count=0;
    int curr=arr[0];
    for(int i=0; i<n; i++){
      if(i==n-1) {
        count++;
        sum+=count*curr;
      } else if(curr>arr[i]){
        sum += count*curr;
        curr=arr[i];
        count=0;
      }
      count++;
    }
    System.out.println(sum);
    
  }
}
