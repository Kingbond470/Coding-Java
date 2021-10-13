// https://oj.masaischool.com/contest/1538/problem/D5-2
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int query = sc.nextInt();
    Queue<Integer> queue=new LinkedList<>();
    for(int i=0; i<query; i++){
      String str=sc.next();
      if(str.equals("E")){
       // System.out.println(queue.add(sc.nextInt()));
        int value=sc.nextInt();
        queue.add(value);
      //  System.out.println(value);
      }
      if(str.equals("D")){
        if(queue.size()==0) System.out.println("Empty"); 
        else System.out.println(queue.remove());
      }
    }
  }
}
