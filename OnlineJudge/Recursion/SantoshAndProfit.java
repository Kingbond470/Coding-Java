// https://oj.masaischool.com/contest/1629/problem/1
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int a=0; a<t; a++){
      int n=sc.nextInt();
      System.out.println(deliverMilk(n));
    }
  }
  
  
  public static int deliverMilk(int n){
    if(n==0) return 1;
    else if(n<0) return 0;
    return deliverMilk(n-4)+deliverMilk(n-8);
  }
}
