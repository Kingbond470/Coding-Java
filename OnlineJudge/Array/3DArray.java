// https://oj.masaischool.com/contest/1167/problem/1
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int k=sc.nextInt();
    int[][][] arr=new int[n][m][k];
    
    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        for(int a=0; a<k; a++){
          arr[i][j][a]=sc.nextInt();
        }
      }
    }
    
    //printing the element
    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        for(int a=0; a<k; a++){
          System.out.print(arr[i][j][a]+" ");
        }
        System.out.println();
      }
    }
    
  }
}
