// https://oj.masaischool.com/contest/2355/problem/4
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
            arr=minimalNumber(arr);
            for(int i=0; i<n; i++) System.out.print(arr[i]);
            System.out.println();
        }
    }
    
    public static int[] minimalNumber(int[] arr){
        Arrays.sort(arr);
        // to avoid the leading zero
        int firstVal=arr[0];
        if(firstVal==0){
            for(int i=0; i<arr.length; i++){
                if(arr[i]!=0){
                    arr[0]=arr[i];
                    arr[i]=0;
                    break;
                }
            }
        }
        return arr;
        
    }
}
