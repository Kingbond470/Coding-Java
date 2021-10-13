// https://oj.masaischool.com/contest/1952/problem/3
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k=sc.nextInt();
    sc.nextLine();
    String arrival_str=sc.nextLine();
    String depart_str=sc.nextLine();
    
    String[] arrival=arrival_str.split(" ");
    String[] depart=depart_str.split(" ");
    
    int[] arr=new int[arrival.length];
    int[] dep=new int[depart.length];
      
    
    for(int i=0; i<arr.length; i++) {
      arr[i] = Integer.parseInt(arrival[i]);
      dep[i] = Integer.parseInt(depart[i]);
    //  System.out.println(dep[i]+" "+arr[i]);
    }
    
    
    int a = 1;
    int d = 0;
    int n=arr.length;
    int count = 1, parkingSlot = 1;
    
    while(a<n && d<n) {
      if(arr[a] < dep[d]) {
        parkingSlot++;
        a++;
        
        if(parkingSlot>count) count = parkingSlot;
        
      } else {
        parkingSlot--;
        d++;
      }
    }
    System.out.println(count<=k?"Possible":"Not Possible");
   
  }
}
