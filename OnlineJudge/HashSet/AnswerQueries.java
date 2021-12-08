// https://oj.masaischool.com/contest/2407/problem/2
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<n; i++){
            int val=sc.nextInt();
            if(!set.contains(val)) set.add(val);
        }
        int q=sc.nextInt();
        while(q--!=0){
            int search=sc.nextInt();
            if(set.contains(search)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
