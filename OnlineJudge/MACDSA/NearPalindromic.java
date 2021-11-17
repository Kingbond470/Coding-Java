// https://oj.masaischool.com/contest/2355/problem/1
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String str=sc.next();
            System.out.println(palindromic(str,k)?"True":"False");
        }
    }
    
    public static boolean palindromic(String str, int k){
        int first=0, last=str.length()-1;
        
        while(first<last){
            if(str.charAt(first)!=str.charAt(last)){
                k--;
            }
            first++;
            last--;
            if(k<0) return false;
        }
        return true;
    }
}
