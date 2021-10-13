//https://oj.masaischool.com/contest/1269/problem/4
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.nextLine();
    String str=sc.nextLine();
    //to stroe the final result 
    String output="";
    for(int i=0; i<str.length(); i++){
      if(output.compareTo(str.substring(i))<=0){
        output=str.substring(i);
      }
    }
    System.out.println(output);
  
  }
}
