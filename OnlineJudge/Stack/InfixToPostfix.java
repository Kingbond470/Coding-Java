// https://oj.masaischool.com/contest/2417/problem/1-optional
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine().trim();
        System.out.println(infixTopostfix(expression));
    }
    public static String infixTopostfix(String str) {
        Stack<Character> st = new Stack<>();
        char[] ch = str.toCharArray();
        String res = "";
        
        for(int i=0; i<ch.length; i++) {
            if(bodmas(ch[i])>0) {
                while(!st.isEmpty() && bodmas(st.peek())>=bodmas(ch[i])) {
                    res += st.pop();
                }
                st.push(ch[i]);
            } else if(ch[i] == ')') {
                char c = st.pop();
                while(c!='(') {
                    res += c;
                    c = st.pop();
                }
            } else if(ch[i] == '(') {
                st.push(ch[i]);
            } else {
                res += ch[i];
            }
        }
        for(int i=0; i<st.size(); i++) {
            res += st.pop();
        }
        return res;
    }
    public static int bodmas(char ch) {
        if(ch == '+' || ch == '-') return 1;
        else if(ch == '*' || ch == '/') return 2;
        else if(ch == '^') return 3;
        else return -1;
    }
}
