// https://oj.masaischool.com/contest/1608/problem/D5-4
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int t=sc.nextInt();
    for(int a=0; a<t; a++){
      int n=sc.nextInt();
      String res="";
      String output=binaryValue(n,res);
      String res1="";
      for(int i=output.length()-1; i >=0; i--) res1=res1+output.charAt(i);
      System.out.println(res1);
    }
  }
  
  
  public static String binaryValue(int n, String res){
    if(n==0) return res;
    else{
      res=res+n%2;
      n=n/2;
      return binaryValue(n,res);
    }
  }
  
}
