// https://oj.masaischool.com/contest/1608/problem/D5-1
import java.util.*;
public class Main{
  public static void main(String[] args){	
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   // int count=0;
    System.out.println(countPossibleWays(n));
    
  }
  
  public static int countPossibleWays(int n){
    if(n<0) return 0;
    if(n==0) return 1;
    return countPossibleWays(n-1)+countPossibleWays(n-2)+countPossibleWays(n-3);
  }
}

      
