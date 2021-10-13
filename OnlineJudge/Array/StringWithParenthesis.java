// https://oj.masaischool.com/contest/1555/problem/3
import java.util.*;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    char[] arr=str.toCharArray();
    Stack<Character> stack=new Stack<>();
    boolean value=true;
    
    // logic
    for(int i=0; i<arr.length; i++){
      if(arr[i]=='[') stack.push(']');
      else if(arr[i]=='(') stack.push(')');
      else if(arr[i]=='{') stack.push('}');
      else if(arr[i]==']' || arr[i]=='}' || arr[i]==')'){
        if(stack.empty() || stack.pop()!=arr[i]){
          value=false;
          break;
        }
      }
      else continue;
    }
    System.out.println(value?"balanced":"unbalanced");
  }
}
    
