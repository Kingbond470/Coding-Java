// https://oj.masaischool.com/contest/1995/problem/4
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int a=0; a<t; a++){
            int n=sc.nextInt();
            int N=2*n;
            long[] arr=new long[N];
            for(int i=0; i<N; i++) arr[i]=sc.nextLong();
            
            
            // logic
            Arrays.sort(arr);
           System.out.println(Math.abs(arr[n]-arr[n-1]));
        }
    }
}
