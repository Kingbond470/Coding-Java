// https://oj.masaischool.com/contest/1598/problem/D4-1
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(factValue(n));
  }
  
  public static int factValue(int n){
    int res=1;
    if(n==1  || n==0)
      return res;
    else if(n<1)
      return 0;
    else{
      return n*factValue(n-1);
     // res=res*factValue(n-1);
    }
  }
}
