// https://oj.masaischool.com/contest/2350/problem/2
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t--!=0){
            int n=sc.nextInt();
           int[] arr=new int[n];
           for(int i=0; i<n; i++) arr[i]=sc.nextInt();
          
           int miss=-1, repeat=-1;
           
         for(int i=0; i<n; i++){
            int val = Math.abs(arr[i]);
			if (arr[val - 1] > 0)
				arr[val - 1] = -arr[val - 1];
			else
				repeat=val;
         } 
           
        for(int i=0; i<arr.length; i++){
           if (arr[i] > 0) miss=i + 1;
        }
        
        System.out.println(miss+" "+repeat);
                       
        }
    }
}
