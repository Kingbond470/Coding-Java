// https://oj.masaischool.com/contest/2355/problem/3
//Brute Force
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];
        for(int i=0; i<n; i++) arr[i]=sc.nextLong();
        int q=sc.nextInt();
        
        while(q--!=0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            System.out.print(searchNumber(arr,l,r)+" ");
            
        }
        
    }
    
    public static int searchNumber(long[] arr, int l, int r){
        int ans=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=l && arr[i]<=r) ans++;
        }
        return ans;
    }
}
// Test case - 5/10


// Binary Search
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];
        for(int i=0; i<n; i++) arr[i]=sc.nextLong();
        int q=sc.nextInt();
        Arrays.sort(arr);
        while(q--!=0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            System.out.print(searchNumber(arr,l,r)+" ");
            
        }
        
    }
    
    public static int searchNumber(long[] arr, int l, int r){
        return rightCount(arr,l, r)-leftCount(arr,l,r)+1;
    }
    
    public static int leftCount(long[] arr, int l, int r){
        if(arr[0]<l && arr[0]<r) return 0;
        int low=0, high=arr.length-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(arr[mid]>=l) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
    
    public static int rightCount(long[] arr, int l, int r){
       if(arr[arr.length-1]<l) return 0;
       
        int low=0, high=arr.length-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(arr[mid]<=r) low=mid+1;
            else high=mid-1;
        }
        return high;
    }
}
