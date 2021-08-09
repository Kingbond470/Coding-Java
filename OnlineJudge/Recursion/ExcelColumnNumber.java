// https://oj.masaischool.com/contest/1629/problem/3
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int a=0; a<t; a++) {
      //user input
     	String str=sc.next();
     // System.out.print(str);
      System.out.println(countColNumber(str, str.length()));
    }
  }
  
  // function to calcualte value
  public static long countColNumber(String str, int n){
    if(n==0) return 0; 
    else return str.charAt(n-1)-'A'+1 + 26*countColNumber(str, n-1);
   
  }
}
