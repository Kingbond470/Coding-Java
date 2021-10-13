// https://oj.masaischool.com/contest/1937/problem/2
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr={1,2,5,10,20,50,100,500,1000};
    for(int a=0; a<n; a++){
      int number=sc.nextInt();
      int count=0; 
      for(int i=arr.length-1; i>=0; i--){
      //  System.out.println(number);
        if(number>=arr[i]){
        //number=number-arr[i];
         // count++;
          while(number>=arr[i]){
            count++;
            number=number-arr[i];
                 //   System.out.print(number+" ");

          }
        }
      }
      System.out.println(count);
    }
  }
}
