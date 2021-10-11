// https://oj.masaischool.com/contest/2099/problem/3
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        boolean val=false;
        for(int i=0; i<n ; i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==1)  val=true;
        } 
        
        int max=0, count=1;
        int prev=arr[0];
        
        if(val){
        for(int i=1; i<n; i++){
            if(arr[i]%2==1 && arr[i]==prev) count++;
            else{
                count=1;
                prev=arr[i];
            }
            max=Math.max(count, max);
        }
    }
        System.out.println(max);
    }
}
