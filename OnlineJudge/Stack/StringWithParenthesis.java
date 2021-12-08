
// https://oj.masaischool.com/contest/2417/problem/3
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Stack<Character> st=new Stack<>();
        Boolean val = true;
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{' || ch==')' || ch==']' || ch=='}'){
                if(ch=='(') st.push(')');
                else if(ch=='[') st.push(']');
                else if(ch=='{') st.push('}');
                else {
                    if(st.isEmpty() || st.pop()!=ch){
                        val = false;
                        break;
                    }
                }
            }
        }
        if(val && st.isEmpty()) {
            System.out.println("balanced");
        } else {
            System.out.println("unbalanced");
        }
    }
}
