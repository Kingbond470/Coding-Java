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

//Another approach using count
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
    
    int max_count=0;
    for(int i=0; i<n; i++){
      int count=0;
      while(arr[i]<k){
        arr[i]++;
       // System.out.print(arr[i]+" ");
        count++;
      }
      if(count>max_count) max_count=count;

    }
     
   System.out.println(max_count);
        

  }
}

//using k-min value of array
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
    int min=arr[0];
    for(int i=0; i<n; i++){
		if(arr[i]<min) min=arr[i];
    }
    int min_step=0;
    if(min<k) min_step=k-min;
    System.out.print(min_step);

  }
}
