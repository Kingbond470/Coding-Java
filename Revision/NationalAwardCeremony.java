// https://oj.masaischool.com/contest/2088/problem/1-4
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int a=0; a<t; a++){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int one=0, zero=0;
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
                if(arr[i]==1) one++;
                else if(arr[i]==0) zero++;
            }
            
            int current = 0;
            while(n--!=0) {
                if(zero>0) {
                    zero--;
                } else if(one>0) {
                    current = 1;
                    one--;
                } else {
                    current = 2;
                }
                System.out.print(current+" ");
            }
            
            System.out.println();
        }
    }
}
