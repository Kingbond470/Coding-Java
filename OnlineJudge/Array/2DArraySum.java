//Enter code here
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();			//row
    int m=sc.nextInt();			//col
    int s=sc.nextInt(); 		//sum
    int[][] arr=new int[n][m];
    
    for(int i=0; i<n; i++){			//user input
      for(int j=0; j<m; j++){
        arr[i][j]=sc.nextInt();
      }
    }
    
    int count=0;
    
    //row-wise sum
    for(int i=0; i<n-2; i++){
      for(int j=0; j<m-2; j++){
      if(arr[i][j]+arr[i][j+1]+arr[i]+arr[j+2]==s){
        count++;
      }
     }
    }
    
    //col-wise sum
    for(int i=0; i<m-2; i++){
      for(int j=0; j<n-2; j++){
        if(arr[j][i]+arr[j+1][i]+arr[j+2][i]==s){
          count++;
        }
      }
    }
    
    //diagonal from left to right
    for(int i=0, j=0; i<n-2, j<m-2; i++, j++){
      if(arr[i][j]+arr[i+1][j+1]+arr[i+2][j+2]){
        count++;
      }
    }
    
    //diagonal from right to left
    for(int i=m-2, j=0; i>=2, j<n-2; i--, j++){
      if(arr[i][j]+arr[i+1][j+1]+arr[i+2][j+2]){
        count++;
      }
    }
    
    System.out.println(count);
  }
}
    
    
        
