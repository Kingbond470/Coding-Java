//https://oj.masaischool.com/contest/1167/problem/4
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.nextLine();
    String[] arr=new String[n];
    for(int i=0; i<n; i++){
      arr[i]=sc.nextLine();
    }
    
    String t1=arr[0];
    int t1_count=0;
    String t2="";
    int t2_count=0;
    for(int i=0; i<n; i++){
      if(t1.equals(arr[i])) t1_count++;
      else{
        t2=arr[i];
        t2_count++;
      }
    }
    System.out.print(t1_count>t2_count? t1:t2);
    
    /*
    HashMap<String,Integer> map=new HashMap<>();
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
    String key="";
    int count=0, max_count=0;
    for(Map.Entry<String,Integer> set: map.entrySet()){
     count=set.getValue();
      if(count>max_count){
        max_count=count;
        key=set.getKey();
      }
    }
    System.out.print(key);
    */
  }
}
  
