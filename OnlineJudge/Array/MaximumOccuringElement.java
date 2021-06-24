//https://oj.masaischool.com/contest/1167/problem/3
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }
    
    //logic
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0; i<n;i++){
      if(map.containsKey(arr[i])){
        int count=map.get(arr[i]);
        map.put(arr[i],count+1);
      }
      else{
        map.put(arr[i],1);
      }
    }
    
    //printing the max element
    int key=0;
    int count=0, max_count=0;
    for(Map.Entry<Integer,Integer> set: map.entrySet()){
     count=set.getValue();
      if(count>max_count){
        max_count=count;
        key=set.getKey();
      }
    }
    System.out.print(key);
  }
}
