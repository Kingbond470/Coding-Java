// https://oj.masaischool.com/contest/2088/problem/3-3
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            long[] arr=new long[n];
            for(int i=0; i<n; i++) arr[i]=sc.nextLong();
            
            long max_sum_sofar=Long.MIN_VALUE;
            long max_ending_sum=0;
            
            for(int i=0; i<n; i++){
                max_ending_sum=max_ending_sum+arr[i];
                if(max_ending_sum>max_sum_sofar){
                    max_sum_sofar=max_ending_sum;
                }
                if(max_ending_sum<0){
                    max_ending_sum=0;
                }
            }
            
            System.out.println(max_sum_sofar);
        }
        
    }
}
