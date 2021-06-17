import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    String str=sc.next();
    sc.nextLine();
    int k=sc.nextInt();
    String result="";
   for(int i=0; i<str.length(); i++){
       char new_char=str.charAt(i);
       int value=(int)new_char+k;
      while(value>122){
          
 value=value%122;
 value=value+96;
// System.out.print(value+" ");
      
      }
//        if(value>122){
// value=value%122;
// value=value+96;
// System.out.print(value+" ");
//        } 
       char add_char=(char)value;
       result=result+add_char;
   }
   System.out.println(result);
  }
}

/*
3
abz
2
ans - cdb
*/
