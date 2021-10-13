// https://oj.masaischool.com/contest/1429/problem/1
// TC- O(n^2) and SC- O(n)
import java.util.Scanner; 
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    //taking user input
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0; i<n; i++) arr[i]=sc.nextInt();
    
    // maknig result
    int[] res=new int[n];
    for(int i=0; i<n; i++){
      if(i==0) res[i]=-1;
      boolean b=false;
      for(int j=i-1; j>=0; j--){
        if(arr[j]<arr[i]){
          res[i]=arr[j];
          b=true;
          break;
        }
      if(!b) res[i]=-1;  
    }
    }
    
    for(int i=0; i<n; i++) System.out.print(res[i]+" ");
  }
}
      
