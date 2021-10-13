// https://oj.masaischool.com/contest/1365/problem/1
import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int a=0; a<t; a++){
      //taking user input
      int n=sc.nextInt();
      HashSet<Integer> set= new HashSet<>();
      HashSet<Integer> set1= new HashSet<>();
      for(int i=0; i<n; i++){
        set.add(sc.nextInt());
      }
      for(int i=0; i<n; i++){
        set1.add(sc.nextInt());
      }
      int count=0;
      ArrayList<Integer> list=new ArrayList<>(set1);
      for(int i=0; i<list.size(); i++){
        if(set.contains(list.get(i))) count++;
      }
      System.out.println(count);
     
    }//end of test case
  }// end of main
}
