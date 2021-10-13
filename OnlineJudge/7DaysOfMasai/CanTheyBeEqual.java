import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int a=0; a<t; a++){
            int len=sc.nextInt();
            String str=sc.next();
            String res=sc.next();
            
            // HashMap<Character, Integer> strmap=new HashMap<>();
            // HashMap<Character, Integer> resmap=new HashMap<>(); 
            
            // for(int i=0; i<n; i++){
            //     if(strmap.containsKey(str.charAt(i))){
            //         int val=strmap.get(str.charAt(i));
            //         strmap.put(str.charAt(i), ++val);
            //     }else{
            //         strmap.put(str.charAt(i), 1);
            //     } 
            // }
            
            
            // for(int i=0; i<n; i++){
            //     if(resmap.containsKey(res.charAt(i))){
            //         int val=resmap.get(res.charAt(i));
            //         resmap.put(res.charAt(i), ++val);
            //     }else{
            //         resmap.put(res.charAt(i), 1);
            //     } 
            // }
            char[] ar=str.toCharArray();
            char[] arr=res.toCharArray();
            
            Arrays.sort(arr);
            Arrays.sort(ar);
            
            boolean val=true;
            for(int i=0; i<len; i++){
                if(ar[i]!=arr[i]){
                    val =false; 
                    break;
                }
            }
            
            System.out.println(val?"Yes":"No");
            
            
        }
    }
}
