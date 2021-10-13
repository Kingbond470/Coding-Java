// https://oj.masaischool.com/contest/1318/problem/2
import java.util.Scanner;
import java.util.HashMap;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int a=0; a<t; a++){
      int n=sc.nextInt();
      int k=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
      }
      
      HashMap<Integer,Integer> map=new HashMap<>();
      boolean value=false;
      for(int i=0; i<n; i++){
        if(map.containsKey(k-arr[i])) {
          value=true;
           break;
          }
        map.put(arr[i],i);
           }
    System.out.println(value? "1":"-1");
           }//end of test case
     }//end of main
 }
