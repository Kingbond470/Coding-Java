// https://oj.masaischool.com/contest/1173/problem/2

//Enter code here
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Main{
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int a=0; a<t; a++){
   int length=sc.nextInt();
   sc.nextLine();
   String str=sc.nextLine();
   
   //counting the frequency
   HashMap<Character, Integer> map=new HashMap<>(); 
   for(int i=0; i<length; i++){
     if(map.containsKey(str.charAt(i))){
       int count=map.get(str.charAt(i)); 
       map.put(str.charAt(i), count+1); 
     }
        else map.put(str.charAt(i),1); 
    }
        
    //  logic
    int odd_count=0;
    for(Map.Entry<Character,Integer> set:map.entrySet()){
      int value=set.getValue();
      if(value%2!=0) odd_count++;
    }
        if(odd_count>1) System.out.println("Not Possible!");
		else System.out.println("Possible!");
        
        } //end of test cases
     } 
}
   
