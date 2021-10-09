// https://oj.masaischool.com/contest/2088/problem/1-2
// tc- O(n)
// sc- O(n)
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int a=0; a<t; a++){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int oddCount=0, evenCount=0;
            for(int i=0; i<n; i++) {
                arr[i]=sc.nextInt();
                if(arr[i]%2==0) evenCount++;
            }
            oddCount=n-evenCount;
            int q=sc.nextInt();
            
            int[] even=new int[evenCount];
            int[] odd=new int[oddCount];
            
            Arrays.sort(arr);
            //O(nlogn)
            
            int ei=0, oi=0;
            for(int i=0; i<n; i++){
                if(arr[i]%2==0) {
                    even[ei]=arr[i];
                    ei++;
                }
                else{
                    odd[oi]=arr[i];
                    oi++;
                }
            }
            if(q==1){
                for(int i=0; i<ei; i++) System.out.print(even[i]+" ");
            for(int i=0; i<oi; i++) System.out.print(odd[i]+" ");
            }else{
            for(int i=0; i<oi; i++) System.out.print(odd[i]+" ");
            for(int i=0; i<ei; i++) System.out.print(even[i]+" ");
            }
            
        System.out.println();
            
        }
    }
}
