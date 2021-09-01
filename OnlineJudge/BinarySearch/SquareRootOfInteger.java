// https://oj.masaischool.com/contest/1790/problem/3
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int t=sc.nextInt();
    for(int a=0; a<t; a++){
      int n=sc.nextInt();
      System.out.println(squareRoot(n));
     
      
    }
  }
  
  public static int squareRoot(int number){
    for(int i=1; i<number; i++){
      if(i*i==number) return i;
      else if(i*i>number) return i-1; 
    }
    return 1;
  }
  
  public static int sroot(int n) {
    while(
  }
}
