// https://oj.masaischool.com/contest/1660/problem/1
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int a=0; a<t; a++){
      long n=sc.nextInt();
     System.out.println(fact(2*n)/(fact(n)*fact(n+1)));
      fun("",0,0,n);
    }
  }
    
  
  
  public static long fact(long n){
    if(n==0) return 1;
    else return n*fact(n-1);
  }
    public static void fun(String s, int open, int close,long n){
      if(s.length()==2*n){
      //	System.out.println(n);
        System.out.println(s);
        return;
      }
      if(open<n)  fun(s+"(",open+1,close,n);
      if(open>close) fun(s+")",open, close+1, n);
      
    }
  }
