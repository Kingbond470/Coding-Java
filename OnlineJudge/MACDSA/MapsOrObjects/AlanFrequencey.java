// https://oj.masaischool.com/contest/2407/problem/1
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        char[] arr=str.toCharArray();
        
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0; i<n; i++){
            char ch=arr[i];
            
            if(map.containsKey(ch)){
                int count=map.get(ch);
                map.put(ch,count+1);
            }else{
                map.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> set:map.entrySet()){
            System.out.println(set.getKey()+"-"+set.getValue());
        }
    }
}
