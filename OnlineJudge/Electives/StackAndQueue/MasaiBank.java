// https://oj.masaischool.com/contest/1775/problem/1
import java.util.Scanner;
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int q=sc.nextInt();
    Queue<Integer> queue=new LinkedList<>();
    for(int i=0; i<q; i++){
      int n=sc.nextInt();
      if(n==1){
        queue.add(sc.nextInt());
      }
      if(n==2){
        if(queue.isEmpty()) System.out.println("No More Tokens");
        else System.out.println(queue.remove());
      }
      
    }
    
  } 	//end of query
  
}
