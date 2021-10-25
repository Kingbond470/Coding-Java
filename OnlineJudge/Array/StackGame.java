// https://oj.masaischool.com/contest/2215/problem/2
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String str=sc.next();
            Stack<Character> st=new Stack<>();
            
            boolean val=false;
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i)=='(') st.push(str.charAt(i));
                else{
                    if(st.isEmpty()){
                        val =true; 
                        break;
                    }
                    st.pop();
                }
            }
            
            
            if(val) System.out.println("no");
            else{
                if(st.size()%2==0) System.out.println("no");
                else System.out.println("yes");
            }
            
        }// end of testcase
    }
}
