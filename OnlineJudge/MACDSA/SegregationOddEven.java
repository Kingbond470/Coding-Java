// https://oj.masaischool.com/contest/2342/problem/1

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
            int q=sc.nextInt();
            
            // logic
            printVal(arr,q);
        }
    }
    
    public static void printVal(int[] arr, int q){
        int remain=q%2;
        String str="";
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=remain){
                System.out.print(arr[i]+" ");
            }else{
                str=str+arr[i]+" ";
            }
        }
        System.out.println(str);
    }
}
