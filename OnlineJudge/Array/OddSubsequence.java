// https://oj.masaischool.com/contest/2070/problem/2
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int a=0; a<t; a++){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0; i<n; i++) arr[i]=sc.nextInt();
            
            boolean value=false;
            for(int i=0; i<n; i++){
                if(arr[i]%2==1){
                    value=true;
                    break;
                }
            }
            System.out.println(value?"yes":"no");
        }
    }
}
