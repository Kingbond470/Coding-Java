// https://oj.masaischool.com/contest/1608/problem/D5-3
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0; i<t; i++){
      long p=sc.nextLong();
      System.out.println(nickAndHack(p,1));
    }
  }
  
  public static String nickAndHack(long p, long n ){
    if(n==p) return "Yes";
    if(n>p) return "No";
    if(nickAndHack(p,n*10).equals("Yes")) return "Yes";
    if(nickAndHack(p,n*20).equals("Yes")) return "Yes";
    return "No";
  }
  
}
