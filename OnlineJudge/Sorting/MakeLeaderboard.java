// https://oj.masaischool.com/contest/1403/problem/2
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.nextLine();
    int[] arr=new int[n];
    String[] name=new String[n];
    for(int i=0; i<n; i++){
      name[i]=sc.next();
      arr[i]=sc.nextInt();
     // sc.nextLine();
    }
    
    for(int i=0; i<n; i++){
      for(int j=i; j<n; j++){
		if(arr[i]==arr[j]){
          if(name[i].compareTo(name[j])>0){
            String temp=name[i];
            name[i]=name[j];
            name[j]=temp;
          }
        }
        if(arr[i]<arr[j]){
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          
          String tempstr=name[i];
          name[i]=name[j];
          name[j]=tempstr;
        }
      }
    }
    
    //printing element
    int rank=1, count=1;
    for(int i=0; i<n; i++){
           if(i>0 && arr[i]==arr[i-1]){ 
             System.out.println(rank-count+" "+name[i]);
             count++;
            }
          else{
            count=1;
            System.out.println(i+1+" "+name[i]);
          }
      rank++;
      }
    
    
  }
}
