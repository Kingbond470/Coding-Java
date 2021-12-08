// https://oj.masaischool.com/contest/2393/problem/3
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int k=sc.nextInt();
        
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
    
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
               int res = 0;
               if(ch>='A' && ch<='Z'){
                   res=ch-'A';
                   res=(res+k)%26;
                   System.out.print((char)(res+'A'));
               } else if(ch>='a' && ch<='z'){
                   res=ch-'a';
                   res=(res+k)%26;
                   System.out.print((char)(res+'a'));
               }else{
                   res=ch-'0';
                   res=(res+k)%10;
                   System.out.print((char)(res+'0'));
               }
                
            }else {
                System.out.print(ch);
            }
        }
    }
}
