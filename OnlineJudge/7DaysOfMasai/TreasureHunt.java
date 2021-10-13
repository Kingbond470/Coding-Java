// https://codemas.masaischool.com/contest/3/problem/04
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int a=0; a<t; a++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] arr=new int[n][m];
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            
            int row = 0;
            int col = 0;
            int tot = arr[row][col];
            while(row < n-1 || col<m-1 ){
                
                
                if(row < n-1 && col<m-1){
                    int time1 = 1+arr[row][col+1];
                    int time2 = 2+arr[row+1][col];
                    if(time1<time2){
                        tot+=time1;
                        col++;
                    } else if(time1>time2){
                        tot+=time2;
                        row++;
                    }else{
                        if(arr[row][col+1]<arr[row+1][col]){
                            tot+=time1;
                            col++;
                        }else{
                            tot+=time2;
                            row++;
                        }
                    }
                }else if(row == n-1 && col<m-1){
                    int time1 = 1+arr[row][col+1];
                    tot+=time1;
                    col++;
                }else{
                    int time2 = 2+arr[row+1][col];
                    tot+=time2;
                    row++;
                }
                
            }
            
             System.out.println(tot);
          
            
        }
    }
    
   
    
   
}
