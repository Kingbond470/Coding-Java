// https://oj.masaischool.com/contest/1608/problem/D5-2
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    
    
    System.out.println(powerToValue(a,b));
  }
  
  public static int powerToValue(int a, int b){
    if(b==0) return 1;
    else{
      return a*powerToValue(a,b-1);
    }
  }
  
}
