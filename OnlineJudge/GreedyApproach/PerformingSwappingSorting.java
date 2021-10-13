// https://oj.masaischool.com/contest/1966/problem/1
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t!=0) {
      int len = sc.nextInt();
      int swaps = sc.nextInt();
      int[] ar = new int[len];
      for(int i=0; i<len; i++) ar[i] = sc.nextInt();
      
      for(int i=0; i<len; i++) {
        int curr = i;
        for(int j=i+1; j<len; j++){
          if((j-i)>swaps) break;
          if(ar[j]<=ar[curr]) {
            curr = j;
          }
        }
        //Print(ar);
        for(int j=curr; j>i; j--) {
          int temp = ar[j];
          ar[j] = ar[j-1];
          ar[j-1] = temp;
        }
        swaps -= curr-i;
      }
      
      for(int i=0; i<len; i++) {
        System.out.print(ar[i]+" ");
      }
      System.out.println();
      t--;
    }
  }
  private static void Print(int[] ar) {
    for(int i=0; i<ar.length; i++) {
    	System.out.print(ar[i]+" ");
    }
    System.out.println();
  }
}
