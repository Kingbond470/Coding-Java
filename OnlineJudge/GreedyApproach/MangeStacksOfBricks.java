// https://oj.masaischool.com/contest/1952/problem/2
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t--!=0) {
      int n=sc.nextInt();
      int x=sc.nextInt();
      int y=sc.nextInt();
      int[] ai=new int[n];
      int[] bi=new int[n];
      
      for(int i=0; i<n; i++){
        ai[i]=sc.nextInt();
        bi[i]=sc.nextInt();
        //System.out.println(ai[i]+ " "+bi[i]);
      }
      Arrays.sort(ai);
      Arrays.sort(bi);
      int effort = 0;
      for(int i=0; i<n; i++){
        if(bi[i]>ai[i]) {
          effort += (bi[i] - ai[i])*x;
        }
        else if (bi[i]<ai[i]) {
          effort += (ai[i] - bi[i])*y;
        }
      }
      System.out.println(effort);
    }   
  }
}
