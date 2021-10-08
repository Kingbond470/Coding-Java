// https://oj.masaischool.com/contest/2088/problem/1-1

// Brute Force
//Enter code here
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int a=0; a<t; a++){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0; i<n; i++) arr[i]=sc.nextInt();
            
            int max=0;
            int idxValue=-1;
            for(int i=0; i<n; i++){
                int count=0;
                for(int j=0; j<n; j++){
                    if(arr[i]==arr[j]) count++;
                }
                if(count>n/2){
                    max=count;
                    idxValue=arr[i];
                    break;
                }
            }
            System.out.println(idxValue);
        }
    }
}
// tc- O(n^2)
// sc- O(1)

// HashMap Appraoch
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int a=0; a<t; a++){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0; i<n; i++)arr[i]=sc.nextInt();
            
            HashMap<Integer, Integer> map=new HashMap<>();
            for(int i=0; i<n; i++){
                if(map.containsKey(arr[i])){
                    int value=map.get(arr[i]);
                    map.put(arr[i], ++value);
                }
                else {
                    map.put(arr[i], 1);
                }
            }
            
            int val=-1;
            for(Map.Entry<Integer,Integer> set:map.entrySet()){
               // System.out.println(set.getValue());
                if(set.getValue()>n/2){
                    val=set.getKey();
                } 
            }
            
            
            System.out.println(val);
        }
    }
}
/*
Tc- O(nlogn)
Sc- O(n)
*/
