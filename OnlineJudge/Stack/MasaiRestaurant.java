// https://oj.masaischool.com/contest/1414/problem/2
import java.util.Scanner;
import java.util.Stack;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int q = sc.nextInt();
    Stack stack = new Stack();
    for(int i=0; i<q; i++) {
      int n = sc.nextInt();
      if(n==1) {
        if(stack.size()>0) System.out.println(stack.pop());
        else System.out.println("No Food");
      } else {
        stack.push(sc.nextInt());
      }
    }
  }
}
