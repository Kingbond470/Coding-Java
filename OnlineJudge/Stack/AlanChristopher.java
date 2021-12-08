// https://oj.masaischool.com/contest/2417/problem/5
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            String str=sc.next();
            Stack<Character> st=new Stack<>();
            for(int i=0; i<str.length(); i++){
                char ch=str.charAt(i);
                if(ch=='#'){
                    if(!st.isEmpty()){
                        st.pop();
                    }
                    
                }else st.push(ch);
            }
            //System.out.println(st);
            for(int i=0; i<st.size(); i++){
                System.out.print(st.get(i));
            }
            System.out.println();
        }
    }
}
