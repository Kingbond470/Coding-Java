// time complexity -O(n) and space complexity - O(n)
// https://oj.masaischool.com/contest/1429/problem/2
import java.util.Scanner;
import java.util.ArrayList;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    ArrayList<Character> list=new ArrayList<>();
    for(int i=0; i<str.length(); i++){
      list.add(str.charAt(i));
    }
   // System.out.println(list);
    String res="";
    for(int i=1; i<list.size();){
      if(list.get(i)==list.get(i-1)) {
        list.remove(i);
        list.remove(i-1);
      }
      else i++;
    }
    for(int i=0; i<list.size(); i++) res=res+list.get(i);
    System.out.println(res.length()>0?res:"Empty String");
  }
}
