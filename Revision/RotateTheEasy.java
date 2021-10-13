// https://oj.masaischool.com/contest/2088/problem/2-1
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int a=0; a<t; a++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            k=k%n;
            int[] arr=new int[n];
            for(int i=0; i<n; i++) arr[i]=sc.nextInt();
            
            while(k--!=0){
                int last=arr[n-1];
                for(int i=n-1; i>0; i--){
                    arr[i]=arr[i-1];
                }
                arr[0]=last;
            }
            
            for(int i=0; i<n; i++) System.out.print(arr[i]+" ");
            System.out.println();
        }
    }
}
