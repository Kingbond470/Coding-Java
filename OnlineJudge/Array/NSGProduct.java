// https://oj.masaischool.com/contest/2215/problem/1
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0; i<n; i++) arr[i]=sc.nextInt();
            
            int prod=1;
            for(int i =0; i<n; i++){
                int val=-1;
                boolean bool=false;
                for(int j=i+1; j<n; j++){
                   
                    if(arr[j]>arr[i]){
                        bool =true;
                        val=j;
                        break;
                    }
                }
                
                if(bool){
                    int nextSmall=-1;
                    for(int k=val+1; k<n; k++){
                        if(arr[k]<arr[val]){
                            nextSmall=arr[k];
                            break;
                        }
                    }
                    prod=prod*nextSmall;
                }else{
                    prod=prod*-1;
                }
                
            }
            
            System.out.println(prod);
        }
    }
}
