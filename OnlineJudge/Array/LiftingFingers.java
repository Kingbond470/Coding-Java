// https://oj.masaischool.com/contest/2060/problem/5
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int a=0; a<t; a++){
            String str=sc.next();
            int count=1;
            for(int i=1; i<str.length(); i++){
               // System.out.println(str.charAt(i));
               if(str.charAt(i)!=str.charAt(i-1)) {
                   count++;
               }
            }
            
            System.out.println(count);
            
            
        }
    }
}
