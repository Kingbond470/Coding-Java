// https://oj.masaischool.com/contest/2215/problem/3
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        String str=sc.next();
        
        int l1=sc.nextInt();
        int k1=sc.nextInt();
        int l2=sc.nextInt();
        int k2=sc.nextInt();
        
       // System.out.println(n+" "+k+" "+ l1+" "+l2+" "+k1+" "+k2+" "+str);
    
        char[] ch=str.toCharArray();
        String rev="";
        for(int i=0; i<l1; i++) rev=rev+ch[i];
        
        for(int i=k1; i>=l1; i--){
            rev=rev+ch[i];
        }
        
        for(int i=k1+1; i<ch.length; i++) rev=rev+ch[i];
       // System.out.println(rev);
       
       char[] ch1=rev.toCharArray();
       String res="";
       for(int i=0; i<l2; i++) res=res+ch1[i];
        
        for(int i=k2; i>=l2; i--){
            res=res+ch1[i];
        }
        
        for(int i=k2+1; i<ch1.length; i++) res=res+ch1[i];
        System.out.println(res);
        
    }
}
