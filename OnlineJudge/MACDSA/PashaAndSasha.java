// https://oj.masaischool.com/contest/2350/problem/5
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            String pasha=sc.next();
            String sasha=sc.next();
            
            System.out.println(validAnagram(pasha,sasha)?"True":"False");
            
        }
    }
    
    
    public static boolean validAnagram(String pasha, String sasha){
 
        if(pasha.length()!=sasha.length()) return false;
        char[] cPasha=pasha.toCharArray();
        char[] cSasha=sasha.toCharArray();
        Arrays.sort(cPasha);
        Arrays.sort(cSasha);
        
        for(int i=0; i<cPasha.length; i++){
            if(cPasha[i]!=cSasha[i]) return false;
        }
        return true;
        
    }
}
