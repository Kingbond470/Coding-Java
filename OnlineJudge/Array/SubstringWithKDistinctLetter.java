// https://oj.masaischool.com/contest/1365/problem/4
import java.util.Scanner;
import java.util.HashSet;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    sc.nextLine();
    String str=sc.nextLine();
    int count=0;
    for(int start=0, end=k; end<=str.length(); start++, end++){
      //System.out.println(str.substring(start,end));
      if(check(str.substring(start,end))) count++;  
    }
    System.out.println(count);
    
  }// end of main
  
  
  public static boolean check(String str){
    boolean b=true;
    HashSet<Character> set= new HashSet<>();
    for(int i=0; i<str.length(); i++){
      if(set.contains(str.charAt(i))) {
        b=false;
        return b;
      }
      set.add(str.charAt(i));
    }
    return b;
  }
  
}
