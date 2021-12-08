// https://oj.masaischool.com/contest/2393/problem/2
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        
       String res="";
       int count=1;
       
       //aaabbbbcc
       // ab
       for(int i=1; i<=str.length(); i++){
           if(i==str.length() || str.charAt(i)!=str.charAt(i-1)){
               res=res+str.charAt(i-1)+count;
               count = 1;
           } else if(str.charAt(i)==str.charAt(i-1)){
               count++;
           }
           
       }
        System.out.println(res);
       
        
    } 
}
