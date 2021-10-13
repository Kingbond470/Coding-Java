// https://oj.masaischool.com/contest/1775/problem/3
import java.util.Scanner;
import java.util.*;
public class Main{ 
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int a=0; a<t; a++){
      int n=sc.nextInt();
      int m=sc.nextInt();
      Stack<Character> stack=new Stack<>();
     String str=sc.next();
     // System.out.println((n-m)!=0?"no":"yes");
      boolean value=true;
      for(int i=0; i<str.length(); i++){
        if(str.charAt(i)=='(') stack.push(str.charAt(i));
        else if(str.charAt(i)==')') {
          if(!stack.isEmpty()) stack.pop();
          else {
            value=false;
          break;
          }
        }
      }
      
      
     System.out.println(stack.size()==0 && value?"yes":"no");
    }
    
  }//end of test case
}
