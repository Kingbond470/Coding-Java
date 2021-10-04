// https://oj.masaischool.com/contest/2060/problem/2
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        int k=sc.nextInt();
        
        int start=findFirst(arr, k);
        int end=findLast(arr, k);
        int count=findLast(arr, k)-findFirst(arr, k)+1;
        System.out.println(start+" "+end+" "+count);
        
        
    }
    
    public static int findFirst(int[] arr, int k){
        int idx=-1;
        int start=0, end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>=k){
                end=mid-1;
            }else{
                start=mid+1;
            }
            
            if(arr[mid]==k) idx=mid;
        }
        return idx;
    }
    
    public static int findLast(int[] arr, int k){
        int idx=-1, start=0, end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
           
            if(arr[mid]<=k){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
             if(arr[mid]==k) idx=mid;
        }
        return idx;
    }
}
