// https://oj.masaischool.com/contest/1515/problem/D3-1
import java.util.Stack;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    for(int a=0; a<t; a++){
      String str=sc.nextLine();
      char[] arr=str.toCharArray();
      
      Stack<Character> stack=new Stack<>();
      boolean b=true;
      if(arr.length%2!=0) b=false;
      else{
      for(int i=0; i<arr.length; i++){
        if(arr[i]=='[') stack.push(']');
        else if(arr[i]=='{') stack.push('}');
        else if(arr[i]=='(') stack.push(')');
        else if(stack.empty() || stack.pop() !=arr[i]) b=false;
      }
      }
      System.out.println(!b?"not balanced":"balanced");
    }
  }
}
