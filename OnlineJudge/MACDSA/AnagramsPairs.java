import java.util.*;
 public class Main{
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         while(t--!=0){
             int n=sc.nextInt();
            String[] arr=new String[n];
            for(int i=0; i<n; i++){
                 arr[i]=sc.next();
             }
             System.out.println(countAnagramsPairs(arr));
             
         }
     }
     public static int countAnagramsPairs(String[] arr){
         int count=0;
         HashMap<String,Integer> map=new HashMap<>();
             for(int i=0; i<arr.length; i++){
                 char[] ch=arr[i].toCharArray();
                 Arrays.sort(ch);
                 String str=new String(ch);
                 if(map.containsKey(str)){
                     map.put(str,map.get(str)+1);
                 }else map.put(str,1);
             }
             for(Map.Entry<String,Integer> set:map.entrySet()){
                 count = count+(set.getValue()*(set.getValue()-1))/2;
             }
             return count; 
     }
 }
