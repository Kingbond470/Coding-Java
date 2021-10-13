// https://oj.masaischool.com/contest/1598/problem/D4-2
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(fiboValue(n));
  }
  
  public static int fiboValue(int n){
    
    int res=0;
    if(n==0) return 0;
    else if(n==1) return 1;
    else{
      return res+fiboValue(n-1)+fiboValue(n-2);
    }
  }
  
}
