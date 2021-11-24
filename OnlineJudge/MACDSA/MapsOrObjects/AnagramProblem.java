// https://oj.masaischool.com/contest/2407/problem/5
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        
        for(int i=0; i<n; i++){
            arr[i]=sc.next();
        }
        
        ArrayList<String> list=new ArrayList<>();
        HashSet<String> set=new HashSet<>();
        
        for(int i=0; i<arr.length; i++){
            String str=arr[i];
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String res=new String(ch);
            if(!set.contains(res)){
                set.add(res);
                list.add(str);
            }
        }
        
        Collections.sort(list);
        System.out.println(list.size());
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    
    
   
}
