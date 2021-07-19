// https://oj.masaischool.com/contest/1453/problem/04
import java.util.Scanner;
import java.util.Stack;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    for(int a=0; a<t; a++){
      String str=sc.nextLine();
      Stack<Character> stack=new Stack<>();
      for(int i=0; i<str.length(); i++){
        if(str.charAt(i)=='#'){
          if(!stack.empty()) stack.pop(); 
        }
        else stack.push(str.charAt(i));
      }
      String res="";
      for(int i=0; i<stack.size(); i++) res=res+stack.get(i);
      System.out.println(res);
    }
  }
}


/* using string - run time error
import java.util.Scanner;
import java.util.Stack;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    for(int a=0; a<t; a++){
      String str=sc.nextLine();
      str=str.replaceAll(" ","");
      StringBuilder res=new StringBuilder();
      for(int i=str.length()-1; i>=0; i--){
        if(str.charAt(i)=='#') i=i-1;
        else res.append(str.charAt(i));
      }
      System.out.println(res.reverse());
    }
  }
}
*/
