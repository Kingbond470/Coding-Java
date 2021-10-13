// https://oj.masaischool.com/contest/1085/problem/18
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0; i<t; i++){
      int x=sc.nextInt();
      int y=sc.nextInt();
      
      if(x==y) System.out.println(x*x-(y-1));
      else if(x>y) {
        if(x%2==0) System.out.println(x*x-(y-1));
        else System.out.println((x-1)*(x-1)+y);
      }
      else{
        if(y%2==0) System.out.println((y-1)*(y-1)+x);
        else System.out.println(y*y-(x-1));
      } 
    }
    
  }
}


//another method
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0; i<t; i++){
      int x=sc.nextInt();
      int y=sc.nextInt();
      System.out.println(x>y?(x%2==0)? x*x-(y-1):(x-1)*(x-1)+y : (y%2==0)?(y-1)*(y-1)+x : y*y-(x-1));
    }                                                               
  }
}
