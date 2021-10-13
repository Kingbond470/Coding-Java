// https://oj.masaischool.com/contest/1775/problem/2
import java.util.Scanner;
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int q=sc.nextInt();
    Queue<Integer> queue=new LinkedList<>();
    int s=0;
    for(int i=0; i<q; i++){
      int n=sc.nextInt();
     
      if(n==1){
        queue.add(sc.nextInt());
      }
      if(n==2){
        if(queue.isEmpty()){
                  //System.out.println("No More Tokens");
          s=s-1;
        }

        else {
          int number=queue.remove();
          s=s+number;
        }
      }
      
    }//end of query
    System.out.println(s);
  } 	
  
}
