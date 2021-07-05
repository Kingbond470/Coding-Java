//https://oj.masaischool.com/contest/1269/problem/1
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int t=sc.nextInt();
    for(int a=0; a<t; a++){
      //taking user input
      int n=sc.nextInt();
      int[][] arr=new int[n][n];
      
      int top_row=0, bottom_row=n-1, left_col=0, right_col=n-1;
      int count=0, total_count=n*n;
      
      while(count<total_count){
      for(int i=left_col; i<=right_col && count<total_count ; i++){
        arr[top_row][i]=sc.nextInt();
        count++;
      }
      top_row++;
      
      for(int i=top_row; i<=bottom_row && count<total_count; i++){
        arr[i][right_col]=sc.nextInt();
        count++;
      }
      right_col--;
      
     for(int i=right_col; i>=left_col && count<total_count; i--){
       arr[bottom_row][i]=sc.nextInt();
       count++;
     }
     bottom_row--;
      
      for(int i=bottom_row; i>=top_row && count<total_count; i--){
        arr[i][left_col]=sc.nextInt();
        count++;
      }
      left_col++;
      }
      
     
      
      int sum=0;
      for(int i=0; i<n; i++){
        sum=sum+arr[i][i];
      }
      for(int i=0; i<n; i++){
          sum=sum+arr[i][n-i-1];
      }
      if(n%2==1) sum=sum-arr[n/2][n/2];
      System.out.println(sum);
    }//end of test case
  }
}
