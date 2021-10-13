import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class Main{
  public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Stack<Integer> stack=new Stack<>();
    Queue<Integer> queue=new LinkedList<>();
    for(int a=0; a<n; a++){
      int q=sc.nextInt();
      if(q==1) queue.add(sc.nextInt());

      else if(q==2) stack.push(sc.nextInt());
      else if(stack.empty() || queue.size()==0) System.out.println("-1");
      else if(q==3) System.out.println(queue.peek());
      else if(q==4) System.out.println(stack.peek());
      else if(q==5)stack.push(queue.remove());
    }
  }
}
      
