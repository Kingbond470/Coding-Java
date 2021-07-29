import java.util.Scanner;
import java.util.ArrayList;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] res=new int[n];
    ArrayList<Integer> arr=new ArrayList<>();
    for(int i=0; i<n; i++) res[i]=sc.nextInt();
    for(int i=0; i<n; i++) arr.add(sc.nextInt());
    
    int count=0;
    for(int i=0; i<n; i++){
      for(int j=0; j<arr.size();){
        if(arr.get(j)==res[i]){
          count++;
          arr.remove(j);
          break;
        }
        else{
          count++;
          j++;
        }
      }
    }
    System.out.println(count-1);
  }
}
