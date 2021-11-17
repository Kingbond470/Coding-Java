// https://oj.masaischool.com/contest/2350/problem/3
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
            System.out.println(maxSubArray(arr));
            
        }
    }
    
    // to find the max sub array length
    public static int maxSubArray(int[] arr){
        
        int count=0;
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            
            if(list.contains(arr[i])){
                while(list.contains(arr[i])){
                    list.remove(0);
                }
                list.add(arr[i]);
            }else{
                list.add(arr[i]);
                if(list.size()>count) count=list.size();
            }
        }
        return count;
        
    }
    
}
