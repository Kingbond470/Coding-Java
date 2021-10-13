// https://oj.masaischool.com/contest/1995/problem/1
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] builder=new long[n];
        long[] protein=new long[n];
        for(int i=0; i<n; i++)builder[i]=sc.nextLong();
        for(int i=0; i<n; i++) protein[i]=sc.nextLong();
        Arrays.sort(builder);
        Arrays.sort(protein);
        long sum=0;
        for(int i=0; i<n; i++){
            sum=sum+builder[i]*protein[i];
        }
        System.out.println(sum);
        
    }
}
