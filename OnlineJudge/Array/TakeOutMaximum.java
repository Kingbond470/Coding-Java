// Time complexity - O(n) Space Complexity - O(n)
// https://oj.masaischool.com/contest/1301/problem/2
import java.util.Scanner;
import java.util.ArrayList;
public class Main{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  // user input
  int n=sc.nextInt();
  int k=sc.nextInt();
  int[] arr=new int[n];
  ArrayList<Integer> sums = new ArrayList<>();
  int sum=0;
  for(int i=0; i<n; i++){
    arr[i]=sc.nextInt();
    sum+=arr[i];
    // for getting sum
    if(i>=k) sum-=arr[i-k];
    // for adding value to arraylist
    if(i>=k-1) sums.add(sum);
  }
  
  int max = sums.get(0);
  for(int i=0; i<sums.size(); i++){
    //System.out.println(sums.get(i));
    if(sums.get(i)>max) max=sums.get(i);
  }
  System.out.print(max);
  
}
}


/*
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    //taking user input
    int n=sc.nextInt();
    int k=sc.nextInt();
    int[] arr=new int[n];
    //for storing the sum
   int sum=0, max_sum=0;
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
      sum=sum+arr[i];
      if(i>=k) sum=sum-arr[i-k];
      if(sum>max_sum) max_sum=sum;
    }
    System.out.println(max_sum);
  }
}
    
*/
