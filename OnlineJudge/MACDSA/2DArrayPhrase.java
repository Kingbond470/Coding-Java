// https://oj.masaischool.com/contest/2350/problem/6
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();			
    int m=sc.nextInt();			
    String s="saba"; 		
    char[][] arr=new char[n][m];
	sc.nextLine();
    for(int i=0; i<n; i++){
    String value=sc.nextLine();
    
    for(int j=0; j<m; j++){
       arr[i][j]=value.charAt(j);
     }
   }

    int count=0;
    String add="";
    for(int i=0; i<n; i++){
      for(int j=0; j<m-3; j++){
        add=add+arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i][j+3];
        if(add.equals(s)){
          count++;
          add="";
        }
        else {
          add="";
        }
      }
    }
    
      for(int i=0; i<m; i++){
      for(int j=0; j<n-3; j++){
        add=add+arr[j][i]+arr[j+1][i]+arr[j+2][i]+arr[j+3][i];
        if(add.equals(s)){
          count++;
          add="";
        }
        else {
          add="";
        }
      }
      }
        
    for(int i=0; i<n; i++){
      for(int j=0; j<m-3; j++){
        if(i<n-3){
          add=add+arr[i][j]+arr[i+1][j+1]+arr[i+2][j+2]+arr[i+3][j+3];
          if(add.equals(s)){
            count++;
            add="";
            }
          else{
            add="";
          } 
        }
      }
    }
        
    for(int i=0; i<n; i++){
      for(int j=0; j<m-3; j++){
       	if(i>2){
          add=add+arr[i][j]+arr[i-1][j+1]+arr[i-2][j+2]+arr[i-3][j+3];
          if(add.equals(s)){
            count++;
            add="";
          }
          else{
            add="";
          }
        }
      }
    }
        
     
    
   System.out.println(count);
  }
}
