// https://oj.masaischool.com/contest/1367/problem/3
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int testCase = sc.nextInt();
    for(int t=0; t<testCase; t++) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int x = sc.nextInt();
      int[] ar = new int[n];
      for(int i=0; i<n; i++) ar[i] = sc.nextInt();
      
      int count = 0;
      for(int i=0,j=x-1; j<n; i++,j++) {
        if(check(ar, i, j, k)) count++;
      }
      System.out.println(count);
    }
  }
  public static boolean check(int[] ar, int idx_i, int idx_j, int k) {
    boolean b = true;
    for(int i=idx_i; i<=idx_j; i++) {
      if(ar[i]>k) b = false;
    }
    return b;
  }
}


// Another Approach
/*
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int testCase = sc.nextInt();
    for(int t=0; t<testCase; t++) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int x = sc.nextInt();
      int[] ar = new int[n];
      int sub_count = 0;
      int count = 0;
      for(int i=0; i<n; i++) {
        ar[i] = sc.nextInt();
        if(ar[i]>k) sub_count=0;
        else sub_count++;
        if(sub_count==x) {
          sub_count-=1;
          count++;
        }
      }
      
      System.out.println(count);
    }
  }
}
*/
