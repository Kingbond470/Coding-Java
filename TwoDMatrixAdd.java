//Enter code here
//Given 2 matrix , find and print the matrix which is the sum of both the matrix. If they cannot be added together output -1


//Note: 2 matrix can only be added if both of them have same number of rows and same number of columns
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int r1=sc.nextInt();
    int c1=sc.nextInt();
    int r2=sc.nextInt();
    int c2=sc.nextInt();
    
    int[][] A=new int[r1][c1];
    int[][] B=new int[r2][c2];
    int[][] C=new int[r1][c1];
    
    for(int i=0; i<r1; i++){
      for(int j=0; j<c1; j++){
        A[i][j]=sc.nextInt();
      }
    }
   
    // second matrix input
    for(int a=0; a<r2; a++){
      for(int b=0; b<c2; b++){
        B[a][b]=sc.nextInt();
      }
    }
    
    if(r1==r2 &&c1==c2){
      for(int c=0; c<r1; c++){
        for(int d=0; d<c1; d++){
          C[c][d]=A[c][d]+B[c][d];
          System.out.print(C[c][d]+" ");
        }
        System.out.println();
      }
    }
    else{
      System.out.println("-1");
    }
    
  }
}
    
    
