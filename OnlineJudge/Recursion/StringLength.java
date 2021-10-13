// https://oj.masaischool.com/contest/1598/problem/D4-3
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int count=0;
    System.out.println(countLengthString(str, count));
  }
  
  public static int countLengthString(String str, int count){
   try{
     if(str.charAt(count)==-1) return count;
     else return countLengthString(str, count+1);
   }
    catch(Exception e){
      return count;
    }
    
  }
}


// using string comaprision
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int count=0;
    String res="";
    System.out.println(countLengthString(str, res,count));
  }
  
  public static int countLengthString(String str,String res, int count){
    if(res.equals(str)) return count;
    else{
      res=res+str.charAt(count);
      count++;
      return countLengthString(str, res, count);
    }
    
  }
}
