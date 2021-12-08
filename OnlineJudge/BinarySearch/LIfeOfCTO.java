// https://oj.masaischool.com/contest/2466/problem/3
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        int idx=-1;
        for(int i=0 ; i<n; i++){
            arr[i]=sc.nextInt();
            if(arr[i]==1){
                idx=i;
                break;
            } 
        }
        
        System.out.println(idx);
    }
}
