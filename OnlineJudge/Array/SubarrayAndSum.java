//https://oj.masaischool.com/contest/1275/problem/11
// time complexity - O(n^3) and Space Complexity- ?
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
    
    
    int max_length=0, count=0;
    for(int i=0; i<n; i++){
      for(int start=0, end=n-i-1; end<n; start++, end++){
        if(max_length==0){										// to control the same sub array size of array
          if(subArraySum(arr,start,end)%k!=0){
            count++;
            max_length=end-start+1;			
          }
        }
        else if(end-start+1==max_length){
          if(subArraySum(arr,start,end)%k!=0) count++;
          }
        else break;
      }
    }
     System.out.println(count);    
  }//end of main
  
  //to find the sum of each sub array 
   public static int subArraySum(int[] arr, int i, int j){
    int sum=0;
    for(int a=i; a<=j; a++){
      sum=sum+arr[a];
    }
    return sum;
}
 
}
