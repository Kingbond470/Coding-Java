// https://oj.masaischool.com/contest/2350/problem/1
import java.util.*;
public class Main{
    public static void main(String[] args){
        // user input
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            //int[] arr=new int[n];
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0; i<n; i++) list.add(sc.nextInt());
           System.out.println(largestNum(list)); 
            
        }
    }
    
    // to get the optimize approach - using arraylist
    public static int largestNum(ArrayList<Integer> list){
        int largestNum=-1;
        for(int i=0; i<list.size(); i++){
            if(list.contains(-list.get(i))){
                if(largestNum < Math.abs(list.get(i))) largestNum = Math.abs(list.get(i));
            }
        }
        return largestNum;
    }
    
    
    // to calculate the largest numebr : return the number
    public static int largestNumber(int [] arr){
        int global_number=-1;
        int largestNumber=-1;
        for(int i=0; i<arr.length; i++){
            int max_sum=arr[i];
            for(int j=0; j<arr.length; j++){
                if(arr[i]==-arr[j]){
                    max_sum=arr[i];
                    largestNumber=Math.max(largestNumber,max_sum);
                    if(largestNumber>global_number) global_number=largestNumber;
                }
            }
        }
        
        return global_number;
    }
}
