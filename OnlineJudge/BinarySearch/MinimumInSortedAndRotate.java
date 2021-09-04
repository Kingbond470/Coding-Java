// https://oj.masaischool.com/contest/1818/problem/2
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
   
    for(int i=0; i<n; i++){
   //   int value=sc.nextInt();
    //  if(value<min) min=value;
      arr[i]=sc.nextInt();
    }
    
    int min=Integer.MAX_VALUE;
    for(int i=0; i<n; i++){
      if(arr[i]<min) min=arr[i];
    }
    System.out.println(min);
  }
}
