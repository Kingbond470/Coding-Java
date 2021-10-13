import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int q=sc.nextInt();
    sc.nextLine();
    Queue<Integer> queue=new LinkedList<>();
    for(int a=0; a<q; a++){
      String str=sc.next();
      if(str.equals("E")){
        // add element to queue and print size
        int value=sc.nextInt();
        queue.add(value);
        System.out.println(queue.size());
      }
      else if(str.equals("D")){
        // remove element from queue and print the size and also check cond for size 
        if( queue.size()==0) System.out.println("-1"+" "+queue.size());
        else{
          int remove_value=queue.remove();
          System.out.println(remove_value+" "+queue.size());
        }
      //  sc.nextLine();
      }
      
    }// end of query
  }
}
      
