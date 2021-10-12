//https://oj.masaischool.com/contest/2088/problem/2-2
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int a=0; a<t; a++){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0; i<n; i++) arr[i]=sc.nextInt();
            
            HashMap<Integer, Integer> map=new HashMap<>();
            for(int i=0; i<n; i++){
                if(map.containsKey(arr[i])){
                    int value=map.get(arr[i]);
                    map.put(arr[i], ++value);
                }else{
                    map.put(arr[i], 1);
                }
            }
            
            int res=0;
            for(Map.Entry<Integer, Integer> set:map.entrySet()){
                // if(map.getValue()==1){
                //     res=map.getKey();
                //     break;
                // }
                int value=set.getValue();
                if(value==1){
                    res=set.getKey();
                    break;
                }
            }
            System.out.println(res);
        }
    }
}
