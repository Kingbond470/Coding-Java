// https://oj.masaischool.com/contest/2393/problem/5
import java.util.*;
public class Main{
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int[] arr=new int[n];
         for(int i=0; i<arr.length; i++) arr[i]=sc.nextInt();
         boolean oddTrue=oddEvenCheck(arr, n);
        System.out.println(oddTrue?"Odd":"Even");
        
     }
     
     public static boolean oddEvenCheck(int[] arr, int length){
         
         int oddSum=0, evenSum=0;
         for(int i=0; i<length; i++){
             int val=arr[i];
             if(val%2==0) evenSum=evenSum+val;
             else oddSum=oddSum+val;
         }
         
         return oddSum>evenSum;
     }
}
