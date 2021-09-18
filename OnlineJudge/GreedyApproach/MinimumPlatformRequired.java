// https://oj.masaischool.com/contest/1937/problem/3
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    int[] depart=new int[n];
    
    for(int i=0; i<n; i++){
      String str=sc.next();
      str = str.replace(":","");
      //System.out.print(str+" ");
      arr[i] = Integer.parseInt(str);
    }
    for(int i=0; i<n; i++){
        String str=sc.next();
        str = str.replace(":","");
       // System.out.print(str+" ");
       depart[i] = Integer.parseInt(str);
    }
    //Arrays.sort(arr);
    //Arrays.sort(depart);
    //for(int i=0; i<n; i++) {
      //System.out.println(arr[i] + " " + depart[i]);
    //}
    int a = 1;
    int d = 0;
    
    int count = 1, platforms = 1;
    
    while(a<n && d<n) {
      if(arr[a] < depart[d]) {
        platforms++;
        a++;
        
        if(platforms>count) count = platforms;
        
      } else {
        platforms--;
        d++;
      }
    }
    System.out.println(count);
  }
}

// partial accepted 3/4
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int[][] arr = new int[len][2];
    int[][] depart = new int[len][2];
    for(int i=0; i<len; i++) {
      String str = sc.next();
      //System.out.println(str);
      String[] temp = str.split(":");
      arr[i][0] = Integer.parseInt(temp[0]);
      arr[i][1] = Integer.parseInt(temp[1]);
      //System.out.println(arr[i][0]+" " + arr[i][1]);
    }
    for(int i=0; i<len; i++) {
      String str = sc.next();
      String[] temp = str.split(":");
      depart[i][0] = Integer.parseInt(temp[0]);
      depart[i][1] = Integer.parseInt(temp[1]);
      //System.out.println(depart[i][0]+" " + depart[i][1]);
    }
    int platforms = 1;
    int maxPlatformCount = 1;
    int arrivalTime = 0;
    int departTime = 0;
              /*
          9:00 9:40 9:50 11:00 15:00 18:00
          9:10 12:00 11:20 11:30 19:00 20:00
    */
    for(int i=0; i<len-1; i++) {
      if(depart[i][0]==arr[i+1][0]) {
        if(depart[i][1]>arr[i+1][1]) {
          platforms++;
          maxPlatformCount=Math.max(maxPlatformCount, platforms);
        }
      } else if(depart[i][0]>arr[i+1][0]) {
        //System.out.println("2nd"+platforms);
        platforms++;
        maxPlatformCount=Math.max(maxPlatformCount, platforms);
      } else if(depart[i][0]<arr[i+1][0]) {
        if(platforms>1) platforms--;
      }
    }
    System.out.println(maxPlatformCount);
  }
}
