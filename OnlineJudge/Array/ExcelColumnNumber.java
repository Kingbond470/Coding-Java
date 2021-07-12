// https://oj.masaischool.com/contest/1365/problem/5
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    for(int a=0; a<t; a++){
     String str=sc.nextLine();
    
    int n=0, sum=0;
    while(n<str.length()){
      sum=sum+(int)Math.pow(26,str.length()-n-1)*(str.charAt(n)-64);
      n++;
    }
    System.out.println(sum);
  }
}
}
