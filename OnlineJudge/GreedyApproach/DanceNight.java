// https://oj.masaischool.com/contest/1966/problem/2
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t!=0) {
      int lenBoys = sc.nextInt();
      int lenGirls = sc.nextInt();
      int[] boys = new int[lenBoys];
      int[] girls = new int[lenGirls];
      
      for(int i=0; i<lenBoys; i++) {
        boys[i] = sc.nextInt();
      }
      for(int i=0; i<lenGirls; i++) {
        girls[i] = sc.nextInt();
      }
      
      if(lenBoys > lenGirls) {
        System.out.println("NO");
        
      } else {
        Arrays.sort(boys);
        Arrays.sort(girls);
        boolean possible = true;
          //2 5 6 8
          //1 3 5 7 9
        for(int i=0; i<lenBoys && possible; i++) {
          if(boys[i]<=girls[i]) {
            possible = false;
          }
        }
        System.out.println(possible?"YES":"NO");
      }
        
      t--;
    }
  }
}
