// https://oj.masaischool.com/contest/2342/problem/2
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(localMax(arr));
            
            // logic
        }
    }
    
    public static int localMax(int[] arr){
        int count=0;
        
        if(arr.length<3) return -1;
        
        // exclude first and last element
        for(int i=1; i<arr.length-1; i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) count++;
        }
        return count;
        
    }
}
