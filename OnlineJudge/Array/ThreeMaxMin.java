// https://oj.masaischool.com/contest/2393/problem/4
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<n; i++) {
            int val=sc.nextInt();
            if(!list.contains(val))
            list.add(val);
        }
        
        Collections.sort(list);
        int newSize=list.size();
        if(list.size()>=3){
            System.out.println(list.get(0)+" "+list.get(1)+" "+list.get(2));
            System.out.println(list.get(newSize-3)+" "+list.get(newSize-2)+" "+list.get(newSize-1));
            
        }else {
            System.out.println("Not Possible");
            System.out.println("Not Possible");
        }
        
        
    }
}
