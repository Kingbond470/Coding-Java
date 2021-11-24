// https://oj.masaischool.com/contest/2407/problem/3
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            boolean b=false;
            HashSet<Integer> set=new HashSet<>();
            while(n--!=0){
                int input=sc.nextInt();
                if(!set.contains(input)) {
                    set.add(input);
                }else b=true;
            }
            System.out.println(b?"YES":"NO");
            
        }
    }
}
